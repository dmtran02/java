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
public class ObjectiveQuestion extends Question{
    
    /**
     * Single field for correct answer of Objective Questions
     * correctAnswer - provides the correct answer for the question
     */
    
    public String correctAnswer;
    
    /**
     * Constructor for Objective Questions
     * @param worth
     * @param level
     * @param answerArea
     * @param questionArea
     * @param correctAnswerText 
     */
    
    public ObjectiveQuestion(double worth, int level, int answerArea, String questionArea, String correctAnswerText){
        super(worth, level, answerArea, questionArea);
        correctAnswer = correctAnswerText;
        System.out.println(questionArea+", Points: "+worth+", Difficulty: Level "+level);
        System.out.print("\nAnswer: ");
    }
    
    /**
     * Method gets correct answer for current question
     * @param answer 
     */
    
    public void setCorrectAnswer(String answer){
        correctAnswer = answer;
    }
    
    /**
     * Checks if user answer equals question answer
     * If correct, the user will receive points according to the value of the question
     * If incorrect, the user gets the question wrong and goes onto the next question
     * @param answer
     * @return 
     */
    
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