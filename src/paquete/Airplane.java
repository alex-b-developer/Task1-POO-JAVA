package paquete;

public class Airplane {

    public String model;
    private int engineNumbers;
    public int seatNumbers;
    protected boolean engineStatus;

    public Airplane(String model, int engineNumbers, int seatNumbers){
        this.model = model;
        this.engineNumbers = engineNumbers;
        this.seatNumbers = seatNumbers;
    }

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
