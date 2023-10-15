package oops2;

public class Poly_OverRiding {
	public static void main(String[] args) {
		Axis a = new Axis();
		System.out.println(a.interest(50000));
	}

}


class RBI {
	public String interest(int amount) {
		return "Tax Amount = "+ (amount * 8)/100;
	}
}


class Axis extends RBI {
	public String interest(int amount) {
		return "Tax Amount = "+ (amount * 10)/100;
	}
}
