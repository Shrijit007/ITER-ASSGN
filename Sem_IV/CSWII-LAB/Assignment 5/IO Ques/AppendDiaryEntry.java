//Q9

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AppendDiaryEntry {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your new diary entry:");
        String newEntry = sc.nextLine();

        File diaryFile = new File("diary.txt");

        if (!diaryFile.exists()) {
            System.out.println("creating 'diary.txt'...");
            diaryFile.createNewFile();
        }

        BufferedWriter bw = new BufferedWriter(new FileWriter(diaryFile, true));

        bw.write(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) + "\n");
        bw.write("Entry: " + newEntry + "\n");
        bw.close();

        System.out.println("Diary entry successfull!!");
    }
}
