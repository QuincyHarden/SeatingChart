import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
/**Tjis program will ask the user for a price, and see if there are seats available at that price**/
public class SeatingChart {
    
  public static void main(String[] args) { 
    //Sets up array and methods//
  int price = 0;
   int[][] seats ={
      {10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
      {10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
      {10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
      {10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
      {10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
      {10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
      {20, 20, 30, 30, 40, 40, 30, 30, 20, 20},
      {20, 40, 50, 50, 50, 50, 50, 50, 40, 20},
      {80, 50, 50, 80, 80, 80, 80, 50, 50, 30}
  };
  check(price,seats);
}
  /*This method will check the price the user entered until q or another non-int valued is entered*/
   public static void check(int number, int[][] seatNumber){
     String garbage = "";
     Scanner in = new Scanner(System.in);
    System.out.print("Please pick a price or press Q to quit: ");
   while(in.hasNextInt())
    {
    number = in.nextInt();
    
   if(number == 10)
   {
     System.out.println("Checking for the availability……");
     seat(number,seatNumber);
}
    else if(number == 20)
   {
     System.out.println("Checking for the availability……");
      seat(number,seatNumber);
}
     else if(number == 30)
   {
     System.out.println("Checking for the availability……");
       seat(number,seatNumber);
}
      else if(number == 40)
   {
     System.out.println("Checking for the availability……");
      seat(number,seatNumber);
}
       else if(number == 50)
   {
     System.out.println("Checking for the availability……");
       seat(number,seatNumber);
}
        else if(number == 80)
   {
     System.out.println("Checking for the availability……");
      seat(number,seatNumber);
}
   else{
     System.out.println("Please pick a valid price. Valid prices are $10, $20, $30, $40, $50, and $80, or q to quit"); 
}
}
   System.out.println("Thank you for using our online ticketing service. Goodbye!");
   }
   
   /*Checks all the seats in the array for the price*/
   public static void seat(int seat, int[][] place){
     for(int i = 0; i <9; i++){
       for(int j = 0;j <9; j++){
         if(place[i][j] == seat){
           confirmation(seat, place);
           return;
         }

       }
           
}
     noSeat(seat);
}
   
   /*If a seat is found at the price, the seat will be taken and sold out*/
   public static void confirmation(int free, int[][]seating){
      for(int i = 0; i <9; i++){
       for(int j = 0;j <9; j++){
         if(seating[i][j] == free){
           System.out.println("Your seat is confirmed! Your seat number is " + (1+j+(i*10)) + ". Enjoy your movie");
           seating[i][j] = 0;
           return;
         }
         

       }
           
}
   }
   
   /*If no seats are avaliable, will tell the user it is sold out*/
   public static void noSeat(int sorry){
      System.out.println("No seat at this price is available. Sorry!");
      return;
   }
   
}