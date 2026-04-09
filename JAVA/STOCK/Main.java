import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory(10);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Available stock: " + inventory.getStock());
        System.out.print("Enter quantity to request: ");
        int requestedQuantity = scanner.nextInt();

        try {
            inventory.requestItem(requestedQuantity);
        } catch (InsufficientStockException e) {
            System.out.println("Stock Error: " + e.getMessage());
            System.out.println("Available stock: " + e.getAvailable());
        }

        scanner.close();
    }
}