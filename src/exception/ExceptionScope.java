package exception;

public class ExceptionScope {

    //Catches and handles the exception that is thrown in level3.
    public void level1() {
        System.out.println("Level 1 beginning.");
        try {
            level2();
        } catch (ArithmeticException e) {
            System.out.println();
            System.out.println("The exception msg is: "+ e.getMessage());
            System.out.println("The call stack trace: ");
            e.printStackTrace();
            System.out.println();
        }
        System.out.println("Level 1 ending.");
    }

    public void level2() {
        System.out.println("Level 2 beginning.");
        level3();
        System.out.println("Level 2 ending.");
    }

    public void level3() {
        int numerator = 10, denominator = 0;
        System.out.println("Level 3 beginning.");
        int result = numerator/denominator;
        System.out.println("Level 3 ending.");
    }

}
