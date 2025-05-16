// Producer-Consumer problem using multithreading and inter-thread communication.

package Assignment_8;

class Buffer {
    private final int[] buffer;
    private int count = 0;

    public Buffer(int capacity) {
        buffer = new int[capacity];
    }

    public synchronized void put(int value) throws InterruptedException {
        while (count == buffer.length) {
            wait(); // Buffer full
        }
        buffer[count++] = value;
        System.out.println("Produced: " + value);
        notify(); // Notify consumer
    }

    public synchronized int get() throws InterruptedException {
        while (count == 0) {
            wait(); // Buffer empty
        }
        int value = buffer[--count];
        System.out.println("Consumed: " + value);
        notify(); // Notify producer
        return value;
    }
}

class Producer extends Thread {
    private final Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                buffer.put(i);
                Thread.sleep(500); // Simulate production time
            }
        } catch (InterruptedException e) {
        }
    }
}

class Consumer extends Thread {
    private final Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                buffer.get();
                Thread.sleep(800); // Simulate consumption time
            }
        } catch (InterruptedException e) {
        }
    }
}

public class Q8 {
    public static void main(String[] args) {
        Buffer buffer = new Buffer(3); // Fixed capacity buffer

        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        producer.start();
        consumer.start();

        try {
            producer.join();
            consumer.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Producer and Consumer have finished.");
    }
}
