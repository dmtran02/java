/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Enneacle
 */
import java.util.Scanner;
public class GradeCalculator {
    
    //The initial program shown here is only in its early stages of development 
    //not organized in methods for clarity. The intended job for this program is
    //to calculate grades for Homework, Exam1, and Exam 2.
    
    //At the start of the program, the program asks for three weight values to
    //help calculate the weighted score for each category.
    
    //In each category, points are calculated depending on how many points the
    //student achieved multiplied by their respective weights then divided by 
    //the maximum amount of points possible.
    
    //At the end of the program, the program prints out the weighted grades of
    //each respective category.
    
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Homework Weight? ");
        int hweight = scan.nextInt();
        System.out.print("Exam 1 Weight? ");
        int exam1Weight = scan.nextInt();
        System.out.print("Exam 2 Weight? ");
        int exam2Weight = scan.nextInt();
        
        //grade = weightedHomeworkScore + weightedExam1Score + weightedExam2Score
        //weightedHomeworkScore = 50 * (8.45 * 10 + 4 * 4) / (10 * 10 + 4 * 10)
        //weightedExam1Score = 20 * 81 / 100
        //weightedExam2Score = 30 * 100 / 100
        
        System.out.println("Using weights of "+hweight+", "+exam1Weight+", "+exam2Weight); //add in weights
        System.out.println(" ");
        
        //homework info
        System.out.println("Homework: ");
        System.out.print("Number of assignments? ");
        int assignments = scan.nextInt();
        if(assignments < 0){
            assignments = 0;
        }
        System.out.print("Average Homework Grade? ");
        double avgHW = scan.nextDouble();
        System.out.print("Number of late days used? ");
        //modify to account for late days (if statements)
        int lateDays = scan.nextInt();
        System.out.print("Labs attended? ");
        int labs = scan.nextInt();
        if(labs>assignments/2){
            avgHW = avgHW - (avgHW*0.10);
        }
        else if(lateDays==0){
            if(avgHW>=((10 * 10 + 4 * 10))){
                avgHW = ((10 * 10 + 4 * 10));
            }
            else{
                avgHW+=5;
            }
        }
        double hwPoints = avgHW * 10 + labs * 4;
        double weightedHomeworkScore = hweight * (avgHW * 10 + labs * 4) / (10 * 10 + 4 * 10);
        System.out.println("Total Points: "+hwPoints+"/"+(10 * 10 + 4 * 10));
        System.out.println("Weighted Score: "+weightedHomeworkScore);
        System.out.println(" ");
        
        //exam 1 info 
        System.out.println("Exam 1: ");
        System.out.print("Score? ");
        double exam1Score = scan.nextInt();
        System.out.print("Curve? ");
        int exam1Curve = scan.nextInt();
        exam1Score += exam1Curve;
        System.out.println("Total Points: "+exam1Score+"/"+"100");
        if(exam1Score > 100){
            exam1Score = 100;
        }
        double weightedExam1Score = exam1Weight * exam1Score / 100;
        System.out.println("Weighted Score: "+weightedExam1Score);
        System.out.println(" ");
        
        //exam 2 info //weightedExam2Score = 30 * 100 / 100
        System.out.println("Exam 2: ");
        System.out.print("Score? ");
        int exam2Score = scan.nextInt();
        System.out.print("Curve? ");
        int exam2Curve = scan.nextInt();
        exam2Score += exam2Curve;
        if(exam2Score > 100){
            exam2Score = 100;
        }
        System.out.println("Total Points: "+exam2Score+"/"+"100");
        double weightedExam2Score = exam2Weight * exam2Score / 100;
        System.out.println("Weighted Score: "+weightedExam2Score);
        System.out.println(" ");
        
        //course grade
        double grade = weightedHomeworkScore + weightedExam1Score + weightedExam2Score;
        System.out.println("Course Grade: "+grade);
    }
}
