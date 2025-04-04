//Q16

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class FileMetadataViewer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file name/path:");
        String fileName = sc.nextLine();

        File file = new File(fileName);

        if (file.exists()) {
            System.out.println("File Name: " + file.getName());
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("File Size: " + file.length() + " bytes");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            System.out.println("Last Modified: " + sdf.format(file.lastModified()));
            System.out.println("Is Readable: " + file.canRead());
            System.out.println("Is Writable: " + file.canWrite());
            System.out.println("Is Hidden: " + file.isHidden());
        } else 
            System.out.println("Error: The file '" + fileName + "' does not exist.");
    }
}
