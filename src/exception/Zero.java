package exception;

public class Zero {
    //Deliberately divide by zero to produce an exception.
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;

        System.out.println("before the attempt to divide by zero");
        System.out.println(numerator/denominator);
        System.out.println("this will not be printed");
    }
}
