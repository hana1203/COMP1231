package exception;

//Demonstrates exception propagation.
public class Propagation {
    //Invokes the level1 method to begin the exception demonstration.
    public static void main(String[] args) {
        ExceptionScope demo = new ExceptionScope();
        System.out.println("Program beginning.");
        demo.level1();
        System.out.println("Program ending.");

        //output
        /* 아무리바꿔도 call stack trace 가 Program ending. 찍히고 맨 마지막에 나온다...
Program beginning.
Level 1 beginning.
Level 2 beginning.
Level 3 beginning.

The exception msg is: / by zero
The call stack trace:

Level 1 ending.
Program ending.
java.lang.ArithmeticException: / by zero
	at exception.ExceptionScope.level3(ExceptionScope.java:29)
	at exception.ExceptionScope.level2(ExceptionScope.java:22)
	at exception.ExceptionScope.level1(ExceptionScope.java:9)
	at exception.Propagation.main(Propagation.java:9)

Process finished with exit code 0
         */


    }

}
