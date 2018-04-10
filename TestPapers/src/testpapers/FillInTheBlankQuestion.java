/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpapers;

/**
 *
 * @author Enneacle
 */
public class FillInTheBlankQuestion extends Question{
    
    public String correctAnswer;
    
    public FillInTheBlankQuestion(double worth, int level, int answerArea, String questionArea, String correctAnswerText) {
        super(worth, level, answerArea, questionArea);
        correctAnswer = correctAnswerText;
        System.out.println(questionArea+", Points: "+worth+", Difficulty: Level "+level);
        System.out.print("\nAnswer: ");
    }
    
    public void setCorrectAnswer(String answer){
        correctAnswer = answer;
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