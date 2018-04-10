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
public class Question {
    
    /**
     * Private fields for this main Question class
     * points - score value
     * difficulty - 1 to 5 rating of problem
     * answerSpace - space for answer to question using " " (space) or proper number of lines
     * questionText - area to place the question
     */
    public double points;
    public int difficulty, answerSpace;
    public String questionText;
    public int MIN_DIFFICULTY = 1; //added recently to measure the minimum difficulty
    public int MAX_DIFFICULTY = 5; //added recently to measure the maximum difficulty
    public double userPoints = 0;
    
    /**
     * Constructor that creates a simple-structured question
     * @param worth
     * @param level
     * @param answerArea
     * @param questionArea 
     */
    
    public Question(double worth, int level, int answerArea, String questionArea){
        points = worth;
        difficulty = level;
        answerSpace = answerArea;
        questionText = questionArea;
    }
    
    /**
     * Method that adjusts point value to question
     * @param value 
     */
    
    public void setPoints(double value){
        points = value;
    }
    
    /**
     * Method sets difficulty of question
     * @param toughness 
     */
    
    public void setDifficulty(int toughness){
        difficulty = toughness;
        if(MIN_DIFFICULTY > difficulty || MAX_DIFFICULTY < difficulty){
            System.out.println("Please restart the test program and enter the correct difficulty value from 1 to 5.");
            System.exit(0);
        }
    }
    
    /**
     * Method sets space for answer to question in amount of lines or spaces
     * @param space 
     */
    
    public void setAnswerSpace(int space){
        answerSpace = space;
    }
    
    /**
     * Method sets the context of the question
     * @param question 
     */
    
    public void setQuestionText(String question){
        questionText = question;
    }
    
    /**
     * Adds points for each correct answer the user inputs.
     * @param add 
     */
    
    public double addPoints(double add){
        userPoints+=add;
        System.out.println("\nYou have gained "+userPoints+" points!\n");
        return userPoints;
    }
    
    /**
     * Method returns String value of Question constructor
     */
    
    public String toString(){
        return (questionText+", "+points+"pts, Difficulty: Level "+difficulty);
    }
    
    /**
     * Gets question text for the questionList
     * @return 
     */
    public String getQuestion(){
        return questionText;
    }
}