package polymorphism;

public class Hourly extends Employee{
    private int hoursWorked;
    public Hourly(String eName, String eAddress, String ePhone, String socSecNumber, double rate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
//        hoursWorked = 0; //흠.. 왜 굳이 넣지?
    }

    public void addHours(int hours) {
        hoursWorked += hours;
    }

    @Override
    public double pay() {
        double payment = payRate * hoursWorked;
//        hoursWorked = 0;
        return payment;
    }

    public String toString() {
        String result = super.toString();
        result += "\nCurrent hours: " + hoursWorked;
        return result;
    }
}
