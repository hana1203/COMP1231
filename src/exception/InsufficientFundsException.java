package exception;

//  Represents an exceptional condition for a request for more money
//  than is contained in a bank account.
public class InsufficientFundsException extends Exception {

    //Sets up the exception object with a particular msg.
    InsufficientFundsException(String msg) {
        super(msg);
    }
}
