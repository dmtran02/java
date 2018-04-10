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

public class Stringcollclient {

    public static final String SENTINEL = "###";

    public static void main(String[] args) {
        String in;
        Scanner kb = new Scanner(System.in);
        Stringcoll L = new Stringcoll(), P = new Stringcoll(), N = new Stringcoll();
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
