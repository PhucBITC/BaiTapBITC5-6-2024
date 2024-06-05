/**
 * TimeCovesionApp
 */
public class TimeCovesionApp {
   private int hours;
   private int days;

   public TimeCovesionApp(int h , int d){
    this.hours = h ; 
    this.days =  d ; 
   }
   static int h_minutes(int x){
    return x * 60 ; 
   }
   static int d_minutes(int y ){
    return  y * 24 * 60 ;
   }
   public static void main(String[] args) {
    System.out.println("2 h chuyen thanh so phut la" + h_minutes(2) + "phut ");
    System.out.println("3 d chuyen thanh so phut la" + d_minutes(3) + "phut ");
   }

}
