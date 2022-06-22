package paquete;

public class BankAccount {

    private int accountNumber;
    protected boolean activated;

    public BankAccount(int accountNumber){
        this.accountNumber = accountNumber;
    }

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
