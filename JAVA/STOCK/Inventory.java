public class Inventory {
    private int stock;

    public Inventory(int stock) {
        this.stock = stock;
    }

    public void requestItem(int quantity) throws InsufficientStockException {
        if (quantity > stock) {
            throw new InsufficientStockException(quantity, stock);
        }
        stock -= quantity;
        System.out.println("Request successful! Remaining stock: " + stock);
    }

    public int getStock() {
        return stock;
    }
}