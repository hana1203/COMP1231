package exception;

import java.util.Scanner;

public class InsufficientExceptionTest {
    //Creates an exception object and throw it.
    public static void main(String[] args) throws InsufficientFundsException {
        Scanner scan = new Scanner(System.in);
        int balance = 30000, withdraw;
        InsufficientFundsException problem = new InsufficientFundsException("Can't withdraw more money than the account balance.");

        System.out.println("Enter a withdrawal money: ");
        withdraw= scan.nextInt();

        if (withdraw > balance)
            throw problem;
        System.out.println("end of the line. ");
    }
}
