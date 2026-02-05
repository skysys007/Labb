

class Armstrong{
    public static void main(String[] args) {
        int num = 153;
        int temp = num;
        int power = 0;
        while(temp!=0){
            temp/=10;
            power++;
        }
        temp = num;
        System.out.println(power);
        int sum = 0, rem;
        while(temp!=0){
            rem = temp%10;
            sum+=Math.pow(rem, power);
            temp/=10;
        }
        System.out.println(sum);
        if(sum == num){
            System.out.println("Number is an armstrong");
        }else{
            System.out.println("Number is not an armstrong");
        }

    }
}