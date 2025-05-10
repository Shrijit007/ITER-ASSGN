
import java.util.function.Consumer;
public class ConsumerEG {
	public static void main(String[] args) {
		Consumer<String> c = str->                                                                                                                                                                                                                                                                      System.out.println("String is: "+str);
		c.accept("spider Mannn!!!!!!!!");
	}
}
