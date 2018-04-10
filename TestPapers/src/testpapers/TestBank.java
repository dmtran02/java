/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpapers;

/**
 *
 * @author tuf49524
 */
import java.util.*;
import java.io.*;
import java.lang.*;
public class TestBank {
    
    public List<String> questionList = new ArrayList<String>();
    public int questions;
    public String filename;
    
    public TestBank(int numQuestions, String fileQuestions){
        questions = numQuestions;
        filename = fileQuestions;
        int count = 0;
        List<String> createTest = new ArrayList<String>();
        
        try{
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            String currentLine;
            while((currentLine = br.readLine())!= null){
                System.out.println(currentLine);
                questionList.add(currentLine);
                count++;
            }
            fr.close();
            br.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        
        
        int i = 0;
        int track = 0;
        List<Integer> chosenQuestions = new ArrayList<Integer>();
        while(i < questions){
            int temp = (int)(Math.random()*count);
            while(chosenQuestions.contains(temp)){
                temp = (int)(Math.random()*count);
            }
            String holder = questionList.get(temp);
            createTest.add(holder);
            track++;
            i++;
        }
        
        
        try{
            Scanner in = new Scanner(System.in);
            System.out.print("Enter the name of your new test file: ");
            String fileHolder = in.nextLine();
            File filename = new File(fileHolder);
            PrintWriter pw = new PrintWriter(filename);
            for(int j = 0;j<track;j++){
                String temp = createTest.get(j);
                pw.print(temp+" \n");
                pw.println("");
            }
            pw.close();
            System.out.println("\nTest generation complete...");
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
