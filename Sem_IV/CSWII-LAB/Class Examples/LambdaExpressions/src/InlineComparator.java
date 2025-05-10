import java.util.*;

public class InlineComparator {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		list.add(6);
		list.add(9);
		list.add(4);
		
//		Collections.sort(list, new Comparator<Integer>() {
//			public int compare(Integer o1, Integer o2) {
//				return o1 - o2;
//			}
//		});
		Comparator<Integer> c = (a,b) -> a-b;
		Collections.sort(list,c);
		System.out.println(list);
	}
}
