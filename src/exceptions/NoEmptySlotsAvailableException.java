package exceptions;

public class NoEmptySlotsAvailableException extends RuntimeException {
    public NoEmptySlotsAvailableException(String message) {
        super(message);
    }
}
