//Q12

import java.io.File;
import java.util.Scanner;

public class ListFilesAndDirectories {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the directory path:");
        String filePath = sc.nextLine();

        File file = new File(filePath);

        if (file.exists() && file.isDirectory()) {
            System.out.println("Listing files and subdirectories in: " + file);
            File[] contents = file.listFiles();

            if (contents != null && contents.length > 0) {
                for (File f : contents) {
                    if (f.isFile())  
                        System.out.println("File: " + file.getName());
                    else if (f.isDirectory()) 
                        System.out.println("Directory: " + file.getName());
                }
            } 
            else {
                System.out.println("The directory is empty.");
            }
        } else 
            System.out.println("Error: The specified directory does not exist or is not a directory.");
    }
}
