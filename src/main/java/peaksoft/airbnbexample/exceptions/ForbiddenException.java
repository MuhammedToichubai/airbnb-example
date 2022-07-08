package peaksoft.airbnbexample.exceptions;

/**
 * @author Muhammed Toichubai
 */
public class ForbiddenException extends RuntimeException{
    public ForbiddenException() {
        super();
    }

    public ForbiddenException(String message) {
        super(message);
    }
}
