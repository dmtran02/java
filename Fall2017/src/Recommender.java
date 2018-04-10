
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author x230
 */
public class Recommender {

    public static double weighted_average(int[] userRating, int[][] ratingList) {
        int result = 0;
        return result;
    }

    public static void score(double[] p2Sim, double p1, int[] userRating, int[][] ratingList) {// caculates cosine similarity score
        double result = 0;
        int both = 0;
        int row = 0;
        int col = 0;
        int interval = 0;
        for (int i = 0; i < ratingList.length; i++) {
            System.out.println(row+"-"+col);

            if (userRating[i] == ratingList[row][col]) {
                both = userRating[i] * ratingList[row][col];
                col++;
            }
            if (col == 19) {
                row++;
                result = (both / (p1 * p2Sim[i]));
                interval++;
                System.out.println("The cosine similarity between you and this person is " + result);
                col=0;
                i=0;
            } else if (row == 29) {
                break;
            }else{
                col++;
            }
        }

    }

    public static void similarity(int[] userRating, int[][] ratingList) { //store similarties in an int array and then caculate similarities
        int[] userSim = new int[21]; //length 21 to include user similarity
        double[] p2Sim = new double[30];
        System.out.println("Similarity Checkpoint 2...");
        for (int index = 0; index < userRating.length; index++) {
            userSim[index] = userRating[index];
        }
        double result = 0;
        double sum = 0;
        double product;
        double user = 0;
        double p2 = 0;
        //int both;

        for (int i = 0; i < userSim.length; i++) {
            if (userSim[i] != -1) {
                product = (userSim[i] * userSim[i]);
                sum += product;
            }
        }
        result = Math.sqrt(sum);
        user = result;

        System.out.println("Similarity Checkpoint 3...");

        for (int j = 0; j < 30; j++) {
            result = 0;
            p2 = 0;
            sum = 0;
            for (int k = 0; k < 20; k++) {
                if (ratingList[j][k] != -1) {
                    product = ratingList[j][k] * ratingList[j][k];
                    sum += product;
                }
                if (k == 19) {
                    result = Math.sqrt(sum);
                    p2 = result;
                    p2Sim[j] = p2;
                }
            }
        }
        score(p2Sim, user, userRating, ratingList);
        //cosine similarity method
        /*int row = 0;
        int col = 0;
        int interval = 1;
        for(int l = 0;l<userRating.length;l++){
            if(userRating[l]==ratingList[row][col]){
                both = userRating[l]*ratingList[row][col];
            }
            col++;
            if(col==20){
                row++;
                interval++;
            }
            else if(interval==30){
                break;
            }
        }*/

    }

    public static int[][] recommendation(String filename) throws FileNotFoundException {
        Scanner in = new Scanner(new File(filename));
        int[][] ratingList = new int[30][20];
        int row = 0;
        int col = 0;
        while (in.hasNext()) {
            for (int i = 0; i < 30; i++) {
                for (int j = 0; j < 20; j++) {
                    String number = in.next();
                    ratingList[i][j] = Integer.parseInt(number);
                    col++;
                }
                if (col == 20) {
                    col = 0;
                }
                row++;
                if (row == 31) {
                    break;
                }
            }
        }
        return ratingList;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner movies = new Scanner(new File("movies.txt"));
        Scanner ratings = new Scanner(new File("ratings.txt"));
        Scanner kb = new Scanner(System.in);
        int[] userRating = new int[20];
        String line;
        int counter = 1;
        int index = 0;
        System.out.println("Please enter your rating for the following movies from 1 to 5. If you have not seen the movie, enter -1: ");
        while (movies.hasNext()) {
            line = movies.nextLine();
            System.out.println("-" + counter + "-");
            System.out.print("Enter your rating for " + line + ": ");
            int rate = kb.nextInt();
            userRating[index] = rate;
            index++;
            counter++;
        }
        int[][] ratingList = recommendation("ratings.txt"); //receives recommendation
        System.out.println("Similarity Checkpoint 1...");
        similarity(userRating, ratingList);
    }
}
