
import java.util.*;

/**
 *
 * @author dtran
 */
public class ArrayPractice {

    /* sets every item in A[] to initialValue */
    public static void initialize(int A[], int initialValue) {
        int B[] = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            B[i] = initialValue;
            System.out.println("Initial Value at index " + i + " is " + B[i] + ".");
        }
    }

    /* returns the average of the items in A
     * Be careful: A[] is an array of int and the method returns
     * double. What do we do to handle this? */
    public static double average(int A[]) { //done
        int sum = 0;
        int length = A.length;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }
        double average = sum / length;
        return average;
    }

    /* returns the number of times that x appears in A[] */
    public static int numOccurrences(int A[], int x) { //done
        int counter = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == x) {
                counter++;
            }
        }
        return counter;
    }


    /* returns the index of the first occurrence of
     * x in A[] or -1 if x doesn't exist in A[] */
    public static int find(int A[], int x) { //done
        int instance = -1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == x) {
                instance = i;
                break;
            }
        }
        return instance;
    }

    /* Returns the index of the first occurrence of
     * item within the first n elements of A[] or -1
     * if item is not among the first n elements of A[] */
    public static int findN(int A[], int item, int n) { //done
        int instance = -1;
        for (int i = 0; i < n; i++) {
            if (A[i] == item) {
                instance = i;
                break;
            }
        }
        return instance;
    }

    /* returns the index of the last occurrence of
     * x in A[] or -1 if x doesn't exist in A[] */
    public static int findLast(int A[], int x) {
        int instance = -1;
        for (int i = A.length - 1; i >= 0; i--) {
            if (A[i] == x) {
                instance = i;
                break;
            }
        }
        return instance;
    }

    /* returns the largest item found in A */
    public static int largest(int A[]) { //done
        int max = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }
        return max;
    }

    /* returns the index of the largest item found in A */
    public static int indexOfLargest(int A[]) {
        int max = 0;
        int instance = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }
        for (int j = 0; j < A.length; j++) {
            if (A[j] == max) {
                instance = j;
            }
        }
        return instance;
    }

    /* returns the index of the largest odd number
     * in A[] or -1 if A[] contains no odd numbers */
    public static int indexOfLargestOdd(int A[]) { //done
        int max = 0;
        int instance = -1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
            }
            if (max % 2 != 0) {
                max = 0;
            }
        }
        for (int j = 0; j < A.length; j++) {
            if (A[j] == max) {
                instance = j;
            }
        }
        return instance;
    }

    /* inserts n into A[] at A[index] shifting all */
 /*  the previous items one place to the right. For example */
 /*  if A is  */
 /*   |---+---+---+---+---+---+---+---+---+---| */
 /*   | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | */
 /*   |---+---+---+---+---+---+---+---+---+---| */
 /*   | 5 | 7 | 6 | 9 | 4 | 3 | 0 | 0 | 0 | 0 | */
 /*   |---+---+---+---+---+---+---+---+---+---| */

 /*   and we call insert(A, 15, 1), A then becomes */

 /*   |---+----+---+---+---+---+---+---+---+---| */
 /*   | 0 |  1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | */
 /*   |---+----+---+---+---+---+---+---+---+---| */
 /*   | 5 | 15 | 7 | 6 | 9 | 4 | 3 | 0 | 0 | 0 | */
 /*   |---+----+---+---+---+---+---+---+---+---| */
 /*  the element in A[] that's in the right-most */
 /*    position is removed.                      */
 /*                                              */
 /*  if index < 0 or index >= A.length-1, the method */
 /*                                    does nothing */
    public static void insert(int A[], int n, int index) { //done
        if (index < 0 || index > A.length) {
            index = -1;
        } else {
            A[index] = n;
        }
    }

    /* returns a new array consisting of all of the
     * elements of A[] */
    public static int[] copy(int A[]) { //done
        int length = A.length;
        int B[] = new int[length];
        for (int i = 0; i < A.length; i++) {
            B[i] = A[i];
        }
        return B;
    }

    /* Returns a new array consisting of all of the
       first n elements of A[]. If n>A.length, returns a
       new array of size n, with the first A.length elements
       exactly the same as A, and the remaining n-A.length elements
       set to 0. If n<=0, returns null. */
    public static int[] copyN(int A[], int n) { //done
        int B[] = new int[A.length];
        if (n <= 0 || n >= A.length) {
            B[0] = 0;
        } else {
            for (int i = 0; i <= n; i++) {
                B[i] = A[i];
            }
        }
        return B;
    }

    /* returns a new array consisting of all of the
     * elements of A[] followed by all of the
     * elements of B[]. For example, if 
     A[] is: {10,20,30} and 
     B[] is: {5, 9, 38}, the method returns the
     array : {10,20,30,5,9,38} */
    public static int[] copyAll(int A[], int B[]) { //done
        int length = A.length + B.length;
        int counter = 0;
        int interval = 0;
        int C[] = new int[length];
        for (int i = 0; i < A.length; i++) {
            C[i] = A[i];
            counter++;
        }
        for (int j = counter; j < length; j++) {
            C[j] = B[interval];
            interval++;
        }

        return C;
    }

    /* reverses the order of the elements in A[].
     * For example, if A[] is:
     {10,20,30,40,50}, after the method, A[] would
     be {50,40,30,20,10} */
    public static void reverse(int A[]) {
        int B[] = new int[A.length];
        int counter = A.length - 1;
        for (int i = 0; i < A.length; i++) {
            B[i] = A[counter];
            counter--;
        }
    }

    /* Extra credit:
     *
     * Returns a new array consisting of all of the
     * elements of A, but with no duplicates. For example,
     * if A[] is {10,20,5,32,5,10,9,32,8}, the method returns
     * the array {10,20,5,32,9,8} */
    public static int[] uniques(int A[]) {
        int[] unique = new int[A.length];
        int[] flush = new int[A.length];
        int[] testUnique = new int[A.length];    //initialize new array that will hold unique values
        ///////My edit
        for (int z = 0; z < testUnique.length; z++) {
            testUnique[z] = -1;
        }
        ///////
        for (int i = 0; i < A.length; i++) {
            boolean b = true;    //boolean that checks if an element is a duplicate
            for (int j = i + 1; j < A.length; j++) //check all elements above int i
            {
                if (A[i] == A[j]) {
                    b = false;    // set b to false if there is an existing duplicate
                }
            }
            if (b) {
                testUnique[i] = A[i];    // if no duplicates exist, then it is unique.
            }
        }
        for (int i = 0; i < testUnique.length; i++) {

            if (!(testUnique[i] == -1)) {
                flush[i] = testUnique[i];
            }
        }
        for (int k = 0; k < flush.length; k++) {
            if (!(flush[k] == 0)) {
                unique[k] = flush[k];
            }
        }
        return unique;
    }

    public static void main(String[] args) {

    }
}
