import java.util.Scanner;

class Node {
    int data;
    Node next;
}

public class SinglyLinkedList {
    static Node start = null;

    public static void create(){
        Scanner sc = new Scanner(System.in);
        Node  p = new Node();
        System.out.print("Enter the data: ");
        p.data = sc.nextInt();
        p.next = null;
        start = p;
        Node q = p;
        System.out.println("Node created successfully");
        System.out.println("Do you want to add more nodes? (Y/N)");
        char ch = sc.next().charAt(0);
        while(ch == 'Y' || ch == 'y'){
            p = new Node();
            System.out.print("Enter the data: ");
            p.data = sc.nextInt();
            p.next = null;
            q.next = p;
            q = p;
            System.out.println("Node created successfully");
            System.out.println("Do you want to add more nodes? (Y/N)");
            ch = sc.next().charAt(0);
        }
    }

    public static void display(){
        Node p = start;
        while(p != null){
            System.out.print(p.data + " -> ");
            p = p.next;
        }
        System.out.println();
    }

    public static void insertAtBeginning(int val){
        Node p = new Node();
        p.data = val;
        p.next = start;
        start = p;
        System.out.println("Node inserted successfully");
    }

    public static void insertAtEnd(int val){
        Node p = new Node();
        p.data = val;
        p.next = null;
        Node q = start;
        while(q.next != null)
            q = q.next;
        q.next = p;
    }

    public static void insertAtPosition(int val, int pos){
        Node p =new Node();
        p.data = val;
        if(pos == 1) 
            insertAtBeginning(val);
        else{
            Node q = start;
            for(int i = 1; i < pos-1 && q != null; i++)
                q = q.next;
            if(q == null)
                System.out.println("Position not found");
            else{
                p.next = q.next;
                q.next = p;
                System.out.println("Node inserted successfully");
            }
        }
    }

    public static void deleteAtBegin(){
        if(start == null)
            System.out.println("List is empty");
        else{
            Node p = start;
            start = start.next;
            p.next = null;
            System.out.println("Node deleted successfully");
        }
    }

    public  static void deletetAtEnd(){
        if(start == null)
            System.out.println("List is empty");
        else {
            Node p = start;
            Node q = null;
            while(p.next != null){
                q = p;
                p = p.next;
            }
            if(q == null)
                start = null;
            else
                q.next = null;
            System.out.println("Node deleted successfully");
        }
    }
    public static void deleteAtPosition(int pos){
        if(start == null)
            System.out.println("List is empty");
        else {
            Node p = start;
            for(int i = 1; i < pos-1 && p != null; i++)
                p = p.next;
            if(p == null || p.next == null)
                System.out.println("Position not found");
            else{
                p.next = p.next.next;
                System.out.println("Node deleted successfully");
            }
        }
    }

    public static void reverse(){
        Node curr = start;
        Node prev = null;
        Node next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        start = prev;
        System.out.println("List reversed successfully");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, val, pos;
        while(true){
            System.out.println("1. Create");
            System.out.println("2. Display");
            System.out.println("3. Insert at beginning");
            System.out.println("4. Insert at end");
            System.out.println("5. Insert at position");
            System.out.println("6. Delete at beginning");
            System.out.println("7. Delete at end");
            System.out.println("8. Delete at position");
            System.out.println("9. Reverse");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    create();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    System.out.print("Enter the value: ");
                    val = sc.nextInt();
                    insertAtBeginning(val);
                    break;
                case 4:
                    System.out.print("Enter the value: ");
                    val = sc.nextInt();
                    insertAtEnd(val);
                    break;
                case 5:
                    System.out.print("Enter the value: ");
                    val = sc.nextInt();
                    System.out.print("Enter the position: ");
                    pos = sc.nextInt();
                    insertAtPosition(val, pos);
                    break;
                case 6:
                    deleteAtBegin();
                    break;
                case 7:
                    deletetAtEnd();
                    break;
                case 8:
                    System.out.print("Enter the position: ");
                    pos = sc.nextInt();
                    deleteAtPosition(pos);
                    break;
                case 9:
                    reverse();
                    break;
                case 10:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}


