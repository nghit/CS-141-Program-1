/********************************
 * file: Tran_Decoder.java
 * author: N. Tran
 * class: CS 141 - Programing and Problem Solving
 *
 * assignment: program 1
 * date last modified: 1/12/2017
 *
 * purpose: This program reads in a coded message and its key phrase, then output the secret message in a String.
 ********************************/

import java.util.Scanner;

public class Tran_Decoder
{
    public static void main(String[]args)
    {
        String secretMessage = "";
        String message;
        String keyPhrase;

	// create a Scanner object and read in data from a file       
        Scanner scan = new Scanner(System.in);
        keyPhrase = scan.nextLine();
        message = scan.nextLine();
	
        // create an array of String then fill it in with characters in the coded message
        String[] givenMessage = message.split(" ");
        
        for(int i = 0; i< givenMessage.length;i++)  
        {
	    // using the key phrase of the given  message to idetify the characters in the secret message
            secretMessage += keyPhrase.charAt(Integer.parseInt(givenMessage[i]));         
        }
	
	// print out the secret message
        System.out.println("\nYour secret message is: " + secretMessage + "\n");
    }
}
