/* Westley W Williams
 *  CIS 2212-800 Java I FlexPace
 *  Assignment - LAB 09 - INHERITANCE AND POLYMORPHISM
 *  Started March 19, 2021
 */
//this package is assigned chap11 by assignment requirement
package chap11;

//import two libraries below, ArrayList and Scanner
import java.util.ArrayList;
import java.util.Scanner;

//the main class, MainDriver, holds the main method
public class MainDriver {

	// main method, which will print, take input, and create various objects.
	public static void main(String[] args) {
		// create a scanner
		Scanner mainScanner = new Scanner(System.in);
		// output "Employee's First Name: " to the screen for the user
		System.out.print("Employee's First Name: ");
		// accept input from the user and store in firstName variable
		String firstName = mainScanner.nextLine();
		// print to the screen
		System.out.print("Employee's Last Name: ");
		// accept data from user into lastName variable
		String lastName = mainScanner.nextLine();
		// output to the screen
		System.out.print("Employee's Phone Number (937-555-1212): ");
		// input
		String phoneNumber = mainScanner.nextLine();
		// output
		System.out.print("Employee Shift (1=day, 2=night): ");
		// input
		int employeeShift = mainScanner.nextInt();
		// output
		System.out.print("Pay earned per hour: ");
		// input
		double payRatePerHour = mainScanner.nextDouble();
		// output
		System.out.print("Hours worked this period: ");
		// input. We will use all the input variables in just a few (give or take) more
		// lines.
		double hoursWorked = mainScanner.nextDouble();

		// let's create an object called "firstShiftWorker" this is not the last object
		// that we will create
		ShiftWorker firstShiftWorker = new ShiftWorker();
		// let's initialize firstShiftWorker with the getter and setter methods
		firstShiftWorker.setFirstName(firstName);// set method
		firstShiftWorker.setLastName(lastName);// set method
		firstShiftWorker.setPhoneNumber(phoneNumber);// set method
		firstShiftWorker.setEmployeeShift(employeeShift);// set method
		firstShiftWorker.setPayRatePerHour(payRatePerHour);// set method
		firstShiftWorker.setHoursWorked(hoursWorked);// set method

		// below, I used three shift worker objects. I used one shift worker from
		// Dayton, one shift worker from Detroit, and one from San Jose.
		// just be sure, since we want to use the overloaded constructor to initiate it
		// just be sure that we input the parameters of
		// firstName, lastName, phoneNumber,
		// payRatePerHour, hoursWorked, employeeShift
		// the employee shift is one in this case, which means the shift is day shift.
		ShiftWorker daytonShiftWorker = new ShiftWorker("Westley", "Williams", "937-578-1212", 15.0, 40.0, 1);

		// Notice how I'm using polymorphism in the below cases.
		// those two below objects, detroitShiftWorker and sanJoseShiftWorker have a
		// declared type
		// of Employee and an actual type of ShiftWorker.
		Employee detroitShiftWorker = new ShiftWorker("Marshall", "Johnson", "313-123-1122", 12.0, 50.0, 2);
		// the second object created using polymorphism (the declared type is Employee
		// and the actual type is ShiftWorker)
		Employee sanJoseShiftWorker = new ShiftWorker("Steve", "Liston", "408-331-2323", 20.0, 35.0, 1);

		// let's create an array list that holds objects of the ShiftWorker type
		// now, we will have to cast the declared type from Employee to ShiftWorker for
		// two objects
		// those two objects where we need to shift the declared type are:
		// detroitShiftWorker and sanJoseShiftWorker
		ArrayList<ShiftWorker> employeeList = new ArrayList<ShiftWorker>();

		// let's add firstShiftWorker and daytonShiftWorker to the employeeList variable
		employeeList.add(firstShiftWorker);
		employeeList.add(daytonShiftWorker);
		// and as we discussed above, we will cast detroitShiftWorker into the
		// ShiftWorker type
		// rather than Employee type as we had it.
		// we will call it detroitShiftWorkerCasting
		ShiftWorker detroitShiftWorkerCasting = (ShiftWorker) detroitShiftWorker;
		// NOW we can add this worker to the employeeList variable
		employeeList.add(detroitShiftWorkerCasting);
		// cast the sanJoseShiftWorker to the ShiftWorker type
		// it was of Employee type
		// call it sanJoseShiftWorkerCasting
		ShiftWorker sanJoseShiftWorkerCasting = (ShiftWorker) sanJoseShiftWorker;
		// add it to employeeList
		employeeList.add(sanJoseShiftWorkerCasting);

		// print these objects. I basically looped through the list, listing every
		// object in that list
		// I did use the methods of size and get.
		// the descriptions of these methods can be found online at the Oracle Help
		// Center
		// https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
		System.out.println("\nEmployee List contains " + employeeList.size() + " elements: ");
		for (int i = 0; i < employeeList.size(); i++) {
			System.out.println(employeeList.get(i));
		} // end of for loop

	}// end of main method

}// end of MainDriver class
