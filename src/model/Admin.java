package model;

public class Admin extends User {
    public Admin(String id, String name) {
        super(id, name);
    }

    @Override
    public void printRole() {
        System.out.println("Role: Admin");
    }

    public void checkTicket(Ticket ticket) {
        System.out.println("Checking ticket: " + ticket);
    }
}