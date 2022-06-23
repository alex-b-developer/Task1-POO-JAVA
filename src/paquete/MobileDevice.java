package paquete;

/**
 * This is the MobileDevice Class
 * @author Alex Betancur
 */
public class MobileDevice {

    /**
     * attributes:
     */
    public String brand;
    public String model;
    public String color;
    private int deviceId;
    protected int phoneNumber;

    /**
     * This is the constructor
     * @param brand
     * @param model
     * @param color
     * @param deviceId
     */
    public MobileDevice(String brand, String model, String color, int deviceId){
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.deviceId = deviceId;
    }

    /**
     * methods:
     */

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    protected void makeCall(int callingNumber){
        System.out.print( "Making a Call from " + this.phoneNumber);
        System.out.println( " to " + callingNumber);
    }
}
