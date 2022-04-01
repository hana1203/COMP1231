package array.p6;

public class Account {
    private String name;
    private long accNumber;
    private double balance;


    public Account(String name, long accNumber, double balance){
        this.name= name;
        this.accNumber= accNumber;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(long accNumber) {
        this.accNumber = accNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String showAccountInfo() {
        return "Account holder: " + name + "\t\tAccount number: " + accNumber + "\t\tBalance: " + balance;
    }


}
