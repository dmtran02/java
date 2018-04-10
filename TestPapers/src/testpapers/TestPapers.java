/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpapers;

/**
 * This will be the driver class for the test...
 * @author Enneacle
 */
import java.util.*;
import java.io.*;
public class TestPapers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> questionList = new ArrayList<String>();
        List<String> answerKey = new ArrayList<String>();
        int totalPoints = 0;
        int count = 0;
        long startTime = System.currentTimeMillis();
        
        //beginning of objective questions
        ObjectiveQuestion q1 = new ObjectiveQuestion(20, 1, 10, "Who lives in a pineapple under the sea?", "Spongebob");
        String a1 = in.nextLine();
        totalPoints+=q1.checkAnswer(a1);
        String question = q1.getQuestion();
        questionList.add(question);
        String answer = q1.getAnswer();
        answerKey.add(answer);
        count++;
        
        ObjectiveQuestion q4 = new ObjectiveQuestion(10,2,10,"Who is the best CIS 1068 professor?", "John Fiore");
        String a4 = in.nextLine();
        totalPoints+=q4.checkAnswer(a4);
        question = q4.getQuestion();
        questionList.add(question);
        answer = q4.getAnswer();
        answerKey.add(answer);
        count++;
        //end
        
        //beginning of fillintheblank questions
        FillInTheBlankQuestion q2 = new FillInTheBlankQuestion(20, 1, 10, "__________________ was the 1st US President.", "George Washington");
        String a2 = in.nextLine();
        totalPoints+=q2.checkAnswer(a2);
        question = q2.getQuestion();
        questionList.add(question);
        answer = q2.getAnswer();
        answerKey.add(answer);
        count++;
        //end
        
        //beginning of MC questions (use arrays for possible answer choices and array lists to store questions and actual answers for file input
        String[] answerChoices = {"A. Leonardo DiCaprio", "B. John Fiore", "C. Mel Gibson", "D. Brad Pitt"};
        MultipleChoiceQuestion q3 = new MultipleChoiceQuestion(20,1,10, "Who is the main actor in the movie called Braveheart?", answerChoices, "Mel Gibson");
        String a3 = in.nextLine();
        totalPoints+=q3.checkAnswer(a3);
        question = q3.getQuestion();
        questionList.add(question);
        answer = q3.getAnswer();
        answerKey.add(answer);
        count++;
        //end
        
        //summary of test
        System.out.println("You have a total of "+totalPoints+" points!");
        long endTime = System.currentTimeMillis();
        long testTime = endTime-startTime;
        System.out.println("The test time was "+ (testTime/1000) +" seconds.\n");
        //end
        
        System.out.println(questionList); // prints list of questions
        System.out.println(answerKey); // prints list of answer keys
        
        //file creation prep
        System.out.print("\nWould you like a copy of this test and its answer key? (0 or 1) ");
        String userResponse = in.nextLine();
        if(userResponse.equals("1")){
            try{
                System.out.print("Enter the name of the file you wish to print the test in: ");
                String file = in.nextLine();
                File filename = new File(file);
                PrintWriter pw = new PrintWriter(filename);
                for(int i = 0;i<count;i++){
                    String temp = questionList.get(i);
                    System.out.println(temp);
                    pw.print(temp+" ");
                    temp = answerKey.get(i);
                    System.out.println(temp);
                    pw.print(temp+" \n");
                    //pw.println("");
                }
                /*pw.println("");
                for(int i = 0;i<count;i++){
                    String temp = answerKey.get(i);
                    System.out.println(temp);
                    pw.print(temp+" ");
                }*/
                System.out.println("\nCopy of test printed successfully...");
                pw.close();
            }
            catch(FileNotFoundException e){
                e.printStackTrace();
            }
        }
        
        System.out.print("\nDo you want to generate a test? (0 or 1) ");
        userResponse = in.nextLine();
        if(userResponse.equals("1")){
            System.out.print("\nHow many questions would you like? ");
            int numQuestions = in.nextInt();
            System.out.print("\n\nEnter the name of the file where the collection of questions are located: ");
            Scanner in1 = new Scanner(System.in);
            String file = in1.nextLine();
            TestBank t1 = new TestBank(numQuestions, file);
        }
    }
}