package oops2;

public class UseBike {
	public static void main(String[] args) {
		Bike b = new Bike();
		b.brand = "Yamaha";
		
		System.out.println("Vehicle Type = "+b.findVehicleType(2)+", Bike Brand = "+b.brand+", "+ b.findmileage(78)+", "+b.findNetPrice(300000, 30, 10));
		
	}

}



class Vehicle {
	public String findVehicleType(int wheels) {
		if(wheels == 2) {
			return "Bike";
		}
		else if(wheels == 3) {
			return "Auto";
		}
		else if(wheels == 4) {
			return "Car";
		}
		else if(wheels >4 && wheels <= 10) {
			return "Lorry";
		}
		else {
			return "MisMatch";
		}
	}
}



class Bike extends Vehicle {
	String brand;

	public String findNetPrice(int price, int tax, int discount) {
		return "The Net Price is " + (price + (price * tax / 100)-(price * discount / 100));
	}

	public String findmileage(int speed) {
		if (speed > 0 && speed <= 30) {
			return "Mileage is " + 60;
		} 
		else if (speed > 30 && speed <= 50) {
			return "Mileage is " + 50;
		} 
		else if (speed > 50 && speed <= 80) {
			return "Mileage is " + 40;
		} 
		else if (speed > 80 && speed <= 100) {
			return "Mileage is " + 20;
		} 
		else {
			return "Mileage is " + 20;
		}
	}
}
