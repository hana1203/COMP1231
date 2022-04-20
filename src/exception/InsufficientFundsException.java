package exception;

public class InsufficientFundsException extends Exception {

    //Sets up the exception object with a particular msg.
    InsufficientFundsException(String msg) {
        super(msg);
    }
}
