package chap11;

//beginning of Employee class
public class Employee {
	// declare the firstName, lastName, and phoneNumber properties
	// they're private and they're String variables
	private String firstName;
	private String lastName;
	private String phoneNumber;

	// no argument constructor (first constructor)
	Employee() {
	}// end of constructor

	// overloaded constructor
	Employee(String firstName, String lastName, String phoneNumber) {
		this.firstName = firstName;// set the firstName property
		this.lastName = lastName;// set the lastName property
		this.phoneNumber = phoneNumber;// set the phoneNumber property
	}// end of overloaded constructor

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}// end of getter method

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}// end of setter method

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}// end of getter method

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}// end of setter method

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}// end of getter method

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}// end of setter method

	@Override
	public String toString() {
		// return the firstName, lastName, and phoneNumber of the Employee.
		return " \n" + this.firstName + " " + this.lastName + " \n\t" + this.phoneNumber + "\n ";
	}// end of toString method

}
