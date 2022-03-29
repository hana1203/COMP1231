package array;

public class P6Account {
    private String name;
    private long accNumber;
    private double balance;
    private final double interestRate = 0.03;

    public P6Account(String name, long accNumber, double balance){
        this.name= name;
        this.accNumber= accNumber;
        this.balance = balance;
    }

    public double deposit(double amount) {
        if (amount>0) {
            balance += amount;
        } return balance;
    }

    public double withdraw(double amount, double fee) {
        if (amount+fee>0 && amount+fee<balance) {
            balance = balance - amount - fee;
        } return balance;
    }

    public double addInterest() {
        balance += balance*interestRate;
        return balance;
    }

    public String showAccountInfo() {
        return "Account holder: " + name + "\t Account number: " + accNumber + "\t balance: " + balance;
    }

    public static void main(String[] args) {
        P6Account[] customer = new P6Account[30];
        customer[0] = new P6Account("taeyeon", 10021, 50000);
//        customer[0].deposit(10000);
        customer[0].showAccountInfo();

    }
}
