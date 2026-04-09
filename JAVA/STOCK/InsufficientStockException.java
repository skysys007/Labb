public class InsufficientStockException extends Exception {
    private int requested;
    private int available;

    public InsufficientStockException(int requested, int available) {
        super("Requested quantity :" + requested + " exceeds available stock: " + available + ".");
        this.requested = requested;
        this.available = available;
    }

    public int getRequested() {
        return requested;
    }

    public int getAvailable() {
        return available;
    }
}