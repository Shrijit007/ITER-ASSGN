import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	public static void main(String[] args) throws IOException{
		File f = new File("abc.txt");
		System.out.println(f.exists());
		System.out.println(f.createNewFile());
		//if no bool parameter than existing file data deleted
//		FileWriter fw = new FileWriter(f);
		//if bool parameter is true than new data is appended to existing data
		FileWriter fw = new FileWriter(f,true);
		fw.write(97);
		char ch[] = {'a','b','c','d'};
		fw.write(ch);
		fw.write('\n');
		fw.write("efg");
		fw.flush();
		fw.close();
	}
}

