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

public class NetflixChallenge {

    public static double weighted_average(int N, int A[], int w[]) {
        int result = 0;
        return result;
    }

    public static void recommendation(String filename) throws FileNotFoundException {
        Scanner in = new Scanner(new File(filename));
        String[][] ratingList = new String[30][20];
        while (in.hasNext()) {
            for (int i = 0; i < ratingList.length; i++) {
                for (int j = 0; j < ratingList.length; j++) {
                    String number = in.next();
                    ratingList[i][j] = number;
                    System.out.println(Arrays.deepToString(ratingList));
                }
            }
        }
    }

    /*public static void recommendation(int[] userRating, String filename) throws FileNotFoundException {
        Scanner in = new Scanner(filename);
        int[][] ratingList = new int[30][20];
        int row = 0;
        int col = 0;
        while (in.hasNext()) {
            String number = in.nextLine();
            System.out.println(number);
            int numberRating = Integer.parseInt(number);
            System.out.println(numberRating);
            ratingList[row][col] = numberRating;
            if(row == 30){
                row = 0;
            }
            else if(col == 20){
                col = 0;
            }
        }
        System.out.println(Arrays.deepToString(ratingList));
    }*/
    public static void main(String[] args) throws FileNotFoundException {
        Scanner movies = new Scanner(new File("movies.txt"));
        Scanner ratings = new Scanner(new File("ratings.txt"));
        Scanner kb = new Scanner(System.in);
        int[] userRating = new int[20];
        String line;
        int row = 0;
        int col = 0;
        while (movies.hasNext()) {
            line = movies.nextLine();
            System.out.println("-" + row + "-");
            System.out.print("Enter your rating for " + line + ": ");
            int rate = kb.nextInt();
            userRating[row] = rate;
            row++;
        }
        recommendation("ratings.txt"); //receives recommendation
        System.out.println(Arrays.toString(userRating));
    }
}
