// chapter 2 Miles per Gallon Calculator

/*
A car's miles per gallon (MPG) can be calculated witht he following formula:
         
         MPG= miles driven / Gallons of gas used
         
write a progam that asks the user for the number  and the gallons of gas used.
it should calulate the car's mile per gallon and display the result on the screen.

*/

import java.util.Scanner;  //Needed for the  the Scanner class


public class MPG_Program
{
   public static void main(String[] args)
   {
   double miles;        //Stores the miles
   double gallons;     //stores the gallons
   double mpg;           // calculates the mpg from miles/ gallons
   
   // Create a scanner onject to read input
   Scanner keyboard=new Scanner(System.in);
   
   //Get the miles driven
      System.out.print("How many miles have you driven?");
      miles=keyboard.nextDouble();
      
   // get the gallons used
      System.out.print("How many miles have you driven?");
      gallons=keyboard.nextDouble();
      
   //comsume the remaining newline.
   keyboard.nextLine();     //not required but doesn't do anything that is haremful
   
   //Calulates the MPG from miles and gallons
   mpg=((double)miles/gallons);
   
   //Displays the infromation back to the user:
   System.out.println("Your MPG from having used "+miles+" miles and using "+
                        gallons+" gallons is "+mpg);
   
   
   
   }


}