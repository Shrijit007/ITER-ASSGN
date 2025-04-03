import java.io.File;
import java.io.IOException;

public class FileInput {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\Student\\Desktop\\2341018048\\CSW-LAB\\SystemInputs");
		System.out.println(f.exists());
		System.out.println(f.canExecute());
		System.out.println(f.setReadable(true));
		System.out.println(f.canRead());
		String[] str = f.list();
		int count = 0;
		for(String s : str) {
			File temp = new File(s);
			if(temp.isFile()) count++;
			System.out.println(s);
		}
		System.out.println("number of files: " + count);
	}
}
