package paquete;
import paquete.Person;
import paquete.Fruit;
import paquete.BankAccount;
import paquete.*;

import java.util.ArrayList;
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


        Fruit f = new Fruit();
        f.setName("Mango");
        f.setAverageWeight(2.2f);

        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Amarillo");
        colors.add("Rojo");
        colors.add("Naranja");
        f.setColors(colors);

        System.out.println(f.getName());
        System.out.println(f.getAverageWeight());
        System.out.println(f.getColors());

        BankAccount ba = new BankAccount(125877555);
        ba.setActivated(true);
        System.out.println(ba.getAccountNumber());
        System.out.println(ba.getActivated());

        MobileDevice md = new MobileDevice("iPhone", "12 pro max", "Black", 25544755);
        md.setPhoneNumber(31487345);
        md.makeCall(325588755);

    }
}