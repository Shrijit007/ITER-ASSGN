import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterDemo {
	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter("abc.txt");
		pw.print('a');
		pw.print(true);
		pw.print("asjnc");
		pw.close();
	}
}
