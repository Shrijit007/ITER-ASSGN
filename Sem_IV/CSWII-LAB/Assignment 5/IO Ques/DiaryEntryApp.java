//Q11

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DiaryEntryApp {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your diary entry:");
        String entry = sc.nextLine();
        File diaryFile = new File("diary.txt");


        if (diaryFile.exists()) {
            System.out.println("The file 'diary.txt' already exists. Appending your entry.");
        } else {
            System.out.println("Creating a new file 'diary.txt'.");
            diaryFile.createNewFile();
        }

        BufferedWriter bw = new BufferedWriter(new FileWriter(diaryFile, true));
        bw.write(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) + "\n");
        bw.write("Entry: " + entry + "\n");
        bw.write("----------------------\n");
        bw.close();
        System.out.println("Diary entry saved successfully!");
        sc.close();
    }
}
