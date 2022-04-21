package exception;

//Represents an exceptional condition in which a value is
//out of some particular range.

public class OutofRangeException extends Exception {

    // Sets up the exception object with a particular msg.
    OutofRangeException(String msg) {
        super(msg);
    }

}
