//*********************************************************************
// FILE NAME    : Intcoll3.java
// DESCRIPTION  : This file contains the class Intcoll3.
//*********************************************************************

import java.util.*;

public class IntcollTest {
    
    private class ListNode{
        private int info;
        private ListNode link;
        
        public ListNode(){
            info = 0;
            link = null;
        }
        
        public ListNode(int i, ListNode p){
            info = i;
            link = p;
        }
    }

    private ListNode c;
    private int howmany;

    /**
     * Constructor populates array c with a size of 501 and stores a zero value
     * in index zero.
     */
    public IntcollTest() {
        c = null;
        howmany = 0;
    }

    /**
     * Constructor populates array c with a size of a given integer and stores a
     * zero value in index zero.
     *
     * @param i Size of array c + 1
     */
    public IntcollTest(int i) {
        c = null;
        howmany = 0;
    }

    /**
     * Makes a copy of Intcoll3 object (let's say A to B.) It first checks to
     * make sure you are not attempting to copy its own object Then it copies
     * A's capacity to match B's capacity, then tells us the length of the obj
     * array. New array will gets us storage of arrazy of same size, then copies
     * old array into new array.
     *
     * @param obj Intcoll3 object to copy
     */
    public void copy(IntcollTest obj) {
        if (this != obj) {
            c = null;
            ListNode j = obj.c, k = null, t = new ListNode();
            while (j != null) {
                t.info = j.info;
                if(k == null){
                    c = t;
                }
                else{
                    k.link = t;
                }
                k = t;
                t = new ListNode();
                j = j.link;
            }
            howmany = obj.howmany;
        }
    }

    /**
     * Checks if i appears in the collection
     *
     * @param i Value to check
     * @return Boolean value if it appears in the collection
     */
    public boolean belongs(int i) {
        ListNode j = c;
        while((j != null) && (j.info != i)){
            j = j.link;
        }
        return (j != null);
    }

    /**
     * Inserts item into collection If i is greater than 0 then it finds out if
     * i is already in collection If true, then then it's not there and needs to
     * be inserted Else, it is not inserted
     *
     * @param param1 Value to insert
     */
    public void insert(int i) {
        if (i > 0) {
            ListNode p = c;
            while((p != null) && (p.info != i)){
                p = p.link;
            }
            if (p == null){
                p = new ListNode(i, c);
                c = p;
                howmany++;
            }
        }
    }

    /**
     * If i is greater than 0, i is removed from the collection. Otherwise,
     * collection remains the same.
     *
     * @param i Value to omit
     */
    public void omit(int i) {
        ListNode j = c, p = null;
        while((j != null) && (j.info != i)){
            p = j;
            j = j.link;
        }
        if(p == null){
            c = j.link;
        }
        else{
            p.link = j.link;
        }
    }

    /**
     * Counts the number of values in the collection until it reaches a 0 value.
     *
     * @return howmany Number of values in collection until it reaches 0
     */
    public int get_howmany() {
        return howmany;
    }

    /**
     * Traverses array, prints each value of c in its own line until it reaches
     * a 0.
     */
    public void print() {
        if(this.howmany > 0){
            ListNode j = c;
            int n = 0;
            System.out.print("[");
            while(j != null){
                if(n != 0){
                    System.out.print(", ");
                }
                System.out.print(j.info);
                n++;
                j = j.link;
            }
            System.out.println("]");
        }
        else{
            System.out.println("[Empty Collection]");
        }
    }

    /**
     * Checks if the contents inside two Intcoll3 object are identical in
     * content, by comparing the j array for the current Intcoll3 object and
     * another given Intcoll3 object.
     *
     * @return result Boolean if two Intcoll3 objects are indentical in content
     */
    public boolean equals(IntcollTest obj) {
        ListNode j = c;
        boolean result = howmany == obj.howmany;
        while((j != null) && result){
            result = obj.belongs(j.info);
            j = j.link;
        }
        return result;
    }
}
