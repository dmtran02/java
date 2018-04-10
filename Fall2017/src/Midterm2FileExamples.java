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
public class Midterm2FileExamples {
    public static int numChars(String filename) throws FileNotFoundException{
        Scanner in = new Scanner(new File(filename));
        int numChars = 0;
        
        while(in.hasNextLine()){
            String line = in.nextLine()+1;
            numChars+=line.length();
        }
        in.close();
        return numChars;
    }
    
    public static int numCharsInWords(String filename) throws FileNotFoundException{
        Scanner in = new Scanner(new File(filename));
        int numChars = 0;
        
        while(in.hasNextLine()){
            String word = in.nextLine();
            numChars += word.length();
        }
        in.close();
        return numChars;
    }
    
    public static int numBlankLines(String filename) throws FileNotFoundException{
        Scanner in = new Scanner(new File(filename));
        int numBlankLines = 0;
        
        while(in.hasNextLine()){
            String line = in.nextLine();
            if(line.length() == 0){
                numBlankLines++;
            }
        }
        in.close();
        return numBlankLines;
    }
    
    public static double getAvg(String s) throws FileNotFoundException{
        Scanner in = new Scanner(s);
        String name = in.next();
        int sum = 0;
        int numScores = 0;
        while(in.hasNextInt()){
            sum+=in.nextInt();
            numScores++;
        }
        return sum/numScores;
    }
    
    public static double highAvg(String filename) throws FileNotFoundException{
        double highAvg = -1.0;
        Scanner in = new Scanner(new File(filename));
        while(in.hasNextLine()){
            String line = in.nextLine();
            double avg = getAvg(line);
            if(avg>highAvg){
                highAvg = avg;
            }
        }
        in.close();
        return highAvg;
    }
    
    public static void main(String[] args) throws FileNotFoundException{
        int count;
        double average;
        double highAvg;
        count=numChars("test.txt");
        System.out.println(count);
        count = numCharsInWords("test.txt");
        System.out.println(count);
        count = numBlankLines("test.txt");
        System.out.println(count);
        average = getAvg("79 81 50 40 24 27 59 86 89 63 69 70 84 10 105 41 95");
        System.out.println(average);
        highAvg = highAvg("scores.txt");
        System.out.println(highAvg);
        
    }
}
