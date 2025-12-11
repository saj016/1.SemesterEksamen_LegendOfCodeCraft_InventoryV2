package exceptions;

public class InventorySlotAlreadyEmptyException extends RuntimeException {
    public InventorySlotAlreadyEmptyException(String message) {
        super(message);
    }
}
