
public class GCmethods {
	public static void main(String[] args) {
		Object s1 = new Object();
		s1 = null; //Nullifying method
		
		Object s2 = new Object();
		s2 = new Object(); //Reassigning reference variable method
		
		method(); //objects declared inside methods are garbage eligible
	}
	
	public static void method() {
		Object o = new Object(); //local variable
	}
}

/* 
Two ways to call Garbage Collector
   1} System.gc();
   2} Runtime r = Runtime.getRuntime();
*/