package github.darshilchauhan;

import java.util.*;

public class Counter {
    int totalTickets;
    Map<String, Integer> bookedTickets = new HashMap<String, Integer>();

    Counter(int tickets) {
        this.totalTickets = tickets;
    }

    boolean bookTicket(String name, int tickets) {
        if (totalTickets >= tickets) {
            bookedTickets.put(name, bookedTickets.getOrDefault(name, 0) + tickets);
            totalTickets -= tickets;
            return true;
        } else {
            return false;
        }
    }

    void printData() {
        System.out.println("Booked Tickets:");
        for (String name : bookedTickets.keySet()) {
            System.out.println(name + ": " + bookedTickets.get(name));
        }
    }
}