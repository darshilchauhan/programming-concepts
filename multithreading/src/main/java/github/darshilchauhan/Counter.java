package github.darshilchauhan;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Counter {
    int totalTickets;
    int remainingTickets;
    Map<String, Integer> bookedTickets;

    Counter(int tickets) {
        this.totalTickets = tickets;
        this.remainingTickets = tickets;
        this.bookedTickets = new HashMap<String, Integer>();
    }

    synchronized boolean bookTicket(String name, int tickets) {
        if (this.remainingTickets >= tickets) {
            int randomNum = ThreadLocalRandom.current().nextInt(10, 501);
            try {
                Thread.sleep(randomNum);
            } catch (InterruptedException e) {
                System.out.println("Exception generating random number: " + e.getMessage());
            }
            bookedTickets.put(name, this.bookedTickets.getOrDefault(name, 0) + tickets);
            this.remainingTickets -= tickets;
            return true;
        } else {
            return false;
        }
    }

    void printData() {
        System.out.println("Booked Tickets:");
        int sum = 0;
        for (String name : bookedTickets.keySet()) {
            System.out.println(name + ": " + bookedTickets.get(name));
            sum += bookedTickets.get(name);
        }
        System.out.println("Booked tickets:" + sum + ", allowed: " + this.totalTickets + "\nIs it a problem: "
                + ((sum > this.totalTickets) ? "Yes" : "No"));
    }
}