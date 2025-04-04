//Q3

import java.util.Scanner;

public class TextEditor {
    public static void main(String[] args) {
        StringBuffer text = new StringBuffer();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Text Editor Menu ---");
            System.out.println("1. Append a string");
            System.out.println("2. Insert a string at a specified index");
            System.out.println("3. Delete a portion of text between two indices");
            System.out.println("4. Reverse the entire text");
            System.out.println("5. Replace a portion of text between two indices");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine(); 
            switch (choice) {
                case 1:
                    System.out.print("Enter the string to append: ");
                    text.append(sc.nextLine());
                    break;

                case 2:
                    System.out.print("Enter the index & string to insert: ");
                    int ins = sc.nextInt();
                    String insStr = sc.nextLine();
                    if (ins >= 0 && ins <= text.length()) text.insert(ins, insStr); 
                    else System.out.println("Invalid index.");
                    break;

                case 3:
                    System.out.print("Enter the starting & ending index: ");
                    int start = sc.nextInt(), end = sc.nextInt();
                    if (start >= 0 && end <= text.length() && start < end) text.delete(start, end);
                    else System.out.println("Invalid indices.");
                    break;

                case 4:
                    text.reverse();
                    break;

                case 5:
                    System.out.print("Enter the starting & ending index: ");
                    int rstart = sc.nextInt(), rend = sc.nextInt();
                    System.out.print("Enter the replacement string: ");
                    String str = sc.nextLine();
                    if (rstart >= 0 && rend <= text.length() && rstart < rend) text.replace(rstart, rend, str);
                    else System.out.println("Invalid indices.");
                    break;

                case 6:
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println("\nCurrent Text: " + text);
            System.out.println("Length of text: " + text.length());
            System.out.println("Capacity of StringBuffer: " + text.capacity());
        }
    }
}
