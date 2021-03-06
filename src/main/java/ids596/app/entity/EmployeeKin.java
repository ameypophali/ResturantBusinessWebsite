package ids596.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/*
   {  
      "employeeKinId":10,
      "parentEmployee":{  
         "employeeID":9,
         "ssn":"234-085-9090",
         "firstName":"Amey",
         "lastName":"Pophali",
         "dateOfBirth":"1989-05-29",
         "jobTitle":"Intern",
         "joiningDate":"2011-06-06",
         "salary":1,
         "aptNo":"2A",
         "streetName":"1444 Taylor Street",
         "city":"Chicgo",
         "zipCode":"60607"
      },
      "firstName":"Vibha",
      "lastName":"Pophali",
      "streetAddress":"Lakshmi Parisar",
      "cityAddress":"Bhopal",
      "zipCode":"482009"
   }
 */

@Entity
@Table(name="Employee_Kin")
public class EmployeeKin {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="kin_id", unique=true)
	@NotNull
	private long employeeKinId;
	
	//the field tracks employees to their kin
	@ManyToOne
	@JoinColumn(name = "employee_id")
	private Employee parentEmployee;
	
	@NotNull
	@Column(name="first_name")
	private String firstName;
	
	@NotNull
	@Column(name="last_name")
	private String lastName;
	
	@NotNull
	@Column(name="street_name")
	private String streetAddress;
	
	@NotNull
	@Column(name="city")
	private String cityAddress;
	
	@NotNull
	@Column(name="zipcode")
	private String zipCode;
	
	protected EmployeeKin() {
	}
	
	protected EmployeeKin(Employee parentEmployeeId, String firstName, String lastName, String streetAddress,
			String cityAddress, String zipCode) {
		super();
		this.parentEmployee = parentEmployeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.streetAddress = streetAddress;
		this.cityAddress = cityAddress;
		this.zipCode = zipCode;
	}

	public long getEmployeeKinId() {
		return employeeKinId;
	}

	public void setEmployeeKinId(long employeeKinId) {
		this.employeeKinId = employeeKinId;
	}

	public Employee getParentEmployee() {
		return parentEmployee;
	}

	public void setParentEmployee(Employee parentEmployee) {
		this.parentEmployee = parentEmployee;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getCityAddress() {
		return cityAddress;
	}

	public void setCityAddress(String cityAddress) {
		this.cityAddress = cityAddress;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "EmployeeKin [employeeKinId=" + employeeKinId + ", parentEmployee=" + parentEmployee + ", firstName="
				+ firstName + ", lastName=" + lastName + ", streetAddress=" + streetAddress + ", cityAddress="
				+ cityAddress + ", zipCode=" + zipCode + "]";
	}

	
	
}
