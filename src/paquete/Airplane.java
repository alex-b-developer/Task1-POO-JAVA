package paquete;

/**
 * This is the Airplane Class
 * @author Alex Betancur
 */

public class Airplane {

    /**
     * attributes:
     */
    public String model;
    private int engineNumbers;
    public int seatNumbers;
    protected boolean engineStatus;

    /**
     * This is the constructor
     * @param model
     * @param engineNumbers
     * @param seatNumbers
     */
    public Airplane(String model, int engineNumbers, int seatNumbers){
        this.model = model;
        this.engineNumbers = engineNumbers;
        this.seatNumbers = seatNumbers;
    }

    /**
     * methods:
     */
    public int getSeatNumbers() {
        return seatNumbers;
    }

    public void setEngineStatus(boolean engineStatus){
        this.engineStatus = engineStatus;
        isPlaneOn();
    }

    private void isPlaneOn(){
        if (this.engineStatus == true){
            System.out.println( "The plane " + this.model + " is On");
        }else{
            System.out.println( "The plane " + this.model + " is Off");
        }
    }
}
