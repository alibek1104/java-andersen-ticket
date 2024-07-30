package model;

import java.util.Objects;

public class Ticket extends Printable implements Identifiable {
    private String id;
    private String concertHall;
    private int eventCode;
    private long time;
    private boolean isPromo;
    private char stadiumSector;
    private double backpackWeight;

    public Ticket(String id, String concertHall, int eventCode, long time, boolean isPromo, char stadiumSector, double backpackWeight) {
        if (id != null && id.length() <= 4) {
            this.id = id;
        } else {
            this.id = "Unknown ID";
        }
        if (concertHall != null && concertHall.length() <= 10) {
            this.concertHall = concertHall;
        } else {
            this.concertHall = "Unknown Concert Hall";
        }
        if (eventCode >= 100 && eventCode <= 999) {
            this.eventCode = eventCode;
        } else {
            this.eventCode = 100;
        }
        this.time = time;
        this.isPromo = isPromo;
        if (stadiumSector >= 'A' && stadiumSector <= 'C') {
            this.stadiumSector = stadiumSector;
        } else {
            this.stadiumSector = 'N';
        }
        if (backpackWeight >= 0) {
            this.backpackWeight = backpackWeight;
        }
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public String getConcertHall() {
        return concertHall;
    }

    public void setConcertHall(String concertHall) {
        this.concertHall = concertHall;
    }

    public int getEventCode() {
        return eventCode;
    }

    public void setEventCode(int eventCode) {
        this.eventCode = eventCode;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public boolean isPromo() {
        return isPromo;
    }

    public void setPromo(boolean promo) {
        isPromo = promo;
    }

    public char getStadiumSector() {
        return stadiumSector;
    }

    public void setStadiumSector(char stadiumSector) {
        this.stadiumSector = stadiumSector;
    }

    public double getBackpackWeight() {
        return backpackWeight;
    }

    public void setBackpackWeight(double backpackWeight) {
        this.backpackWeight = backpackWeight;
    }

    public String toString() {
        return "Ticket{" +
                "id='" + id + '\'' +
                ", concertHall='" + concertHall + '\'' +
                ", eventCode=" + eventCode +
                ", time=" + time +
                ", isPromo=" + isPromo +
                ", stadiumSector=" + stadiumSector +
                ", backpackWeight=" + backpackWeight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return eventCode == ticket.eventCode &&
                time == ticket.time &&
                isPromo == ticket.isPromo &&
                stadiumSector == ticket.stadiumSector &&
                Double.compare(ticket.backpackWeight, backpackWeight) == 0 &&
                Objects.equals(id, ticket.id) &&
                Objects.equals(concertHall, ticket.concertHall);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, concertHall, eventCode, time, isPromo, stadiumSector, backpackWeight);
    }
}


