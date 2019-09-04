//Challenge from chapter 2 challenge 13

/*
Write a program that computes the tax and tip on a resturant bill.
The program should ask the user to enter the charge for a meal. The tax should be 6.75 percent on the meal Charge.
The tip should be 20 percent of the total after  adding the tax. Display the meal charge, tax amount,tip amount, and
total bill on the screen



*/
import java.util.Scanner;  //Needed for the  the Scanner class

public class Resurant_Bill_Program
{
   public static void main(String[] args)
   {
   //Variables for the pay, tips, and total
   double pay;
   double tips;
   double taxpay;
   double number;
   double paytip;
   double total;
   
   //Create a scanner object to ask user for input
   Scanner keyboard=new Scanner(System.in);
   
   //Asks the users how much he spent
   System.out.print("How did you pay ?");
   pay=keyboard.nextDouble();
   
   
   //Calculate the tax
   taxpay=pay*(0.0675);
   
   //Adds the tax and the pay
   number=pay+taxpay;
   
   //Calculate the tips 
   paytip=number*(0.20);
   
   
   //Calculate the total
   total=(pay+taxpay+paytip);
   
   //print it all out
   System.out.println("your pay "+pay);
   System.out.println("Your tax "+taxpay);
   System.out.println("Your tip is "+paytip);
   System.out.println("Your total is "+total);
   
      
   
   }

}