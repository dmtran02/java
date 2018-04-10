/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

/**
 *
 * @author x230
 */
import java.util.*;
import java.net.*;
import java.io.*;
import java.util.regex.*;

public class Accentor {

    /* url is the address of a file on the web, e.g., http://www.espn.com
 * If successful, the method returns the contents of the URL as a String.
 * On failure, it returns null */
    public static String getWebContents(String url) {
        BufferedReader br = null;
        String result = null;
        try {
            URL toFetch = new URL(url);
            br = new BufferedReader(new InputStreamReader(toFetch.openStream()));
            StringBuilder ret = new StringBuilder();
            String line = br.readLine();
            while (line != null) {
                ret.append(line + '\n');
                line = br.readLine();
            }
            result = ret.toString();
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
            System.err.println("Malformed URL:  " + url);
        } catch (IOException ioe) {
            ioe.printStackTrace();
            System.err.println("Error reading from URL:  " + url);
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                    System.err.println("Couldn't close connection to url properly:  " + url);
                }
            }
            return result;
        }
    }
    
    /* Saves the String contents into a file with name filename.
 * 
 * If the file did not previously exist, it is created.
 * If the file with the same name existed previously, it is overwritten. */
public static void saveDoc(String contents, String filename) {
    PrintWriter pw = null;
    try {
	pw = new PrintWriter(new FileWriter(new File(filename)));
	pw.print(contents);
    } catch (IOException ioe) {
	ioe.printStackTrace();
	System.err.println("Error writing to file:  " + filename);
    } finally {
	if(pw!=null) {
	    pw.close();
	}
    }
}

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a url to save a script: ");
        String url = kb.nextLine();
        String result = getWebContents(url);
        StringBuilder southAccent = new StringBuilder(result);
        Pattern p = Pattern.compile("", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(southAccent);
        Pattern a = Pattern.compile("\\beer\\b", Pattern.CASE_INSENSITIVE);
        Matcher n = a.matcher(southAccent); //fix pattern/matcher method and inside if statement including it
        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) == 'r' || result.charAt(i) == 'R') {
                if (result.charAt(i + 1) == 'a' || result.charAt(i + 1) == 'e' || result.charAt(i + 1) == 'i' || result.charAt(i + 1) == 'o' || result.charAt(i + 1) == 'u') {
                    southAccent.setCharAt(i, 'h');
                } else {
                    southAccent.setCharAt(i, result.charAt(i));
                }
            } else if (result.charAt(i) == 'a') { //change this statement
                if (result.charAt(i + 1) == ' ') {
                    southAccent.setCharAt(i + 1, 'r');
                    southAccent.setCharAt(i + 2, ' ');
                } else {
                    southAccent.setCharAt(i, result.charAt(i));
                }
            }
        }
        for (int j = 1; j < southAccent.length(); j++) {
            if (southAccent.charAt(j) == 'r' || southAccent.charAt(j) == 'R') {
                if (result.charAt(j + 1) == ' ' && (result.charAt(j - 1) == 'e' && result.charAt(j - 2) == 'e')) {
                    southAccent.setCharAt(j, 'y');
                    southAccent.insert(j + 1, "ah");
                }else if (result.charAt(j + 1) == ' ' && result.charAt(j - 1) == 'i') {
                    southAccent.setCharAt(j, 'w');
                    southAccent.insert(j + 1, "ah");
                }else if (result.charAt(j + 1) == ' ' && (result.charAt(j - 1) == 'o' && result.charAt(j - 2) == 'o')) {
                    southAccent.setCharAt(j, 'y');
                    southAccent.insert(j + 1, "ah");
                }
            }
        }
        String resultSouth = southAccent.toString();
        resultSouth.replaceAll("\\bvery\\b", "wicked");
        System.out.println(resultSouth);
        System.out.println(" ");
        System.out.print("Enter your new file name: ");
        String filename = kb.nextLine();
        saveDoc(resultSouth,filename);
    }
}
