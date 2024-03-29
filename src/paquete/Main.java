package paquete;
import paquete.*;

import java.util.ArrayList;
import java.util.Date;

/**
 * This is where all class are tested and instantiated
 * You can test the classes reemplacing the values here.
 * @author Alex Betancur
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Task 1");

        /**
         *Object from Person Class
         */

        Date d = new Date(1988, 7, 29);

        Person p = new Person("Alex", "Betancur", "Builes", d);
        p.setName("Juan");
        p.setHeight(1.79f);

        System.out.println("Full Name: " + p.getName() + " " + p.getLastName1() + " " + p.getLastName2());
        System.out.println("Birthday: " + p.getDateBirth());
        System.out.println("Height: " + p.getHeight());


        /**
         *Object from Fruit Class
         */

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

        /**
         *Object from BankAccount Class
         */

        BankAccount ba = new BankAccount(125877555);
        ba.setActivated(true);
        System.out.println(ba.getAccountNumber());
        System.out.println(ba.getActivated());

        MobileDevice md = new MobileDevice("iPhone", "12 pro max", "Black", 25544755);
        md.setPhoneNumber(31487345);
        md.makeCall(325588755);

        /**
         *Object from AirPlane Class
         */

        Airplane plane = new Airplane("Airbus 240", 4, 240);
        plane.setEngineStatus(true);
        plane.setEngineStatus(false);

        /**
         *Object from Tshirt Class
         */

        Tshirt ts = new Tshirt("Adiddas", "Blue", "M", 80000, true);
        System.out.println("T-shirt - " + ts.getBrand() + " Price: " + ts.getPrice());
        ts.ApplyDiscount(20);
    }
}