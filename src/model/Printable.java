package model;

public abstract class Printable {
    public void print() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Content of the class";
    }
}
