package exception;

public class ExceptionScope {

    //Catches and handles the exception that is thrown in level3.
    public void level1() {
//        System.out.println("Level 1 beginning.");
//        try {
//            level2();
//        } catch (ArithmeticException e) {
//            System.out.println();
//            System.out.println("The exception msg is: "+ e.getMessage());
//            System.out.println("The call stack trace: ");
//            e.printStackTrace();
//            System.out.println();
//        }

        //Lab3. What if the try statement were removed?
        System.out.println("Level 1 beginning.");
        level2();
        //level2() 에서 익셉션 처리 안해줬기때문에 3 시작부분까지만 찍히고 익셉션 stack trace 메시지만.
        /*
        Program beginning.
        Level 1 beginning.
        Level 2 beginning.
        Level 3 beginning.
        level2();
         */

        System.out.println("Level 1 ending.");
    }

    public void level2() {
//        System.out.println("Level 2 beginning.");
//        level3();
//        System.out.println("Level 2 ending.");

        //Lab4. What would happen if the try statement were moved to the level2 method?
        System.out.println("Level 2 beginning.");
        try {
            level3();
        }
        catch (ArithmeticException e) {
            System.out.println();
            System.out.println("The exception msg is: "+ e.getMessage());
            System.out.println("The call stack trace: ");
            e.printStackTrace();
            System.out.println();
        }
        System.out.println("Level 2 ending.");
        /*
        level2() 에서 level3() 호출하고 0으로 나눠지지않기 때문에 catch 블락이 실행됨
        Level2 실행되었다는 ending 까지는 찍힘
        Program beginning.
        Level 1 beginning.
        Level 2 beginning.
        Level 3 beginning.

        The exception msg is: / by zero
        The call stack trace:
        익셉션 메시지

        Level 2 ending.
        Level 1 ending.
        Program ending.
         */

    }

    public void level3() {
        int numerator = 10, denominator = 0;
        System.out.println("Level 3 beginning.");
        int result = numerator/denominator;
        System.out.println("Level 3 ending.");
    }

}
