interface inf {
	void sum(int a,int b);
}
public class InlineLambdaMethods {
	public static void main(String[] args) {
		inf f = (a,b) -> {
			System.out.println("Sum: " + (a+b));
		};
		f.sum(2, 4);
	}
}
