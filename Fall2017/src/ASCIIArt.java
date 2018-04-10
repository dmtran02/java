/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Enneacle
 */
public class ASCIIArt {
    static final char SPACE = ' ';
    static final int SIZE = 2;
    static final char LINE = '_';
    static final char upLINE = '|';
    
    public static void top(){
        System.out.print(SPACE);
        for(int i = 0;i<=SIZE*10;i++){
            System.out.print(LINE);
        }
        System.out.println(SPACE);
    }
    
    public static void body(){
        for(int i = 0;i<=SIZE*20;i++){
            System.out.print(upLINE);
            for(int j = 0;j<SIZE*5;j++){
                System.out.print(LINE);
            }
            System.out.print(upLINE);
            for(int k = 0;k<SIZE*5;k++){
                System.out.print(LINE);
            }
            System.out.print(upLINE);
            System.out.println(SPACE);
        }
    }
    
    public static void main(String[] args){
        top();
        body();
    }
}
