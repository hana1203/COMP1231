package array.p9;

/*
Modify the program you created in Programming Project 7.8 to support the storing of additional user information:
street address (string), city (string), state (string), and 10-digit phone number
(long integer, contains area code and does not include special characters such as (, ), or -).
 */

import java.util.Scanner;
public class NameZipcode {
    String firstName, lastName;
    int zipCode;
    String address, city, state;
    long phone;

    public NameZipcode() {
        Scanner scan = new Scanner(System.in);
        System.out.println("First name?: ");
        firstName = scan.nextLine();
        System.out.println("Last name?: ");
        lastName = scan.nextLine();
        System.out.println("ZIP code?: ");
        zipCode = scan.nextInt();

        System.out.println("Address?: ");
        address = scan.nextLine();
        System.out.println("City?: ");
        city = scan.nextLine();
        System.out.println("State?: ");
        state = scan.nextLine();
        System.out.println("Phone number?:  ");
        phone = scan.nextLong();
        System.out.println("==input done for one user==\n");
    }

    public String toString() {
        return firstName + "\t\t" + lastName + "\t\t" + zipCode +
                "\naddress: " + address + "\t\tcity: " + city + "\t\tstate: "+ state + "\t\tphone number: "+ phone;
    }


}
