package GenericsTutorial;

class Calculator<T extends Number>{
	private T num1, num2;

	public Calculator(T num1, T num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void call() {
		System.out.println(num1.doubleValue()+num2.doubleValue());
		System.out.println(num1.doubleValue()-num2.doubleValue());
	}
}

public class BoundedType {
	public static void main(String[] args) {
		Calculator<Integer> c1 = new Calculator<Integer>(12, 13);
		c1.call();
		Calculator<Double> c2 = new Calculator<Double>(12.2, 13.8);
		c2.call();
		Calculator<Float> c3 = new Calculator<Float>(12F, 13F);
		c3.call();
//		Calculator<String> c2 = new Calculator<String>("ss","sdsd");a
//		c1.call();
	}
}
