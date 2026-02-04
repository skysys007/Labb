class Quota{
    public static void main(String[] args) {
        double initial_fee = 100000;
        double course_fee ;
        double perc = 90;
        double discount;
        String quota = "merit";
        String addl_quota = "def";
        discount = switch (quota) {
            case "govt"-> 0.5;
            case "merit"->{
                if (perc>=90) {
                    yield 0.3;
                }else if (perc>=80 && perc<90) {
                    yield 0.2;
                }else if(perc>=70 && perc < 80){
                    yield  0.1;
                }else{
                    yield 0;
                }}
            default-> 0;
               
        };
        double discount_amount = discount*initial_fee;
        course_fee = initial_fee - discount_amount;
        System.out.println("Discount: " + discount_amount);
        System.out.println("Discounted Amount: " + course_fee);
        if(quota != "govt"){
            discount = switch (addl_quota){
            case "def"->0.1;
            case "dis"->0.2;
            default -> 0;
            };
        discount_amount = discount*initial_fee;
        course_fee -= discount_amount;
        System.out.println("Additional Discount: " + discount_amount);
        System.out.println("Final Amount to be paid: " + course_fee);
        }




    }
}