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
public class Midterm2 {
    
    /*public static int method1(int A[], int passingScore) {
        int counter = 0;
	for(int i = 0;i<A.length;i++){
            if(A[i]>=passingScore){
                counter++;
            }
        }
        return counter;
    }*/
    
    /*public static boolean method2(int A[]) {
        boolean result = true;
        int index = A.length-1;
        for(int i = 0;i<A.length;i++){
            if(A[i]==A[index]){
                index = index-1;
            }
            else{
                result = false;
            }
        }
        if(index == 0){
            result = true;
        }
        return result;
    }*/
    
    /*public static boolean same(int[] A, int[] B){
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
    }*/
    
    /*public static int[] copy(int []A){
        int B[] = new int[A.length];
        for(int i = 0;i<A.length;i++){
            B[i]=A[i];
        }
        return B;
    }*/
    
    /*public static int[] copyN(int []A, int n){
        int B[] = new int[n];
        for(int i = 0;i<n;i++){
            B[i]=A[i];
        }
        return B;
    }*/
    
    /*public static int[] slice(int[] A, int i, int j){
        int B[] = new int[(j-i)];
        int counter = 0;
        for(int k = i;k<j;k++){
            B[counter] = A[k];
            counter++;
        }
        return B;
    }*/
    
    /*public static int[] copyLarger(int A[], int n){
        int B[] = new int[A.length];
        int counter = 0;
        for(int i = 0;i<A.length;i++){
            if(A[i]>=n){
                B[counter]=A[i];
                counter = counter+1;
            }
        }
        int C[] = new int[counter];
        for(int j = 0;j<counter;j++){
            C[j]=B[j];
        }
        return C;
    }*/
    
    /*public static boolean ascendingOrder(int[] A){
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
    }*/
    
    /*public static int[] generateTriangleNumbers(int n){
        int A[] = new int[n];
        int sum = 0;
        int counter = 0;
        for(int i = 1;i<=n;i++){
            sum += i;
            A[counter] = sum;
            counter++;
        }
        return A;
    }*/
    
    /*public static String reversed(String input){
        StringBuilder sb = new StringBuilder();
        for(int i = input.length()-1;i>=0;i--){
            sb.append(input.charAt(i));
        }
        String result = sb.toString();
        return result;
    }*/
    
    /*public static String[] reverseArray(String A[]){
        String B[] = new String[A.length];
        for(int i = 0;i<A.length;i++){
            StringBuilder sb = new StringBuilder();
            String arrayWord = A[i];
            for(int j = arrayWord.length()-1;j>=0;j--){
                sb.append(arrayWord.charAt(j));
            }
            String result = sb.toString();
            B[i] = result;
        }
        return B;
    }*/
    
    /*public static void initialize(int A[][], int initVal){
        for(int i = 0;i<A.length;i++){
            for(int j = 0;j<A.length;j++){
                A[i][j] = initVal;
            }
        }
        System.out.println(Arrays.deepToString(A));
    }*/
    
    /*public static int largestItem(int A[][]){
        int max = 0;
        for(int i = 0;i<A.length;i++){
            for(int j = 0;j<A.length;j++){
                if(A[i][j]>max){
                    max = A[i][j];
                }
            }
        }
        return max;
    }*/
    
    /*public static int largestRow(int A[][]){
        int sum = 0;
        int high = 0;
        for(int i = 0;i<A.length;i++){
            for(int j = 0;j<A.length;j++){
                sum += A[i][j];
                if(sum>high){
                    high = sum;
                }
            }
        }
        return high;
    }*/
    
    /*public static int[] getCol(int A[][], int n){
        int counter = 0;
        int holder[] = new int[A.length];
        for(int i = 0;i<A.length;i++){
            holder[i] = A[i][n];
            counter++;
        }
        int result[] = new int[counter];
        for(int j = 0;j<counter;j++){
            result[j] = holder[j];
        }
        return result;
    }*/
    
    /*public static int largestCol(int A[][]){
        int high = 0;
        int sum = 0;
        for(int i = 0;i<A.length;i++){
            for(int j = 0;j<A.length;j++){
                sum+=A[j][i];
                }
            if(sum>high){
                high = sum;
                sum = 0;
            }
        }
        return high;
    }*/   
    
    public static void main(String args[]) {
	int A[][]={{10,20,30,40},
		   {11,22,33,44},
		   {12,24,36,48},
		   {17,21,72,9}};
    }
}