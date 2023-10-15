package oops2;

public class SuperUseComStudent {
	public static void main(String[] args) {
		ComStudent c = new ComStudent("Deekshi", 2406, "Commerce", 3);
		
		//System.out.println("NAME = "+c.getName()+", ROLL NO = "+c.getRollNo()+", DEPARTMENT = "+c.getDpmt()+", YEARS = "+c.getYrs());
		
		System.out.println(c);
	}

}


class Student1 {
	private String name;
	private int rollNo;
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	
	public Student1(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}
	
	public String toString() {
		return "Name = "+ name + ", Roll No = "+rollNo;
	}
}


class ComStudent extends Student1 {
	public ComStudent(String name, int rollNo, String dpmt, int yrs) {
		super(name, rollNo);
		this.dpmt = dpmt;
		this.yrs = yrs;
	}
	
	private String dpmt;
	private int yrs;
	
	public void setDpmt(String dpmt) {
		this.dpmt = dpmt;
	}
	
	public String getDpmt() {
		return dpmt;
	} 
	
	public void setYrs(int yrs) {
		this.yrs = yrs;
	}
	
	public int getYrs() {
		return yrs;
	}
	
	public String toString() {
		return super.toString()+", Department = "+dpmt+", Years = "+yrs;
	}
}
