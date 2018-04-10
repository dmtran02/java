/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Enneacle
 */
import java.util.*;
public class Midterm2Test {
    
    public static int greaterThanScore(int A[], int passingScore){
        int numItems = 0;
        for(int i = 0;i<A.length;i++){
            if(A[i]>=passingScore){
                numItems++;
            }
        }
        return numItems;
    }
    
    public static boolean backwardsArray(int A[]){
        boolean result = true;
        int counter = 0;
        for(int i = A.length-1;i>=0;i--){
            if(A[i]==A[counter]){
                counter++;
            }
            else{
                result = false;
                break;
            }
        }
        return result;
    }
    
    public static boolean same(int[] A, int[] B){
        boolean result = true;
        if(A.length == B.length){
            for(int i = 0;i<A.length;i++){
                for(int j = 0;j<A.length;j++){
                    System.out.println(A[i]+", "+B[j]);
                    if(A[i]==B[j]){
                        i++;
                        System.out.println("Arrays remain true...");
                    }
                    else{
                        result = false;
                        System.out.println("Arrays are not identical...");
                        break;
                    }
                }
            }
        }
        return result;
    }
    
    public static int [] copy(int[] A){
        int B[] = new int[A.length];
        for(int i = 0;i<A.length;i++){
            B[i]=A[i];
        }
        return B;
    }
    
    public static int [] copyN(int[] A, int n){
        int B[] = new int[n];
        for(int i = 0;i<n;i++){
            B[i]=A[i];
        }
        return B;
    }
    
    public static int [] slice(int[] A, int i, int j){
        int B[] = new int[(j-i)];
        int counter = 0;
        for(int k = i;k<j;k++){
            B[counter]=A[k];
            counter++;
        }
        return B;
    }
    
    public static int [] copyGreaterThan(int A[], int n){
        int counter = 0;
        int B[] = new int [A.length];
        for(int i = 0;i<A.length;i++){
            if(A[i]>=n){
                B[counter] = A[i];
                counter++;
            }
        }
        int C[] = new int[counter];
        for(int j = 0;j<counter;j++){
            C[j] = B[j];
        }
        return C;
    }
    
    public static boolean ascendingOrder(int[] A){
        boolean result = true;
        for(int i = 0;i<A.length;i++){
            if(i==A.length-1){
                break;
            }
            if(A[i]<A[i+1]){
                result = true;
            }
            else{
                result = false;
                break;
            }
        }
        return result;
    }
    
    public static int[] generateTriangleNumbers(int x){
        int sum = 0;
        int counter = 0;
        int B[] = new int[x];
        for(int i = 1;i<=x;i++){
            sum+=i;
            B[counter] = sum;
            counter++;
        }
        return B;
    }
    
    public static void main(String[] args){
        int A[] = {3,2,3,4,5,6,7};
        int B[] = {100,50,40,50,100};
        System.out.println(greaterThanScore(A, 70));
        System.out.println(backwardsArray(A));
        System.out.println(same(A,B));
        System.out.println(Arrays.toString(copy(A)));
        System.out.println(Arrays.toString(copyN(A,3)));
        System.out.println(Arrays.toString(slice(A,1,3)));
        System.out.println(Arrays.toString(copyGreaterThan(A,50)));
        System.out.println(ascendingOrder(A));
        System.out.println(Arrays.toString(generateTriangleNumbers(7)));
    }
}
