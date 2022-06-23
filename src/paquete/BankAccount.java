package paquete;

/**
 * This is the BankAccount Class
 * @author Alex Betancur
 */
public class BankAccount {

    /**
     * attributes:
     */
    private int accountNumber;
    protected boolean activated;

    /**
     * this is the constructor
     * @param accountNumber
     */
    public BankAccount(int accountNumber){
        this.accountNumber = accountNumber;
    }

    /**
     * methods:
     */
    public int getAccountNumber(){
        return this.accountNumber;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    public boolean getActivated(){
        return this.activated;
    }
}
