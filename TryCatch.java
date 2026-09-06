public class TryCatch{
    public static void main(String[] args) {

        // Try key word:
        // Used to enclose a block of code that may throw an exception.
        // If an exception is thrown, the catch block will handle it.
        // Catch key word:
        // Used to catch an exception thrown by the try block.
        // The catch block is followed by the type of exception to catch.
        // The catch block is optional.
        // If no catch block is present, the exception will be propagated to the caller.
        // Finally key word:
        // Used to enclose a block of code that will be executed regardless of whether an exception is thrown or not.
        // The finally block is optional.
        // If no finally block is present, the exception will be propagated to the caller.
        

        // Throw key word:
        // Used to throw an exception.
        // The throw statement is used to throw an exception.
        // The exception can be of any type.
        // Throws key word:
        // Used to declare that a method may throw an exception.
        // The throws keyword is used to declare that a method may throw an exception.
        // The throws keyword is followed by the type of exception that may be thrown.
        // The throws keyword is used in the method signature.

        // throwable:
        // The throwable class is the superclass of all exceptions and errors.
        // The throwable class is used to handle exceptions and errors.
        // The throwable class is the base class for all exceptions and errors.
        
        // Throwing an exception:
        try {
            throw new Exception("This is a custom exception");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Throwing a custom exception:
        try {
            throw new CustomException("This is a custom exception");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }

    // throws:
    public static void throwsException() throws Exception {
        throw new Exception("This is a custom exception");
    }
}

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
