/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fractions;

/**
 * This class will perform functions involving fractions and two given numbers
 * @author Enneacle
 */
public class Fractions {
    
    /**
     * These are the two attributes we will use for this class
     */
    private int numerator;
    private int denominator;
    
    public Fractions(int userNumerator, int userDenominator){
        numerator = userNumerator;
        denominator = userDenominator;
    }
    
    /**
     * This method will return the numerator value of the fraction.
     */
    public int getNumerator(){
        return numerator;
    }
    
    /**
     * This method will return the denominator value of the fraction.
     */
    public int getDenominator(){
        return denominator;
    }
    
    /**
     * This method changes the current numerator value of the fraction to integer n.
     */
    public void setNum(int n){
        numerator = n;
    }
    
    /**
     * This method changes the current denominator value of the fraction to integer d.
     */
    public void setDenom(int d){
        denominator = d;
    }
    
    /**
     * This method will add two fractions together.
     */
    public Fractions add(Fractions a){//finish
        Fractions sum = new Fractions(0,0);
        if(denominator != a.denominator){
            sum.setNum(numerator*a.denominator+denominator*a.numerator);
            sum.setDenom(denominator*a.denominator);
        }
        else{
            sum.setNum(numerator+a.numerator);
            sum.setDenom(denominator);
        }
        reduce(sum);
        return sum;
    }
    
    /**
     * This method will find the GCF to simplify fractions
     */
    public Fractions reduce(Fractions sum){
        int gcf = gcf(sum.numerator,sum.denominator);
        System.out.println(sum);
        sum.numerator = sum.numerator/gcf;
        sum.denominator = sum.denominator/gcf;
        return sum;
    }
    
    /**
     * This method simplifies all fractions used and made in this class.
     */
    public Fractions simplify(Fractions sum){// 1/4+1/4 = 2/4 is not 2/2
        while(sum.numerator != sum.denominator){
            if(sum.numerator > sum.denominator){
                sum.numerator = sum.numerator - sum.denominator;
            }
            else{
                sum.denominator = sum.denominator - sum.numerator;
            }
        }
        return sum;
    }
    
    /**
     * This method handles all division over zero.
     */
    public int divideZero(Fractions a){
        int result = 0;
        if(a.denominator == 0){
            result = a.numerator;
        }
        return result;
    }
    
    /**
     * This method determines whether the two given fractions are EQUAL to each other.
     */
    public boolean equals(Fractions a){
        boolean result = false;
        if(numerator == a.numerator && denominator == a.denominator){
            result = true;
        }
        return result;
    }
    
    /**
     * This method converts the fraction as a String.
     */
    public String toString(){
        return (numerator+"/"+denominator);
    }

    private int gcf(int a, int b) {
        while(a!=0 && b!=0){
            int c = a;
            b = a%b;
            a = c;
        }
        return a+b;
    }
}
