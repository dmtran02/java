/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpapers;

import java.util.*;

/**
 *
 * @author Enneacle
 */
public class MultipleChoiceQuestion extends Question{
    
    public String correctAnswer;
    
    public MultipleChoiceQuestion(double worth, int level, int answerArea, String questionArea, String[] choices, String correctAnswerText) {
        super(worth, level, answerArea, questionArea);
        correctAnswer = correctAnswerText;
        System.out.println(questionArea+", Points: "+worth+", Difficulty: Level "+level);
        for(int i = 0;i<choices.length;i++){
            System.out.println(choices[i]);
        }
        System.out.print("\nAnswer: ");
    }
    
    public double checkAnswer(String answer){
        boolean result = true;
        while(result){
            if(answer.equalsIgnoreCase(correctAnswer)){
                System.out.println("\nYou have entered the correct answer!\n");
                addPoints(points);
                return points;
            }
            else{
                result = false;
                System.out.println("\nYou have entered the wrong answer!\n");
                return 0;
            }
        }
        return 0;
    }
    
     public String getAnswer(){
        return correctAnswer;
    }
}