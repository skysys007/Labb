import java.util.Scanner;

public class Vehicle {

    public String name;
    public static String companyName;
    public int Speed, wheelerType;
    public float discountPerc, price;

    public Vehicle() {
        name = "Default";
        wheelerType = 0;
        price = 0;
        Speed = 0;
        discountPerc = 0;
    }

    public Vehicle(String name, String c_name, int wt, int speed, float dP, float price) {
        this.name = name;
        companyName = c_name;   
        this.wheelerType = wt;
        this.Speed = speed;
        this.discountPerc = dP;
        this.price = price;
    }

    public void getInfo() {
        System.out.println("\nVehicle Information:");
        System.out.println("Name: " + name);
        System.out.println("Company Name: " + companyName);
        System.out.println("Wheeler Type: " + wheelerType);
        System.out.println("Speed: " + Speed);
        System.out.println("Original Price: " + price);
        System.out.println("Discounted Price: " + (price - (discountPerc * price)));
    }

    public void changeInfo(float price, int speed) {
        this.price = price;
        this.Speed = speed;
    }

    public void Calc_Disc() {
        System.out.println("Discounted Price: " + (price - (discountPerc * price)));
    }

    public static void changeCompany(String newCompany) {
        companyName = newCompany;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Vehicle Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Company Name: ");
        String company = sc.nextLine();

        System.out.print("Enter Wheeler Type (2 or 4): ");
        int wt = sc.nextInt();

        System.out.print("Enter Speed: ");
        int speed = sc.nextInt();

        System.out.print("Enter Discount Percentage (e.g., 0.10 for 10%): ");
        float discount = sc.nextFloat();
            
        System.out.print("Enter Price: ");
        float price = sc.nextFloat();

        Vehicle car = new Vehicle(name, company, wt, speed, discount, price);

        car.getInfo();

        sc.close();
    }
}
