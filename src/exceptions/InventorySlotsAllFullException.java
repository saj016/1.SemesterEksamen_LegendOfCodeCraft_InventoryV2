package exceptions;

public class InventorySlotsAllFullException extends RuntimeException {
    public InventorySlotsAllFullException(String message) {
        super(message);
    }
}
