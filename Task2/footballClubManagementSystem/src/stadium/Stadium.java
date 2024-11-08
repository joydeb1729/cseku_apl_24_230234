package stadium;

import interfaces.RevenueManageable;

public class Stadium implements RevenueManageable {
    /*
      The stadium.Stadium class includes attributes for name, capacity, location, and ticket sales.
      As a interfaces.RevenueManageable entity, the stadium can calculate revenue based on ticket sales and ticket pricing.
     */

    private String name;
    private int capacity;
    private String location;
    private int ticketSales;

    public Stadium(String name, int capacity, String location) {
        this.name = name;
        this.capacity = capacity;
        this.location = location;
        this.ticketSales = 0;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getLocation() {
        return location;
    }

    public int getTicketSales() {
        return ticketSales;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public void sellTicket(int ticketsSold) {
        if (ticketsSold < 0) {
            throw new IllegalArgumentException("Tickets sold cannot be negative.");
        }
        this.ticketSales += ticketsSold;
    }

    @Override
    public double calculateRevenue(double ticketPrice) {
        if (ticketPrice < 0) {
            throw new IllegalArgumentException("Ticket price cannot be negative.");
        }
        return ticketSales * ticketPrice;
    }
}
