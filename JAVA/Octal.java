class Octal {
    public static void main(String[] args) {
        int decimal = 33, rem;
        int octal = 0, i = 1;

        while (decimal != 0) {
            rem = decimal % 8;
            octal = octal + rem * i;
            decimal /= 8;
            i *= 10;
        }

        System.out.println(octal);
    }
}
