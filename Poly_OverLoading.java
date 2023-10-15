package oops2;

public class Poly_OverLoading {
	public static void main (String[] args) {
		Calculator c = new Calculator();
		System.out.println(c.add(36.78f, 489.6f, 57, 86));
		
		
	}
 
}


class Calculator {
	public String add(int a, int b) {
		return "Answer = "+ (a + b);
	}
	
	public String add(int a, int b, int c) {
		return "Answer = "+ (a + b + c);
	}
	
	public String add(int a, float b, float c) {
		return "Answer = "+ (a + b + c);
	}
	
	public String add(float a, float b, int c, int d) {
		return "Answer = "+ (a + b + c + d);
	}
	
}
