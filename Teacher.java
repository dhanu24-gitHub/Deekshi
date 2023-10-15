package oops2;
//Single Inheritance:

public class Teacher extends Human {
	int salary;
	public String workingHrs(int spleepingHrs, int eatingHrs, int idleHrs) {
		return "Working Hours = "+ (24 - (spleepingHrs + eatingHrs + idleHrs));
	}
}
