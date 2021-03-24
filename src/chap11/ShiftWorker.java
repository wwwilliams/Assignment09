package chap11;

//extending the Employee class, which will give us firstName, lastName, and phoneNumber as additional properties in this class
public class ShiftWorker extends Employee {
	private double payRatePerHour;// pay rate is 1.5 times the pay rate when on night shift
	private double hoursWorked;// the hours worked in a period
	private int employeeShift; // day shift = 1, night shift = 2

	// first constructor (no argument constructor)
	ShiftWorker() {
		super();// no argument constructor of the super class called
	}// end of first constructor

	// overloaded constructor available in this class
	// firstName, lastName, phoneNumber, payRatePerHour, hoursWorked, employeeShift
	// parameters required when initiating
	// using this constructor
	ShiftWorker(String firstName, String lastName, String phoneNumber, double payRatePerHour, double hoursWorked,
			int employeeShift) {
		// call the constructor of the Employee class using the super method.
		super(firstName, lastName, phoneNumber);
		// set the payRatePerHour property
		this.payRatePerHour = payRatePerHour;
		// set the hoursWorked property
		this.hoursWorked = hoursWorked;
		// set the employeeShift property
		this.employeeShift = employeeShift;
	}// end of second constructor

	// the below getter and setter methods were auto generated
	// auto generated using the source tab, and "generate getters and setters"
	/**
	 * @return the payRatePerHour get payRatePerHour
	 */
	public double getPayRatePerHour() {
		return payRatePerHour;
	}// end of getter method

	/**
	 * @param payRatePerHour the payRatePerHour to set set payRatePerHour
	 */
	public void setPayRatePerHour(double payRatePerHour) {
		this.payRatePerHour = payRatePerHour;
	}// end of setter method

	/**
	 * @return the hoursWorked get hoursWorked
	 */
	public double getHoursWorked() {
		return hoursWorked;
	}// end of getter method

	/**
	 * @param hoursWorked the hoursWorked to set set hoursWorked
	 */
	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}// end of setter method

	/**
	 * @return the employeeShift get employeeShift
	 */
	public int getEmployeeShift() {
		return employeeShift;
	}// end of getter method

	/**
	 * @param employeeShift the employeeShift to set set employeeShift
	 */
	public void setEmployeeShift(int employeeShift) {
		this.employeeShift = employeeShift;
	}// end of setter method

	// this method calculates the total pay for the period
	public double calculateTotalPay() {
		// initialize the shiftDifferential to 1
		// shiftDifferential = 1 is the same as saying that employee
		// is not getting paid time and a half
		double shiftDifferential = 1;
		// if the employeeShift is 2, then the worker is working at night shift
		if (employeeShift == 2) {
			// if the worker is working at night, they are getting paid time and a half
			// time and a half = 1.5
			shiftDifferential = 1.5;
		}
		// calculate the total pay by
		// multiplying the rate by the shift differential by hours worked in a pay
		// period
		double totalPay = this.payRatePerHour * shiftDifferential * this.hoursWorked;
		return totalPay;// return the total pay
	}// end of calculateTotalPay method

	@Override
	public String toString() {

		// I created two strings, str1 and str2, and added them later
		// formated with dollar signs and decimal places (pay rate set at 2 places right
		// of the decimal)
		String str1 = String.format("\n\tPay Rate Per Hour: $%,.2f \n\tHours Worked: %.2f \n\tTotal Pay: $%.2f",
				payRatePerHour, hoursWorked, calculateTotalPay());
		// create str2
		String str2 = super.toString() // using the toString method in the super class per the assignment instructions
				+ " \tEmployee Shift: " + employeeShift + " ";
		// return str2 + str1 in that order
		return str2 + str1;
	}// end of toString override

}// end of ShiftWorker class
