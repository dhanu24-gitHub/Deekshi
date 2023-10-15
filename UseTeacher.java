package oops2;
//Single inheritance:

public class UseTeacher {
	public static void main(String[] args) {
		Teacher t = new Teacher();
		t.name = "Deekshi";
		t.age = 23;
		t.gender = "Female";
		t.salary = 50000;
		
		//System.out.println("Name = "+t.name+" Age = "+t.age+" Geander = "+t.gender+" Salary = "+t.salary+" Sleeping Hrs = "+t.sleeping_hrs(8)+" Eating Hrs = "+t.eating_hrs(3)+" Working Hrs = "+t.workingHrs(9));
		System.out.println(t.eating_hrs(9, 8, 4));
		System.out.println(t.sleeping_hrs(9, 3, 4));
		System.out.println(t.workingHrs(8, 3, 4));
	}

}
 