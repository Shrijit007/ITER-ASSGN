//Q14

import java.io.*;
import java.util.Scanner;

public class CopyFileContent {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter source path:");
        String sourcePath = sc.nextLine();

        System.out.println("Enter destination path:");
        String destinationPath = sc.nextLine();

        File sourceFile = new File(sourcePath);
        File destinationFile = new File(destinationPath);

        if (!sourceFile.exists()) {
            System.out.println("Error: The source file does not exist.");
            return;
        }
        if (destinationFile.exists()) {
            System.out.println("The destination file already exists. Do you want to overwrite it? (yes/no)");
            String user = sc.nextLine().toLowerCase();
            if (!user.equals("yes")) {
                System.out.println("Overwrite cancelled.");
                return;
            }
        }

        BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile));

        String line = reader.readLine();
        while (line != null) {
            writer.write(line);
            writer.newLine();
            line = reader.readLine();
        }

        reader.close();
        writer.close();
        System.out.println("File content copied successfully!");
    }
}
