package array.p8;

/*
Design and implement an application that reads a sequence of up to 25 pairs of names and postal (ZIP) codes for individuals.
Store the data in an object designed to store a first name (string), last name (string), and postal code (integer).
Assume that each line of input will contain two strings followed by an integer value, each separated by a tab character.
Then, after the input has been read in, print the list in an appropriate format to the screen.
 */

import java.util.Scanner;
public class NameZipcode {
    String firstName, lastName;
    int zipCode;

    public NameZipcode() {
        Scanner scan = new Scanner(System.in);
        System.out.println("First name?: ");
        firstName = scan.nextLine();
        System.out.println("Last name?: ");
        lastName = scan.nextLine();
        System.out.println("ZIP code? ");
        zipCode = scan.nextInt();
    }

    public String toString() {
        return firstName + "\t\t" + lastName + "\t\t" + zipCode;
    }


}
