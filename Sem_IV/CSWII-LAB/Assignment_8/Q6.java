/* Implement a Java program that demonstrates thread synchronization using the
synchronized block.
Create a scenario where multiple threads try to book seats from a limited pool of
available seats. Use a synchronized block to ensure that only one thread can access and
modify the shared resource at a time, preventing race conditions during seat booking */

package Assignment_8;

class SeatBooking {
    private int availableSeats;

    public SeatBooking(int seats) {
        this.availableSeats = seats;
    }

    public void bookSeat(String user, int seatsToBook) {
        synchronized (this) {
            if (seatsToBook <= availableSeats) {
                System.out.println(user + " booked " + seatsToBook + " seats.");
                availableSeats -= seatsToBook;
                System.out.println("Seats left: " + availableSeats);
            } else {
                System.out.println(user + " failed to book " + seatsToBook + " seats. Not enough seats available.");
            }
        }
    }
}

class BookingThread extends Thread {
    private SeatBooking booking;
    private String user;
    private int seatsToBook;

    public BookingThread(SeatBooking booking, String user, int seatsToBook) {
        this.booking = booking;
        this.user = user;
        this.seatsToBook = seatsToBook;
    }

    public void run() {
        booking.bookSeat(user, seatsToBook);
    }
}

public class Q6 {
    public static void main(String[] args) {
        SeatBooking booking = new SeatBooking(5);
        Thread t1 = new BookingThread(booking, "A", 2);
        Thread t2 = new BookingThread(booking, "B", 3);
        Thread t3 = new BookingThread(booking, "C", 2);
        t1.start();
        t2.start();
        t3.start();
    }
}
