package Assignment_3;

import java.io.*;

public class Q11 {

	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(new FileReader("abc.txt"))) {
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println("Processed: " + line.toUpperCase());
			}
		} catch (IOException e) {
			System.out.println("IOException:" + e.getMessage());
		}

	}

}
