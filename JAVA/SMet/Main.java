public class Main{
    public static void main(String[] args) {
        String stri = "Gagan 123";

        System.out.println("STRING: " + stri);

        System.out.println("Length of the String: " + stri.length());

        System.out.println("Lowercase String: " + stri.toLowerCase());
        System.out.println("Capitalized String: " + stri.toUpperCase());

        String str = "   BLAANKKK SPACESSS    ";

        System.out.println("Untrimmed Text: " + str);
        System.out.println("Trimmed Text: " + str.trim());
        
        if (stri.contains("123")) {
            System.out.println("Given Strig contains 123");
        }

        System.out.println("Character at index 3 " + stri.charAt(3));

        System.out.println("Concatenated String : " + stri.concat(str));
        
        String str2 = "Gagan 123";
        if (stri.equals(str2)) {
            System.out.println("Both Strings are the same");
        }
    }
}