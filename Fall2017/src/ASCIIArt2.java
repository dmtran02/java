/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Enneacle
 */
public class ASCIIArt2 {
    
    static final char SPACE = ' ';
    static final int SIZE = 10;
    static final char fwdSlash = '/';
    static final char bwdSlash = '\\';
    
    public static void top(){
        System.out.print(SPACE);
        for(int i = 0;i<=SIZE*10;i++){
            System.out.print(fwdSlash);
        }
        System.out.println(SPACE);
    }
    
    public static void body(){
        for(int i = 0;i<=SIZE*20;i++){
            System.out.print(bwdSlash);
            for(int j = 0;j<SIZE*5;j++){
                System.out.print(fwdSlash);
            }
            System.out.print(bwdSlash);
            for(int k = 0;k<SIZE*5;k++){
                System.out.print(fwdSlash);
            }
            System.out.print(bwdSlash);
            System.out.println(SPACE);
        }
    }
    
    public static void bottom(){
        System.out.print("");
        for(int i = 0;i<=SIZE*10;i++){
            System.out.print(fwdSlash);
        }
    }
    
    public static void main(String[] args){
        top();
        body();
        bottom();
    }
}
