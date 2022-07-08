package peaksoft.airbnbexample.exceptions;

/**
 * @author Muhammed Toichubai
 */
public class NotFoundException extends RuntimeException{
    public NotFoundException() {
        super();
    }

    public NotFoundException(String message) {
        super(message);
    }
}
