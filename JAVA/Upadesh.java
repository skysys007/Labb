

class Upadesh{
    public static void main(String[] args){
        double Upadesh_Contribution =1000;
        double enu_bal = Upadesh_Contribution;
        double Divya_bal = Upadesh_Contribution;
        double roteping = 3*100;//played by divya
        double columbus = 50;//time played by enu
        double scratch_card = 5*20;//played by enu 
        double mobile_extra = 100;//paid by enu
        double ring_game = 50;//played by divya
        double r_game_won = 1000;//won by divya
        double hotel_price = 600;
        double h_enu =0.3*hotel_price;
        double h_divya = 0.7 * hotel_price;

        enu_bal = enu_bal - columbus - scratch_card - mobile_extra - h_enu;
        Divya_bal = Divya_bal - roteping - ring_game + r_game_won - h_divya;

        System.out.println("Final balance of Enu: " + enu_bal);
        System.out.println("Final balance of Divya: " + Divya_bal);

        double difference = Divya_bal - enu_bal;
        double perc = (difference/enu_bal)*100;
        System.out.println("Divya has " + perc + " %  more than enu");  

        


        



    }
}