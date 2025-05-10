import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaEG {
	public static void main(String[] args) {
		Function<Integer,Integer> f = n -> n*n;
		System.out.println(f.apply(4));
		
		Predicate<Integer> p = i -> i%2 == 0;
		System.out.println("10 is even: "+p.test(10));
	}
}


/* 
Lambda expressions properties
- no name
- no return type
- no modifier 
*/

/* 

*/