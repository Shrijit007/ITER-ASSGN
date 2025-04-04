//Q15

import java.io.File;
import java.util.Scanner;

public class RenameFileApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter current file name/path:");
        String currFileName = sc.nextLine();
        System.out.println("Enter new file name/path:");
        String newFileName = sc.nextLine();

        File currentFile = new File(currFileName);
        File newFile = new File(newFileName);

        if (currentFile.exists()) {
            if (currentFile.renameTo(newFile)) 
                System.out.println("File renamed to: " + newFileName);
            else 
                System.out.println("Error: Unable to rename the file.");
        } 
        else 
            System.out.println("Error: The file '" + currFileName + "' does not exist.");
    }
}
