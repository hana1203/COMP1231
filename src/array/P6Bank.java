package array;

public class P6Bank {
    private int count;
    private final double interestRate = 0.03;
    private P6Account accounts[];

    public P6Bank() {
        accounts = new P6Account[30];
        count=0;
    }

    public void createAccount(String name, long accNumber, double balance) {
        accounts[count] = new P6Account(name, accNumber, balance);
        count++;
        if (count > 30)
            System.out.println("Warning: cannot create more than 30 bank account");
    }

    public int accountIndex(long accNumber) {
        for(int i=0; i<count; i++) {
            if (accounts[i].getAccNumber() == accNumber) {
                return i;
            }
        } return -1;
    }

    public P6Account getAccount(long accNumber) {
        int index = accountIndex(accNumber);
        return accounts[index];
    }

    public double deposit(long accNumber, double amount) {
        int index = accountIndex(accNumber);
        if (index ==-1 || amount<0.01) {
            System.out.println("Warning: invalid deposit");
        }
        else {
            accounts[index].setBalance(accounts[index].getBalance() + amount);
        }
        return accounts[index].getBalance();
    }

    public double withdraw(long accNumber, double amount, double fee) {
        int index = accountIndex(accNumber);
        if (index ==-1 || amount > accounts[index].getBalance() || amount+fee < 0) {
            System.out.println("Warning: invalid withdraw");
        }
        else {
            accounts[index].setBalance(accounts[index].getBalance()-amount-fee);
        }
        return accounts[index].getBalance();
    }

    public void addInterest() {
        for (int i=0; i<count; i++) {
            accounts[i].setBalance(accounts[i].getBalance() *(1+interestRate));
        }
    }

    public void showAllAccountInfo() {
        for (int i=0; i<count; i++) {
            System.out.println("Name: "+accounts[i].getName() + "\t\tBalance: "+accounts[i].getBalance());
        }
    }
}
