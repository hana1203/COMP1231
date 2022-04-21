package exception;

//Demonstrates an uncaught exception.
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
        /*
before the attempt to divide by zero
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at exception.Zero.main(Zero.java:11)  //call stack trace 빨간글씨로 찍힌다.

Process finished with exit code 1
         */