package github.darshilchauhan;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Hello world!
 *
 */
public class MyThread extends Thread {
    String name;
    int noOfTickets;
    int bookedTickets;
    Counter counter;

    public MyThread(String name, int noOfTickets, Counter counter) {
        this.name = name;
        this.noOfTickets = noOfTickets;
        this.counter = counter;
        this.bookedTickets = 0;
    }

    @Override
    public void run() {
        System.out.println("---- Thread " + this.name + " is starting");
        boolean result = counter.bookTicket(this.name, this.noOfTickets);
        while (result) {
            this.bookedTickets += this.noOfTickets;
            System.out.println("Thread " + this.name + ", booked " + this.bookedTickets + " so far");
            // int randomNum = ThreadLocalRandom.current().nextInt(10, 501);
            // try {
            // Thread.sleep(randomNum);
            // } catch (InterruptedException e) {
            // System.out.println("Exception generating random number: " + e.getMessage());
            // }
            result = counter.bookTicket(this.name, this.noOfTickets);
        }
        System.out.println("---- Thread " + this.name + " is done");
    }
}
