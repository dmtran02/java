/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalterm;

/**
 *
 * @author Enneacle
 */
import java.util.*;
import java.io.*;

public class FinalTerm {

    /**
     * @param args the command line arguments
     */
    public static final int MAX = 10;
    public static final int NUM_CHANCES = 3;

    public static boolean isEqual(int[] A, int[] B) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] != B[i]) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean same(int[] A, int[] B){
        if(Arrays.equals(A,B)==true){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String args[]) throws FileNotFoundException {
        int[] A = {1, 2, 3, 4, 5};
        int[] B = {1, 2, 3, 4, 5};
        int[] C;
        String test = "i like cats";
        System.out.println(test.contains("like"));
        System.out.println(Arrays.equals(A, B));
    }
}
