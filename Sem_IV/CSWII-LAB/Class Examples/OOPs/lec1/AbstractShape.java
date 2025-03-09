package com.csw2.lec1;

abstract class shape {
	abstract void draw();
}

class rectangle extends shape {
	void draw() {
		System.out.println("Draw a rectangle 🟧");
	}
}

class circle extends shape {
	void draw() {
		System.out.println("Draw a circle 🔴");
	}
}

abstract class banks {
	abstract int getROI();
}

class SBI extends banks {
	int getROI() {
		return 7;
	}
}

class PNB extends banks {
	int getROI() {
		return 8;
	}
}

public class AbstractShape {
	public static void main(String[] args) {
		shape r = new rectangle();
		r.draw();
		shape c = new circle();
		c.draw();
		
		SBI s = new SBI();
		System.out.println("SBI: "+ s.getROI());
		PNB p = new PNB();
		System.out.println("PNB: "+ p.getROI());
		
	}
}
