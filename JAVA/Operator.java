class Operator{
    public static void main(String[] args){
        //Assignment Operators
        int num1 = 10;
        int num2 = 20;


        //Arithmetic Operators
        int sum = num1 + num2;
        int diff = num1 - num2;
        int div = num1 / num2;
        int product = num1 * num2;

        System.out.println("Sum: "+sum);
        System.out.println("difference: "+diff);
        System.out.println("division: "+div);
        System.out.println("product: "+product);

        //Comparison Operators
        if(num1>num2){
            System.out.println("num1 is greater that n num2");
        }else{
            System.out.println("num2 is greater that n num1");
        }

        //Logical Operators
        if(num1>num2 && sum>num1){
            System.out.println("Both statements are true");
        }
        if (true||false) {
            System.err.println("Either both or one of them is true");    
        }

        //Increment Operators
        System.out.println("Post Increment: " + num1++);
        System.out.println("Pre Increment: " + (++num1));

        //Decrement Operators
        System.err.println("Post Decrement: " + num2--);
        System.err.println("Pre Decrement: " + (--num2));

        boolean b1;

        //Ternary Operator
        b1 = (num1<num2)? true: false; 
        if (b1) {
            System.out.println("num1 is greater");
        }else{
            System.out.println("num2 is greater");
        }

    }
}