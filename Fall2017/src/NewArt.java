/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Enneacle
 */
public class NewArt {
    static final char SPACE = ' ';
    static final int SIZE = 4;
    static final char LINE = '_';
    static final char upLINE = '|';
    static final char DOT = '.';
    static final char fwdSlash = '/';
    static final char bwkSlash = '\\';
    static final int dotAmt = 2;
    static final int dotCap = dotAmt*7;
    static final int starAmt = 8;
    static final int starLayer = SIZE*2;
    static final char star = '*';
    
    public static void borderTop(){
        System.out.print(SPACE);
        for(int i = 1;i<=(SIZE*8)+2;i++){
            System.out.print(LINE);
        }
    }
    
    public static void space(){
        for(int i = 0;i<SIZE*4;i++){
            System.out.print(SPACE);
        }
    }
    
    public static void space1(){
        for(int i = 0;i<(SIZE*4)-2;i++){
            System.out.print(SPACE);
        }
    }
    
    public static void space2(){
        for(int i = 0;i<(SIZE*3);i++){
            System.out.print(SPACE);
        }
    }
    
    public static void space3(){
        for(int i = 0;i<(SIZE*3)-2;i++){
            System.out.print(SPACE);
        }
    }
    
    public static void dotMaker(){
        System.out.print(upLINE);
        space1();
        System.out.print(LINE);
        System.out.print(fwdSlash);
        for(int i = 0;i<SIZE/2;i++){
            System.out.print(DOT);
        }
        System.out.print(bwkSlash);
        System.out.print(LINE);
        space1();
        System.out.println(upLINE);
    }
    
    public static void dotMaker2(){
        System.out.print(upLINE);
        space2();
        System.out.print(LINE);
        System.out.print(fwdSlash);
        for(int i = 0;i<(SIZE/2)*3;i++){
            System.out.print(DOT);
        }
        System.out.print(bwkSlash);
        System.out.print(LINE);
        space2();
        System.out.println(upLINE);
    }
    
    public static void dotMaker3(){
        System.out.print(upLINE);
        space3();
        System.out.print(LINE);
        System.out.print(fwdSlash);
        for(int i = 0;i<(SIZE/2)*5;i++){
            System.out.print(DOT);
        }
        System.out.print(bwkSlash);
        System.out.print(LINE);
        space3();
        System.out.println(upLINE);
    }
    
    public static void main(String[] args){
        borderTop();
        
        System.out.println(SPACE);
        System.out.print(upLINE);
        space();
        System.out.print(LINE);
        System.out.print(LINE);
        space();
        System.out.println(upLINE);
        dotMaker();
        dotMaker2();
        dotMaker3();
    }
}
