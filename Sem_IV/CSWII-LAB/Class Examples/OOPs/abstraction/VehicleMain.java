package com.csw2.abstraction;

abstract class Vehicle{
	public abstract int getWheelsCount();
	public void display() {
		System.out.println("Abstract class Vehicle");
	}
}

abstract class bike extends Vehicle{
	public int getWheelsCount() {
		return 2;
	}
	public abstract void display();
}

class bicycle extends bike{
	public void display() {
		System.out.println("Bicycle child class of abstract bike");
	}
}

class car extends Vehicle{
	public int getWheelsCount() {
		return 4;
	}
}

class truck extends Vehicle{
	public int getWheelsCount() {
		return 10;
	}
}

public class VehicleMain {

	public static void main(String[] args) {
		Vehicle b = new bicycle();
		b.display();
		System.out.println("Bicycle wheels: " + b.getWheelsCount());
		car c = new car();
		c.display();
		System.out.println("Car wheels: " + c.getWheelsCount());
	}

}
