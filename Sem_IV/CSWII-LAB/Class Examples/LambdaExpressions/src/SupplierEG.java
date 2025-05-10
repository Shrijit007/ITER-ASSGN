import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierEG {
	public static void main(String[] args) {
		Supplier<Integer> s = ()->{
			Random r = new Random();
			return 1000+r.nextInt(9000);
		};
		HashSet<Integer>ss = new HashSet<Integer>();
			int count=0; 
		while(true) {
			count++;
			int sn = s.get();
			if(ss.contains(sn)) {
				System.out.println(sn );
				System.err.println(count);
				break;
			}
			ss.add(sn);
		}
		System.out.println("OTP: "+s.get());
	}
}
