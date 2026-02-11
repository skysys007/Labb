class Pattern{
    public static void main(String[] args) {
        int i = 1, j;
        int num = 10;
        int temp= num-1;
        int k;
        while(i<=num){
            j = num-i;
            while(j>0){
                System.out.print(" ");
                j--;
            }
            k=0; 
            while(k<i){
                System.out.print("* ");
                k++;
            }
            System.out.print("\n");
            i++;
            j--;
        }
        num = temp;
        i = num;
        while(i>=0){
            j = num-i;
            while(j>=0){
                System.out.print(" ");
                j--;
            }
            k = 0;
            while(k<i){
                System.out.print("* ");
                k++;
            }
            System.out.print("\n");
            i--;

            
        }
    }
}