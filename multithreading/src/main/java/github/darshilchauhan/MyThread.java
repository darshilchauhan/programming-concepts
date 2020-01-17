package github.darshilchauhan;

/**
 * Hello world!
 *
 */
public class MyThread extends Thread {
    String name;
    int noOfTickets;
    Counter counter;

    public MyThread(String name, int noOfTickets, Counter counter) {
        this.name = name;
        this.noOfTickets = noOfTickets;
        this.counter = counter;
    }

    @Override
    public void run() {
        System.out.println("Thread " + this.name + " is starting");
        System.out.println("Thread " + this.name + "result: " + counter.bookTicket(name, noOfTickets));
        System.out.println("Thread " + this.name + " is done");
    }
}
