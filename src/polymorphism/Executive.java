package polymorphism;

public class Executive extends Employee{
    private double bonus;

    public Executive(String eName, String eAddress, String ePhone, String socSecNumber,double rate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        bonus = 0; //흠.. 왜 굳이 넣는지 모르겠다
    }

    public void awardBonus(double eBonus) {
        bonus = eBonus;
    }

    @Override
    public double pay() {
        bonus = 0; //흠..
        return super.pay() + bonus;
    }

    @Override
    public String toString() {
        String result = super.toString();
        result += "\nBonus: " + bonus;
        return result;
    }
}
