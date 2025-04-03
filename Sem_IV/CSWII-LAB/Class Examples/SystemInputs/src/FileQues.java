import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileQues {
	public static void main(String[] args) throws IOException {
		File f1 = new File("f1.txt");
		File f2 = new File("f2.txt");
		File f3 = new File("f3.txt");
		File f4 = new File("f4.txt");
		System.out.println(f1.createNewFile());
		System.out.println(f2.createNewFile());
		System.out.println(f3.createNewFile());
		System.out.println(f4.createNewFile());
		
		PrintWriter pr = new PrintWriter(f1);
		pr.println("AAA");
		pr.println("BBB");
		pr.println("CCC");
		pr.println("DDD");
		pr.close();

		PrintWriter pr1 = new PrintWriter(f2);
		pr1.println("111");
		pr1.println("222");
		pr1.println("333");
		pr1.println("444");
		pr1.close();
		
		BufferedReader br1 = new BufferedReader(new FileReader(f1));
		BufferedReader br2 = new BufferedReader(new FileReader(f2));
		String str1 = br1.readLine();
		String str2 = br2.readLine();
		
		BufferedWriter bw1 = new BufferedWriter(new FileWriter(f3));
		while(str1 != null && str2 != null) {
			bw1.write(str1);
			bw1.write('\n');
			bw1.write(str2);
			bw1.write('\n');
			str1 = br1.readLine();
			str2 = br2.readLine();
		}
		
		br1.close();
		br2.close();
		bw1.close();
		
		BufferedReader br3 = new BufferedReader(new FileReader(f1));
		BufferedReader br4 = new BufferedReader(new FileReader(f2));
		String str3 = br3.readLine();
		String str4 = br4.readLine();
		
		PrintWriter bw2= new PrintWriter(f4);
		while(str3 != null) {
			bw2.println(str3);
			str3 = br3.readLine();
		}
		
		while(str4 != null) {
			bw2.println(str4);
			str4 = br4.readLine();
		}
		br3.close();
		br4.close();
		bw2.close();
	}
}

