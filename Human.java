package oops2;
//Single Inheritance:

public class Human {
	String name;
	int age;
	String gender;
	
	public String sleeping_hrs(int workingHrs, int eatingHrs, int idleHrs) {
		System.out.println("TTTTTTTTTTTTTTTTTTTTTTTTTTT");
		return "Sleeping Hours = "+ (24 - (workingHrs + eatingHrs + idleHrs));
	}
	
	public String eating_hrs(int workingHrs, int sleepingHrs, int idleHrs) {
		return "Eating Hours = "+ (24 - (workingHrs + sleepingHrs + idleHrs));
	} 

}
