import java.util.Scanner;

class Main {

    static void issue(int stock, int req_stock) throws Exception {
        if (req_stock > stock) {
            throw new Exception("Not enough stock to issue");
        } else {
            stock -= req_stock;
            System.out.println("Remaining Balance: " + stock);
        }
    }

    public static void main(String[] args) {
        int stock = 500;
        System.out.println("Items in Stock: " + stock);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Stock quantity to request: ");
        int req_stock = sc.nextInt();
        sc.close();   

        try {
            issue(stock, req_stock);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}