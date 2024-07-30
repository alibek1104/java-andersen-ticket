package service;

import model.Ticket;

import java.util.Scanner;

public class TicketService {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите данные для билета:");
        System.out.print("ID (макс 4 символа): ");
        String id = scanner.nextLine();

        System.out.print("Концертный зал (макс 10 символов): ");
        String concertHall = scanner.nextLine();

        System.out.print("Код мероприятия (3 цифры): ");
        int eventCode = scanner.nextInt();

        System.out.print("Время (Unix timestamp): ");
        long time = scanner.nextLong();

        System.out.print("Промо билет (true/false): ");
        boolean isPromo = scanner.nextBoolean();

        System.out.print("Сектор стадиона (от 'A' до 'C'): ");
        char stadiumSector = scanner.next().charAt(0);

        System.out.print("Максимально допустимый вес рюкзака (кг, с точностью до граммов): ");
        double backpackWeight = scanner.nextDouble();

        Ticket ticket = new Ticket(id, concertHall, eventCode, time, isPromo, stadiumSector, backpackWeight);

        printTicketDetails(ticket);

        scanner.close();
    }

    public static void printTicketDetails(Ticket ticket) {
        System.out.println("model.Ticket Details:");
        System.out.println("ID: " + ticket.getId());
        System.out.println("Concert Hall: " + ticket.getConcertHall());
        System.out.println("Event Code: " + ticket.getEventCode());
        System.out.println("Time: " + ticket.getTime());
        System.out.println("Is Promo: " + ticket.isPromo());
        System.out.println("Stadium Sector: " + ticket.getStadiumSector());
        System.out.println("Backpack Weight: " + ticket.getBackpackWeight());
        System.out.println();
    }
}
