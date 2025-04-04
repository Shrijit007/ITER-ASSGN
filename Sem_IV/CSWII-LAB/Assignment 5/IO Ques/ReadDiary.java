//Q10

import java.io.*;

public class ReadDiary {
    public static void main(String[] args)throws IOException {
        File diaryFile = new File("diary.txt");
        if (!diaryFile.exists()) {
            System.out.println("Error: The file 'diary.txt' does not exist.");
        } else {
            BufferedReader br = new BufferedReader(new FileReader(diaryFile));
            System.out.println("Contents of 'diary.txt':");
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
            }
            br.close();
        }
    }
}
