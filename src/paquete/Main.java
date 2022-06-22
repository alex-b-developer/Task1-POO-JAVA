package paquete;
import paquete.Person;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Task 1");

        Date d = new Date(1988, 7, 29);

        Person p = new Person("Alex", "Betancur", "Builes", d);
        p.setName("Juan");
        p.setHeight(1.79f);

        System.out.println("Full Name: " + p.getName() + " " + p.getLastName1() + " " + p.getLastName2());
        System.out.println("Birthday: " + p.getDateBirth());
        System.out.println("Height: " + p.getHeight());


    }
}