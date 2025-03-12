package gto;

public class MyClass {

	public static void main(String[] args) {
		// obj.3
		Bike1 bike1 = new Bike1();
		bike1.company = "Hero Honda";
		bike1.model = "Splendor";
		bike1.mileage = 54.8;

		Bike1 bike2 = new Bike1();
		bike2.company = "Yamaha";
		bike2.model = "RX100";
		bike2.mileage = 65.0;

		bike2 = bike1;
		bike1 = bike2;

		System.out.println(bike1.company + "'s " + bike1.model + " gives a mileage of " + bike1.mileage + "kmpl.");
		System.out.println(bike2.company + "'s " + bike2.model + " gives a mileage of " + bike2.mileage + "kmpl.");
	}
}

class Bike1 {
	String company;
	String model;
	int cc;
	double mileage;
	boolean diskBrakes;
}
