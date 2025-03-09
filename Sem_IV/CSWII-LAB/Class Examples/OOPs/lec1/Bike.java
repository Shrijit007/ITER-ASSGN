package com.csw2.lec1;

abstract class bikee{
	bikee(){
		System.out.println("Bike created");
	}
	abstract void run();
	void changeGear() {
		System.out.println("Gear Changed");
	}
}

class Yamahama extends bikee{
	void run() {
		System.out.println("Running Safely");
	}
}

public class Bike {
	public static void main(String[] args) {
		bikee b = new Yamahama();
		b.run();
		b.changeGear();
	}
}
