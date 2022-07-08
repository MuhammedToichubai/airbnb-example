package peaksoft.airbnbexample.exceptions;

/**
 * @author Muhammed Toichubai
 */
public class BadRequestException extends RuntimeException{
    public BadRequestException() {
        super();
    }

    public BadRequestException(String message) {
        super(message);
    }
}
