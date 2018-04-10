/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

/**
 *
 * @author Enneacle
 */
import java.util.*;

public class MultiStringcollclient {
    
    public static final String SENTINEL = "###";
    
    public static void main(String[] args){
        String in;
        Scanner kb = new Scanner(System.in);
        MultiStringcoll P = new MultiStringcoll(), N = new MultiStringcoll(), L = new MultiStringcoll();
        System.out.println("Enter a string or '###' to end input: ");
        in = kb.next();
        while (!in.equals(SENTINEL)) {
            if (P.belongs(in)) {
                N.insert(in);
                L.omit(in);
            }
            else{
                P.insert(in);
                L.insert(in);
            }
            System.out.println("Enter another string or '###' to end input: ");
            in=kb.next();
        }
        System.out.println("\nInputted // (P):");
        P.print();
        System.out.println("\nRemoved // (N):");
        N.print();
        System.out.println("\nRemaining // (L):");
        L.print();
    }
}
