/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Duck
 */
import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;
public class NestEgg2 {
    
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.print("What is the starting balance? $");
        double balance = kb.nextDouble();
        System.out.print("What is the yearly interest rate (in percent)? ");
        double percent = kb.nextDouble();
        System.out.print("For how many years will you be saving? ");
        int years = kb.nextInt();
        double interest = (percent / 100);
        System.out.println(" ");
        System.out.println("Starting Balance: $"+balance);
        System.out.println("Interest Rate: "+percent+"% ---> "+interest);
        System.out.println("Years of Saving: "+years+" years");
        int i = 1;
        double year_balance = balance;
        double month_balance = balance;
        double day_balance = balance;
        double compound_month = Math.pow(1+(interest/12),(12*i));
        double compound_daily = Math.pow(1+(interest/365),(365*i));
        //double test = compound_month * month_balance;
        //System.out.println(compound_month);
        //System.out.println(test);
        System.out.println(" ");
        System.out.println("| " + "YEAR" + " | " + "  YEARLY" + "   | " + 
                " MONTHLY" + "  | " + "  DAILY" + "   |");
        
        while(i<=years){
            double per_year = (year_balance * interest);
            year_balance += per_year;
            double per_month = month_balance * compound_month;
            month_balance = per_month;
            double per_day = day_balance * compound_daily;
            day_balance = per_day;
            //System.out.println("$"+df.format(per_year));
            System.out.println("|     "+i+"| "+" $"+df.format(year_balance)
                    +" | "+"$"+df.format(month_balance)+" | "+"$"
                    +df.format(day_balance)+ " | ");
            i++;
        }
    }
    
}
