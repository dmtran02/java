/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Enneacle
 */
import java.util.Scanner;
public class NestEgg {
    
    public static void infoGather(){
        Scanner kb = new Scanner(System.in);
        System.out.print("What is the starting balance (in dollars)? $");
        int balance = kb.nextInt();
        System.out.println("You have entered: $"+balance);    
        percentInterest();
        System.out.print("How many years will you be saving? ");
        int years = kb.nextInt();
        System.out.println("You will be saving for "+years+" years.");
    }
    
    public static void percentInterest(){ //needs percent/decimal conversion
        Scanner kb = new Scanner(System.in);
        System.out.print("What's the yearly interest rate (in percent)? ");
        int percent = kb.nextInt();
        System.out.println("You have entered: "+percent+"%");
        double interest = percent / 100.0;
        System.out.println("Your interest as a decimal is "+interest);
    }
    
    public static void main(String[]args){
        Scanner kb = new Scanner(System.in);
        infoGather();
    }
}
