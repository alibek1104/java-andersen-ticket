package service;

import model.*;

import java.util.Scanner;

public class TicketService {
    private Ticket[] tickets = new Ticket[10];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TicketService ticketService = new TicketService();
        for (int i = 0; i < 10; i++) {
            ticketService.tickets[i] = new Ticket("ID" + i, "Hall" + i, 100 + i, System.currentTimeMillis(), i % 2 == 0, (char) ('A' + (i % 3)), 5.0 + i);
        }

        for (Ticket ticket : ticketService.tickets) {
            ticket.print();
        }

        User client = new Client("C1", "Client One");
        User admin = new Admin("A1", "Admin One");

        client.printRole();
        admin.printRole();

        if (client instanceof Client) {
            ((Client) client).getTicket(ticketService.tickets[0]).print();
        }

        if (admin instanceof Admin) {
            ((Admin) admin).checkTicket(ticketService.tickets[1]);
        }

        scanner.close();
    }

    public Ticket getTicketById(String id) {
        for (Ticket ticket : tickets) {
            if (ticket.getId().equals(id)) {
                return ticket;
            }
        }
        return null;
    }
}
