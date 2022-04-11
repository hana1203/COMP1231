package polymorphism;
//Represents a general paid employee.
public class Employee extends StaffMember{
    protected String socialSecurityNumber;
    protected double payRate;

    //Constructor: Sets up this employee.
    public Employee(String eName, String eAddress, String ePhone, String socSecNumber, double rate) {
        super(eName, eAddress, ePhone);
        socialSecurityNumber = socSecNumber;
        payRate = rate;
    }

    @Override
    public double pay() {
        return payRate;
    }

    //Returns information about an employee as a string.
    public String toString() {
        String result = super.toString();
        result += "\nSocial Security Number: " + socialSecurityNumber;
        return result;
    }
}
