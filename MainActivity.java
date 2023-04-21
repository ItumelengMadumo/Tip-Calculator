import java.util.*;
import javax.swing.*;

public class TipCalculator
{
   
    /**
     * @param args
     */
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        int play = 1; 
        double bill;
        double tipPercentage; 
        double tip; 
        double billTip;
        int people;
        
       while (play == 1){
       System.out.println("What is the amount of the bill?"); 
       bill = sc.nextDouble();
       
       System.out.println("What percentage would you like to tip the waiter?");
       tipPercentage = sc.nextDouble(); 
       
       tip = bill * (tipPercentage/100);
       billTip = bill * (tipPercentage/100) + bill;
       
       System.out.println("Your tip amount is R" + tip); 
       System.out.println("Your bill + tip is R" + billTip);
       
       System.out.println("How many people would you like to split the bill with?");
       people = sc.nextInt();
       
       System.out.println("Each person needs to pay R" + billTip/people); 
       
       System.out.println("Would you like to use the Tip Calculator again? (1 for Yes, 2 for No)");
       play = sc.nextInt();
    }

}}