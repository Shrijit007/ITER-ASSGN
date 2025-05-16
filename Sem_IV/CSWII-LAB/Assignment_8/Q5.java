/* Implement a program where two threads communicate with each other using
wait() and notify() methods. One thread should print even numbers, and the other
should print odd numbers in sequence. */

package Assignment_8;

class HelperClass {
    private int number = 1;
    public synchronized void printOdd() {
        while (number <= 10) {
            if (number % 2 == 0) {
                try { wait(); } catch (InterruptedException e) { }
            } else {
                System.out.println("Odd: " + number);
                number++;
                notify();
            }
        }
    }

    public synchronized void printEven() {
        while (number <= 10) {
            if (number % 2 == 1) {
                try { wait(); } catch (InterruptedException e) { }
            } else {
                System.out.println("Even: " + number);
                number++;
                notify();
            }
        }
    }
}

public class Q5 {
    public static void main(String[] args) {
        HelperClass ob = new HelperClass();

        Thread oddThread = new Thread(() -> ob.printOdd());
        Thread evenThread = new Thread(() -> ob.printEven());

        oddThread.start();
        evenThread.start();
    }
}