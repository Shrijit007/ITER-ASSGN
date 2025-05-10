// Write a Java program that demonstrates how to format a LocalDateTime object using
// the DateTimeFormatter class. Create a LocalDateTime instance representing a
// specific date and time. Then, use a custom format pattern "yyyy-MM-dd HH:mm:ss" to
// convert this date-time into a formatted string. Finally, print the formatted result.

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Q8 {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2025,5,10,10,30);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("Formatted:"+dt.format(formatter));
    }
}