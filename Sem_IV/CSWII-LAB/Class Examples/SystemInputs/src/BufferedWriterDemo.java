import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("abc.txt"));
		bw.write("fegdfgdfgD");
		bw.newLine();
		bw.write("sdsffdsdfs");
		bw.flush();
		bw.close();
		BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
		String str = br.readLine();
		while(str != null) {
			System.out.println(str);
			str = br.readLine();
		}
		br.close();
	}
}
