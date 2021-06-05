package Homework2;

public class Task2 {
    public static void main(String[] args) {
        int maxCapacity = 600;
        int tickets = 600;

        int spaceReserved = 590;
        int ticketsSold = 601;

        boolean space = spaceReserved<=maxCapacity;
        boolean ticketsSoldOut = ticketsSold<=tickets;

        System.out.println("Is there enough Space for NBA game: "+space);
        System.out.println("Is there Ticket for the game: "+ticketsSoldOut);

    }
}
