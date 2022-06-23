package paquete;

/**
 * This is the Tshirt Class
 * @author Alex Betancur
 */
public class Tshirt {

    /**
     * attributes:
     */
    public String brand;
    public String color;
    protected String size;
    public int price;
    private  boolean availability;


    /**
     * This is the constructor
     * @param brand
     * @param color
     * @param size
     * @param price
     * @param availability
     */
    public Tshirt(String brand, String color, String size, int price, boolean availability){
        this.brand = brand;
        this.color = color;
        this.size = size;
        this.price = price;
        this.availability = availability;
    }

    /**
     * methods:
     */
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean getAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    protected void ApplyDiscount(int discountRate){

        System.out.print( "a " + discountRate + "% discount has been applied" );
        System.out.println( " now you save: " + this.price * discountRate/100);
    }
}
