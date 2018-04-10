/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Enneacle
 */
public class ArtExtra {
    //parking lot setup
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
    
    public static void top(){
        System.out.print(SPACE);
        for(int i = 0;i<=SIZE*4;i++){
            System.out.print(LINE);
        }
        System.out.println(SPACE);
    }
    
    public static void body(){
        for(int i = 1;i<=SIZE*4;i++){
            System.out.print(upLINE);
            for(int j = 0;j<SIZE*2;j++){
                System.out.print(LINE);
            }
            System.out.print(upLINE);
            for(int k = 0;k<SIZE*2;k++){
                System.out.print(LINE);
            }
            System.out.print(upLINE);
            System.out.println(SPACE);
        }
    }
    //---------------
    
    public static void topStadium(){//36 _
        System.out.print(SPACE);
        for(int i = 3;i<=SIZE*9;i++){
            System.out.print(LINE);
        }
        System.out.println(SPACE);
    }
    
    public static void lineOne(){
        System.out.print(upLINE);
        for(int i = 3;i<=(SIZE*9)/2;i++){
            System.out.print(SPACE);
        }
        System.out.print(LINE);
        System.out.print(LINE);
        for(int j = 21;j<=SIZE*9;j++){
            System.out.print(SPACE);
        }
        System.out.print(upLINE);
    }
    
    public static void lineTwo(){
        System.out.print(upLINE);
        for(int i = 3;i<=((SIZE*9)/2)-2;i++){
            System.out.print(SPACE);
        }
        //inside diamond
        insideDiamond();
        for(int j = 23;j<=SIZE*9;j++){
            System.out.print(SPACE);
        }
        System.out.println(upLINE);
        System.out.print(upLINE);
        
        for(int i = 1;i<=((SIZE*9)/2)-6;i++){
            System.out.print(SPACE);
        }
        //inside diamond 2
        insideDiamond2();
        for(int j = 25;j<=SIZE*9;j++){
            System.out.print(SPACE);
        }
        System.out.println(upLINE);
        System.out.print(upLINE);
        for(int i = 1;i<=((SIZE*9)/2)-8;i++){
            System.out.print(SPACE);
        }
        //insideDiamond3
        insideDiamond3();
        for(int j = 27;j<=SIZE*9;j++){
            System.out.print(SPACE);
        }
        System.out.println(upLINE);
        System.out.print(upLINE);
        for(int i = 1;i<=((SIZE*9)/2)-10;i++){
            System.out.print(SPACE);
        }
        //insideDiamond4
        insideDiamond4();
        for(int j = 29;j<=SIZE*9;j++){
            System.out.print(SPACE);
        }
        System.out.println(upLINE);
        System.out.print(upLINE);
        middleDiamond();
    }
    
    public static void insideDiamond(){
        System.out.print(LINE);
        System.out.print(fwdSlash);
        for(int i = 1;i<=dotAmt;i++){
            System.out.print(DOT);
        }
        System.out.print(bwkSlash);
        System.out.print(LINE);
    }
    
    public static void insideDiamond2(){
        System.out.print(LINE);
        System.out.print(fwdSlash);
        for(int i = 1;i<=(dotAmt*3);i++){
            System.out.print(DOT);
        }
        System.out.print(bwkSlash);
        System.out.print(LINE);
    }
    
    public static void insideDiamond3(){
        System.out.print(LINE);
        System.out.print(fwdSlash);
        for(int i = 1;i<=(dotAmt*5);i++){
            System.out.print(DOT);
        }
        System.out.print(bwkSlash);
        System.out.print(LINE);
    }
    
     public static void insideDiamond4(){
        System.out.print(LINE);
        System.out.print(fwdSlash);
        for(int i = 1;i<=(dotAmt*7);i++){
            System.out.print(DOT);
        }
        System.out.print(bwkSlash);
        System.out.print(LINE);
    }
    //middle diamond
    public static void printStars(){
        for(int i = 1;i<=starAmt;i++){
            System.out.print(star);
        }
    }
    
