
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr1[][] = new int[2][2];
        int arr2[][] = new int[2][2];
        int arr3[][] = new int[2][2];

        System.out.println("Enter the first Matrix: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Enter element" + i + j + ": ");
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the second Matrix");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Enter element" + i + j + ": ");
                arr2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    arr3[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }


        System.out.println("RESULTANT MATRIX: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print( arr3[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}