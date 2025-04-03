package GenericsTutorial;

import java.util.ArrayList;
import java.util.Arrays;

public class WildcardChar<T> {
	public static void displayArray(ArrayList<?> l) {
		System.out.println(l);
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<Integer>(Arrays.asList(1,3,2,2,4));
		displayArray(l1);
		ArrayList<String> l2 = new ArrayList<String>(Arrays.asList("sda","as"));
		displayArray(l2);
	}
}
