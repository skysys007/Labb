// WAP to write the table for the user input number from 1 to 12 in a file and read the table back from file and display in the program. Use FileOutputStream to write and for reading use Buffered input stream.Use two diff one for performing read operation and one for read
import java.io.*;
import java.util.Scanner;

public class Main {

    public static void write(int num, String filename) throws IOException {
        FileOutputStream fos = new FileOutputStream(filename);

        for (int i = 1; i <= 12; i++) {
            String line = num + " x " + i + " = " + (num * i) + "\n";
            fos.write(line.getBytes());
        }

        fos.close();
        System.out.println("Table for " + num + " created\n");
    }

    public static void read(String filename) throws IOException {
        FileInputStream fis = new FileInputStream(filename);
        BufferedInputStream bis = new BufferedInputStream(fis);

        int ch;
        System.out.println("Reading table file: \n");

        while ((ch = bis.read()) != -1) {
            System.out.print((char) ch);
        }

        bis.close();
        fis.close();
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        String filename = String.valueOf(num) + ".txt";

        write(num, filename);
        read(filename);

        sc.close();
    }
}