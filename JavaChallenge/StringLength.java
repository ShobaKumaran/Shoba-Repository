package JavaChallenge;

import java.util.Scanner;

//return the length of the last word in the string

public class StringLength {

	public static void main(String[] args) {		 
		 
		System.out.println("Enter a string:");
		Scanner inText = new Scanner(System.in);		
		String strText = inText.nextLine();		
		inText.close(); 
		
		String[] arrString = strText.split(" ");	
		String lstWord = arrString[arrString.length-1];
		
		System.out.println("Last Word is '"+ lstWord + "' and its length is: "+ lstWord.length());
	}

}
