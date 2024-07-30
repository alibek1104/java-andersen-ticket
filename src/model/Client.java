package model;

public class Client extends User {
    public Client(String id, String name) {
        super(id, name);
    }

    @Override
    public void printRole() {
        System.out.println("Role: Client");
    }

    public Ticket getTicket(Ticket ticket) {
        return ticket;
    }
}