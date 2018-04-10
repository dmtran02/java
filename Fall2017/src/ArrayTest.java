
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Enneacle
 */
public class ArrayTest {

   public static int[] whatHappens(int A[]) {
	int []B = new int[A.length];

	for (int i=0; i<A.length; i++) {
	    B[i]=A[i]*2;
	}
	return B;
    }
    
    public static void main(String args[]) {
	int A[] = {10,20,30};
        int B[] = new int[A.length];
	B = whatHappens(A);
	System.out.println(B[0]);
    }
}


