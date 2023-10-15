package oops2;
 
public class InHeritUseEngStudent {
	public static void main(String[] args) {
		EngineeringStudent e = new EngineeringStudent("Deekshi", 2406, "B.Com", 450);
		System.out.println("Name = "+ e.getName()+", Roll No = "+e.getRollNo()+", Department = "+e.getDpmt()+", Total Marks = "+e.getMarks());
	}

}


class Student {
	private String name;
	private int roll_No;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setRollNo(int roll_No) {
		this.roll_No =  roll_No;
	}
	
	public int getRollNo() {
		return roll_No;
	}
	
	public Student(String name, int roll_No) {
		this.name = name;
		this.roll_No = roll_No;
	}
	
}


class EngineeringStudent extends Student {
	public EngineeringStudent(String name, int roll_No, String dpmt, int totalMarks) {
		super(name, roll_No);
		this.dpmt = dpmt;
		this.totalMarks = totalMarks;
	}

	private String dpmt;
	private int totalMarks;
	
	public void setDpmt(String dpmt) {
		this.dpmt = dpmt;
	}
	
	public String getDpmt() {
		return dpmt;
	}
	
	public void setmarks(int totMarks) {
		this.totalMarks = totMarks;
	}
	
	public int getMarks() {
		return totalMarks;
	}
}
