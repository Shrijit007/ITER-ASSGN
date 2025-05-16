/* Write a Java program that generates prime numbers up to a given limit using multiple
threads. Each thread should generate a subset of the prime numbers. */

package Assignment_8;

class PrimeGenerator extends Thread {
    private int start, end;

    public PrimeGenerator(int start, int end) {
        this.start = start;
        this.end = end;
    }

    private boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println("Prime: " + i + " (Thread: " + Thread.currentThread().getName() + ")");
            }
        }
    }
}

public class Q7 {
    public static void main(String[] args) {
        int limit = 50; // Change this limit as needed
        int numThreads = 4;
        int range = limit / numThreads;
        PrimeGenerator[] threads = new PrimeGenerator[numThreads];

        int start = 2;
        for (int i = 0; i < numThreads; i++) {
            int end = (i == numThreads - 1) ? limit : start + range - 1;
            threads[i] = new PrimeGenerator(start, end);
            threads[i].setName("T" + (i + 1));
            threads[i].start();
            start = end + 1;
        }

        for (int i = 0; i < numThreads; i++) {
            try { threads[i].join(); } 
            catch (InterruptedException e) { }
        }
    }
}
