





// LE approach
interface SQUARE{
	int square(int n);
}
interface SUM{
	int sum(int a,int b);
}

//NORMAL approach
class calc implements SQUARE{
	public int square(int n) {
		return n*n;
	}
}
class calcc implements SUM{
	public int sum(int a, int b) {
		return a+b;
	}
}

public class LambdaInterface {
	public static void main(String[] args) {
//		Normal approach
		calc c = new calc();
		System.out.println(c.square(4));
//		Lambda Expression Approach
		SQUARE f = n->n*n;
		System.out.println(f.square(2));
		
//		NOrmal Approach
		calcc ca = new calcc();
		System.out.println(ca.sum(1, 2));
//		LE approach
		SUM s = (a,b) -> a+b;
		System.out.println(s.sum(1,2));
	}
}
