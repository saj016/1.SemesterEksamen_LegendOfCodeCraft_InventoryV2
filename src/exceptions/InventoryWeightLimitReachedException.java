package exceptions;

public class InventoryWeightLimitReachedException extends RuntimeException {
    public InventoryWeightLimitReachedException(String message) {
        super(message);
    }
}
