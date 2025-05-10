
import java.util.function.Predicate;

public class PredicateArray {
	public static void main(String[] args) {
		Predicate<Integer> p1 = n -> n%2 == 0;
		Predicate<Integer> p2 = n -> n>45;
		int arr[] = {12,42,12,33,45,48,100};
		for(int i : arr) {
			if(p1.and(p2).test(i)) 
				System.out.println(i+" is even & >45");
			else if(p1.or(p2).test(i))
				System.out.println(i+" is either even or >45");
			else if(!p1.test(i))
				System.out.println(i+" is odd");
		}
	}
}
