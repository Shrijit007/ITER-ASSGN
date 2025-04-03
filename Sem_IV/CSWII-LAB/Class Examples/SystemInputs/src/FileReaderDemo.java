import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
	public static void main(String[] args) throws IOException {
		File f = new File("abc.txt");
		FileReader fr = new FileReader(f);
		//method1
		char[]ch = new char[(int)f.length()];
		int len = fr.read(ch);
		System.out.println("no of characters: " + len);
		for(char c : ch) {
			System.out.print(c);
		}
		
		//method 2
		int i = fr.read();
		while(i != -1) {
			System.out.print((char)i);
			i = fr.read();
		}
		fr.close();
	}
}
