package GenericsTutorial;
import java.util.*;
interface A{
	void m1();
}
interface b extends A{
	void m2();
}
interface c extends b{
	void m3();
} 
class Test implements c{

	@Override
	public void m2() {
		
		System.out.println("m1");
		m2();
	}

	@Override
	public void m1() {
		System.out.println("m2");
		m3();
	}

	@Override
	public void m3() {
		try {
	System.out.println(10/0);
		}
		catch(ArithmeticException e){
			System.out.println(e.toString());
		}
		System.out.println("m3");
	}
	
	
}
public class genericsa <T>{
	public static void displaylist1(ArrayList<? super c>l) {
		System.out.println(l.add(new Test()));
	}
	public static void main(String[] args) {
		ArrayList<c>  l= new ArrayList<>();
		displaylist1(l);
		ArrayList<b> k= new ArrayList<>();
		
	}

}
