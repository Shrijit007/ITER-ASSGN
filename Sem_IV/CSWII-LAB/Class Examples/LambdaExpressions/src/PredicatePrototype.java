import java.util.function.Predicate;

public class PredicatePrototype {
	public static void main(String[] args) {
		//predefined function that takes single input and checks condition
		Predicate<Integer> p = i->i%2==0;
		System.out.println("3 is even: "+p.test(3));
	}
}
