package GenericsTutorial;
import java.util.*;

class  GenericDemo<T>{
	private T obj;
	public GenericDemo(T obj) {
		this.obj = obj;
	}
	public T getObj() {
		return obj;
	}
	public void show() {
		System.out.println("Object is of type: "+obj.getClass().getName());
	}
}

public class Generics {
	public static void main(String[] args) {
		GenericDemo<Integer> g1 = new GenericDemo<Integer>(5);
		System.out.println(g1.getObj());
		g1.show();
		GenericDemo<String> g2 = new GenericDemo<String>("Hello");
		System.out.println(g2.getObj());
		g2.show();
//		GenericDemo<Student> g3 = new GenericDemo<Student>(new Student(null));
//		System.out.println(g3.getObj());
//		g3.show();
	}
}
                                             