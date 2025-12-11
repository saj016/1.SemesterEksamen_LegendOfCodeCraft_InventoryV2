package exceptions;

public class ExceedsAvailableSlotsException extends RuntimeException {
    public ExceedsAvailableSlotsException(String message) {
        super(message);
    }
}
