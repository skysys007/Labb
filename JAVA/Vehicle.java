import java.util.Scanner;

public class Vehicle {

    public String name;
    public static String companyName;
    public int speed, wheelerType;
    public float discountPerc, price;

    // Default Constructor
    public Vehicle() {
        name = "Default";
        wheelerType = 0;
        price = 0;
        speed = 0;
        discountPerc = 0;
    }

    // Parameterized Constructor
    public Vehicle(String name, String c_name, int wt, int speed, float dP, float price) {
        this.name = name;
        companyName = c_name;
        this.wheelerType = wt;
        this.speed = speed;
        this.discountPerc = dP;
        this.price = price;
    }

    // Display Vehicle Info
    public void getInfo() {
        System.out.println("\n----- Vehicle Information -----");
        System.out.println("Name: " + name);
        System.out.println("Company Name: " + companyName);
        System.out.println("Wheeler Type: " + wheelerType);
        System.out.println("Speed: " + speed);
        System.out.println("Original Price: " + price);
        System.out.println("Discounted Price: " + (price - (discountPerc * price)));
    }

    // Change price and speed
    public void changeInfo(float price, int speed) {
        this.price = price;
        this.speed = speed;
    }

    // Calculate Discount
    public void calcDiscount() {
        System.out.println("Discounted Price: " + (price - (discountPerc * price)));
    }

    // Change company (static method)
    public static void changeCompany(String newCompany) {
        companyName = newCompany;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User input for vehicle creation
        System.out.print("Enter Vehicle Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Company Name: ");
        String company = sc.nextLine();

        System.out.print("Enter Wheeler Type (2 or 4): ");
        int wt = sc.nextInt();

        System.out.print("Enter Speed: ");
        int speed = sc.nextInt();

        System.out.print("Enter Discount Percentage: ");
        float discount = sc.nextFloat();
        discount = discount / 100;  // convert to decimal

        System.out.print("Enter Price: ");
        float price = sc.nextFloat();

        Vehicle car = new Vehicle(name, company, wt, speed, discount, price);

        int choice;

        // Menu loop
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Show Vehicle Info");
            System.out.println("2. Change Price and Speed");
            System.out.println("3. Change Company Name");
            System.out.println("4. Show Discounted Price");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    car.getInfo();
                    break;

                case 2:
                    System.out.print("Enter New Price: ");
                    float newPrice = sc.nextFloat();

                    System.out.print("Enter New Speed: ");
                    int newSpeed = sc.nextInt();

                    car.changeInfo(newPrice, newSpeed);
                    System.out.println("Price and Speed updated successfully!");
                    break;

                case 3:
                    sc.nextLine(); // clear buffer
                    System.out.print("Enter New Company Name: ");
                    String newCompany = sc.nextLine();

                    Vehicle.changeCompany(newCompany);
                    System.out.println("Company name updated successfully!");
                    break;

                case 4:
                    car.calcDiscount();
                    break;

                case 0:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 0);

        sc.close();
    }
}
