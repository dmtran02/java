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
public class MultiStringcoll {

    public static class btNode {

        public btNode left;
        public btNode right;
        public String info;
        public int count; // or key

        public btNode() {
            left = null;
            right = null;
            info = "";
            count = 1;
        }

        public btNode(String s, btNode lt, btNode rt) {
            left = lt;
            right = rt;
            info = s;
            count = 1;
        }

        public btNode(String s, btNode lt, btNode rt, int n) {
            left = lt;
            right = rt;
            info = s;
            count = n;
        }
    }
    
    private btNode c;
    private int how_many;
    
    public MultiStringcoll(){
        c = null;
        how_many = 0;
    }
    
    public MultiStringcoll(int i ){
        c = null;
        how_many = 0;
    }
    
    public void copy(MultiStringcoll obj)
    {
        if (this != obj)
        {
            c = btclone(obj.c);
            how_many = obj.how_many;
        }
    }
    
    public boolean belongs(String s){
        btNode a = c;
        while(a!=null && !a.info.equals(s)){
            if(a.info.compareToIgnoreCase(s)<0){
                a = a.right;
            }
            else{
                a = a.left;
            }
        }
        return a!=null;
    }
    
    public void insert(String s)
    {
        if(c==null) {
            c = new btNode(s, null, null);
            how_many++;
            return;
        }

        btNode a = c;
        btNode previous = a;
        
        while(a != null && !a.info.equals(s)) {
            previous = a;
            if(a.info.compareToIgnoreCase(s) < 0)
                a = a.right;
            else
                a = a.left;
        }

        if(a==null) {
            if(previous.info.compareToIgnoreCase(s) < 0)
                previous.right = new btNode(s, null, null);
            else
                previous.left = new btNode(s, null, null);
        }
        
        else
            a.count++;
        
        how_many++;
    }
    
    public void omit(String s){
       btNode test = c;
        btNode previous = null;
        while(test != null && !test.info.equals(s)) {
            previous = test;
            if(test.info.compareToIgnoreCase(s) < 0)
                test = test.right;
            else
                test = test.left;
        }
       
        //If all we're doing is removing 1 count of 1.
        if(test != null){
            test.count--;
            this.how_many--;
        }
        
        //Otherwise we have to remove the whole node
        if(test != null && test.count == 0) {
            btNode q = test;
            if(test.right == null)
                q = test.left;
            else if(test.left==null)
                q = test.right;
            else {
                btNode j = test.left;
                if(j.right==null) {
                    q = j;
                    q.right = test.right;
                } else {
                    while(j.right.right!=null)
                        j = j.right;
                    q = j.right;
                    j.right = q.left;
                    q.right = test.right;
                    q.left = test.left;
                }
            }

            if(previous == null)
                c = q;
            else if(previous.right == test)
                previous.right = q;
            else
                previous.left = q;

            how_many--;
        } 
    }
    
    public int get_howmany()
    {
        return how_many;
    }
    
    public void print()
    {
        btprint(c);
    }
    
    public boolean equals(MultiStringcoll obj)
    {
        if(how_many != obj.how_many)
            return false;
        String a1[] = new String[how_many];
        String a2[] = new String[how_many];
        int i=0;
        btToArray(c, a1, i);
        i=0;
        btToArray(obj.c, a2, i);

        boolean ret = true;
        for(i=0; ret && i<how_many; i++)
            ret = (a1[i].equals(a2[i]));

        return ret;
    }
    
    private static btNode btclone(btNode a) {
        if(a==null)
            return null;

        return new btNode(a.info, btclone(a.left), btclone(a.right));
    }
    
    private static int btToArray(btNode a, String[] s, int i) {
        if(a!=null) {
            i = btToArray(a.left, s, i);
            s[i++] = a.info; // i++ returns i before it adds 1, so a[i] == a[i++] != a[++i]
            i = btToArray(a.right, s, i);
        }
        return i;
    }
    
    private static void btprint(btNode a) {
        if(a==null)
            return;
        btprint(a.left);
        System.out.printf("%s (%d):: L: %s, R: %s\n", a.info, a.count, (a.left != null) ? a.left.info : "NULL", (a.right != null) ? a.right.info : "NULL");
        btprint(a.right);
    }
}