    public static void middleDiamond(){
        for(int i = 1;i<=((SIZE*9)/2)-12;i++){
            System.out.print(SPACE);
        }
        System.out.print(LINE);
        System.out.print(fwdSlash);
        for(int i = 1;i<(dotAmt*3);i++){
            System.out.print(DOT);
        }
        printStars();
        for(int i = 1;i<(dotAmt*3);i++){
            System.out.print(DOT);
        }
        System.out.print(bwkSlash);
        System.out.print(LINE);
        for(int j = 31;j<=SIZE*9;j++){
            System.out.print(SPACE);
        }
        System.out.println(upLINE);
        System.out.print(upLINE);
        //first line
        for(int i = 1;i<=((SIZE*9)/2)-14;i++){
            System.out.print(SPACE);
        }
        System.out.print(LINE);
        System.out.print(fwdSlash);
        for(int i = 1;i<(dotAmt*4);i++){
            System.out.print(DOT);
        }
        printStars();
        for(int i = 1;i<(dotAmt*4);i++){
            System.out.print(DOT);
        }
        System.out.print(bwkSlash);
        System.out.print(LINE);
        for(int j = 33;j<=SIZE*9;j++){
            System.out.print(SPACE);
        }
        System.out.println(upLINE);
        System.out.print(upLINE);
        //second line
        for(int i = 1;i<=((SIZE*9)/2)-16;i++){
            System.out.print(SPACE);
        }
        System.out.print(LINE);
        System.out.print(fwdSlash);
        for(int i = 1;i<(dotAmt*5);i++){
            System.out.print(DOT);
        }
        printStars();
        for(int i = 1;i<(dotAmt*5);i++){
            System.out.print(DOT);
        }
        System.out.print(bwkSlash);
        System.out.print(LINE);
        for(int j = 35;j<=SIZE*9;j++){
            System.out.print(SPACE);
        }
        System.out.println(upLINE);
        System.out.print(upLINE);
        //third line
        for(int i = 1;i<=((SIZE*9)/2)-18;i++){
            System.out.print(SPACE);
        }
        System.out.print(LINE);
        System.out.print(fwdSlash);
        for(int i = 1;i<(dotAmt*6);i++){
            System.out.print(DOT);
        }
        printStars();
        for(int i = 1;i<(dotAmt*6);i++){
            System.out.print(DOT);
        }
        System.out.print(bwkSlash);
        System.out.print(LINE);
        for(int j = 37;j<=SIZE*9;j++){
            System.out.print(SPACE);
        }
        System.out.println(upLINE);
        System.out.print(upLINE);
        //fourth line
        for(int i = 1;i<=((SIZE*9)/2)-17;i++){
            System.out.print(SPACE);
        }
        System.out.print(bwkSlash);
        System.out.print(LINE);
        for(int i = 0;i<(dotAmt*5);i++){
            System.out.print(DOT);
        }
        printStars();
        for(int i = 0;i<(dotAmt*5);i++){
            System.out.print(DOT);
        }
        System.out.print(LINE);
        System.out.print(fwdSlash);
        for(int j = 36;j<=SIZE*9;j++){
            System.out.print(SPACE);
        }
        System.out.println(upLINE);
        System.out.print(upLINE);
        //fifth line
        for(int i = 1;i<=((SIZE*9)/2)-15;i++){
            System.out.print(SPACE);
        }
        System.out.print(bwkSlash);
        System.out.print(LINE);
        for(int i = 0;i<(dotAmt*4);i++){
            System.out.print(DOT);
        }
        printStars();
        for(int i = 0;i<(dotAmt*4);i++){
            System.out.print(DOT);
        }
        System.out.print(LINE);
        System.out.print(fwdSlash);
        for(int j = 34;j<=SIZE*9;j++){
            System.out.print(SPACE);
        }
        System.out.println(upLINE);
        System.out.print(upLINE);
        //sixth line
        for(int i = 1;i<=((SIZE*9)/2)-13;i++){
            System.out.print(SPACE);
        }
        System.out.print(bwkSlash);
        System.out.print(LINE);
        for(int i = 2;i<(dotAmt*4);i++){
            System.out.print(DOT);
        }
        printStars();
        for(int i = 2;i<(dotAmt*4);i++){
            System.out.print(DOT);
        }
        System.out.print(LINE);
        System.out.print(fwdSlash);
        for(int j = 32;j<=SIZE*9;j++){
            System.out.print(SPACE);
        }
        System.out.println(upLINE);
        System.out.print(upLINE);
        //seventh line
        for(int i = 1;i<=((SIZE*9)/2)-11;i++){
            System.out.print(SPACE);
        }
        System.out.print(bwkSlash);
        System.out.print(LINE);
        for(int i = 4;i<(dotAmt*4);i++){
            System.out.print(DOT);
        }
        printStars();
        for(int i = 4;i<(dotAmt*4);i++){
            System.out.print(DOT);
        }
        System.out.print(LINE);
        System.out.print(fwdSlash);
        for(int j = 30;j<=SIZE*9;j++){
            System.out.print(SPACE);
        }
        System.out.println(upLINE);
        System.out.print(upLINE);
        //eigth line
        for(int i = 1;i<=((SIZE*9)/2)-9;i++){
            System.out.print(SPACE);
        }
        System.out.print(bwkSlash);
        System.out.print(LINE);
        for(int i = 1;i<=dotAmt*6;i++){
            System.out.print(DOT);
        }
        System.out.print(LINE);
        System.out.print(fwdSlash);
        for(int j = 28;j<=SIZE*9;j++){
            System.out.print(SPACE);
        }
        System.out.println(upLINE);
        System.out.print(upLINE);
        //ninth line
        for(int i = 1;i<=((SIZE*9)/2)-7;i++){
            System.out.print(SPACE);
        }
        System.out.print(bwkSlash);
        System.out.print(LINE);
        for(int i = 1;i<=dotAmt*4;i++){
            System.out.print(DOT);
        }
        System.out.print(LINE);
        System.out.print(fwdSlash);
        for(int j = 26;j<=SIZE*9;j++){
            System.out.print(SPACE);
        }
        System.out.println(upLINE);
        System.out.print(upLINE);
        //tenth line
        for(int i = 1;i<=((SIZE*9)/2)-5;i++){
            System.out.print(SPACE);
        }
        System.out.print(bwkSlash);
        System.out.print(LINE);
        for(int i = 1;i<=dotAmt*2;i++){
            System.out.print(DOT);
        }
        System.out.print(LINE);
        System.out.print(fwdSlash);
        for(int j = 24;j<=SIZE*9;j++){
            System.out.print(SPACE);
        }
        System.out.println(upLINE);
        System.out.print(upLINE);
        //eleventh line
        for(int i = 1;i<=((SIZE*9)/2)-3;i++){
            System.out.print(SPACE);
        }
        System.out.print(bwkSlash);
        System.out.print(LINE);
        System.out.print(LINE);
        System.out.print(fwdSlash);
        for(int j = 22;j<=SIZE*9;j++){
            System.out.print(SPACE);
        }
        System.out.println(upLINE);
        System.out.print(upLINE);
        for(int i = 3;i<=SIZE*9;i++){
            System.out.print(LINE);
        }
        System.out.print(upLINE);
    }
    
    /*public static void testMethod(){
        System.out.print(LINE);
        System.out.print(fwdSlash);
        for(int i = 2;i<SIZE;i++){
            for(int j = 2;j<=dotCap;j*=3){
                System.out.print(DOT);
            }
        }
        System.out.print(bwkSlash);
        System.out.print(LINE);
    }*/
    
    public static void main(String[] args){
        //parking lot
        top();
        body();
        //-----
        
        //stadium
        topStadium();
        lineOne();
        System.out.println(" ");
        lineTwo();
        //end topDiamond
    }
}
