public class Main {
    public static void main(String[] args) {

        MyString ms = new MyString("   hello world   ");

        System.out.println("Length: " + ms.length());

        ms.replace('o', 'x');
        System.out.print("After replace: ");
        ms.display();

        char[] trimmed = ms.trim();
        System.out.print("After trim: ");
        for (char c : trimmed) {
            System.out.print(c);
        }
    }
}