class Calculate{
    public static void main(String[] args){
        int raju_bal = 1500;
        int ch_price = 120;
        int contribution = 2000;
        int mohan_debt = 500;
        int rice_price = 80;
        int marie = 50;

        raju_bal -= 2*ch_price;
        raju_bal -= contribution/5;
        raju_bal += mohan_debt;
        raju_bal -= 5*rice_price;
        raju_bal -= marie;

        System.out.println("Raju's Balance: "+raju_bal);
        
    }
}