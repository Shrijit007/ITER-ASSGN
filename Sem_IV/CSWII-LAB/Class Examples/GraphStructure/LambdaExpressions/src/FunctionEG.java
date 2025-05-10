import java.util.function.Function;

public class FunctionEG {
	public static void main(String[] args) {
		Function<Integer, Integer> f = i->i*i;
		System.out.println("sqaure of 4 is "+ f.apply(4));
		
		String arr[] = {"bombadilo","crocodilo","kautubhMonniiii"};
		Function<String,Integer> l = s->s.length();
		Function<String,String> u = s->s.toUpperCase();
		for(String s : arr) {
			System.out.println("length of "+s+" is "+l.apply(s)+" "+u.apply(s));
		}

		Function<String,Boolean> func = str -> str.length()>4;
		for(String s : arr) {
			System.out.println(func.apply(s));
		}
	}
}
