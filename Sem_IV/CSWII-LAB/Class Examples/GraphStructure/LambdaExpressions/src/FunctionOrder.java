import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.Random;

public class FunctionOrder {
	public static Function<Integer,Integer> getSquare() {
		return n->n*n;
	}
	public static Function<String,Integer> getLength(){
		return s->s.length();
	}
	public static Predicate<Integer> oddOrEven(){
		return n->n%2==0;
	}
	public static Consumer<String> getUpperCase(){
		return s->System.out.println(s.toUpperCase());
	}
	public static Supplier<Integer> getOTP(){
		return ()->1000+new Random().nextInt(8999);
	}
	
	public static void main(String[] args) {
		//higher order function
		Function<Integer,Integer> SquareFunc = getSquare();
		System.out.println(SquareFunc.apply(3));
		
		Function<String,Integer> lenFunc = getLength();
		System.out.println(lenFunc.apply("trala lelo trala lala"));
		
		Predicate<Integer> checkNum = oddOrEven();
		System.out.println(checkNum.test(3));
		
		Consumer<String> UpperCase = getUpperCase();
		UpperCase.accept("bombadilo crocodilo");
		
		Supplier<Integer> OTP = getOTP();
		System.out.println(OTP.get());
	}
}
