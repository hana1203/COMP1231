package exception;

import java.util.Scanner;

public class CreatingException {
    //Creates an exception object and possibly throws it.

    public static void main(String[] args) throws OutofRangeException {
        final int MIN = 25, MAX = 40;

        Scanner scan = new Scanner(System.in);
        OutofRangeException problem = new OutofRangeException("Input value is out of range.");
        System.out.println("Enter an integer value between " + MIN + " and " + MAX + ", inclusive: ");
        int value = scan.nextInt();

        if (value < MIN || value> MAX)
            throw problem;

        System.out.println("End of main method"); //may never reach.
    }


}