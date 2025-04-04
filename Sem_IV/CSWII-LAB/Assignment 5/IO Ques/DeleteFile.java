//Q13

import java.io.File;
import java.util.Scanner;

public class DeleteFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name/path of file to delete:");
        String fileName = sc.nextLine();

        File file = new File(fileName);

        if (file.exists()) {
            if (file.delete()) 
                System.out.println("'" + fileName + "' was successfully deleted.");
            else 
                System.out.println("Error: Unable to delete the file '" + fileName + "'.");
        }
        else 
            System.out.println("Error: The file '" + fileName + "' does not exist.");
    }
}
