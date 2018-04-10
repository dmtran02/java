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
import java.io.*;
public class Midterm2FilePractice {
    
    public static int numChars(String filename) throws FileNotFoundException{
        int numChars = 0;
        Scanner in = new Scanner(new File(filename));
        while(in.hasNextLine()){
            String line = in.nextLine();
            numChars+=line.length();
        }
        in.close();
        return numChars;
    }
    
    public static int numWords(String filename) throws FileNotFoundException{
        int numWords = 0;
        Scanner in = new Scanner(new File(filename));
        while(in.hasNext()){
            String word = in.next();
            numWords++;
        }
        in.close();
        return numWords;
    }
    
    public static int longWord(String filename) throws FileNotFoundException{
        int longWord = 0;
        Scanner in = new Scanner(new File(filename));
        while(in.hasNext()){
            String wordLength = in.next();
            if(wordLength.length()>longWord){
                longWord = wordLength.length();
            }
        }
        in.close();
        return longWord;
    }
    
    public static double getAvg(String filename) throws FileNotFoundException{ //needs more practice
        double sum = 0;
        int numScores = 0;
        Scanner in = new Scanner(new File(filename));
        String name = in.next();
        while(in.hasNextInt()){
            sum+=in.nextInt();
            numScores++;
        }
        in.close();
        return sum/numScores;
    }
    
    public static int blankLines(String filename) throws FileNotFoundException{ 
        int numBlankLines = 0;
        Scanner in = new Scanner(new File(filename));
        while(in.hasNextLine()){
            String line = in.nextLine();
            if(line.length()==0){
                numBlankLines++;
            }
        }
        in.close();
        return numBlankLines;
    }
    
    public static void main(String[] args) throws FileNotFoundException{ 
        int numChars = 0;
        numChars = numChars("test.txt");
        System.out.println(numChars);
        int numWords = 0;
        numWords = numWords("test.txt");
        System.out.println(numWords);
        int longWord = 0;
        longWord = longWord("test.txt");
        System.out.println(longWord);
        double average = 0.0;
        average = getAvg("testscores.txt");
        System.out.println(average);
        int blankLines = 0;
        blankLines = blankLines("test.txt");
        System.out.println(blankLines);
    }
}
