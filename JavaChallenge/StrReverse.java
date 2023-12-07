package JavaChallenge;

import java.util.Scanner;

public class StrReverse {

	public static void main(String[] args) {
	
		System.out.println("Enter a string:");
		Scanner inText = new Scanner(System.in);		
		String strText = inText.nextLine();		
		inText.close();
		
		/*method 1
		 * String[] arrString = strText.split(" ");	
		String lstWord = arrString[arrString.length-1];
		
		System.out.println("Last Word: "+ lstWord);
		
		String revLstWord = (new StringBuffer(lstWord)).reverse().toString();
		System.out.println("Reversed Last Word: "+ revLstWord);
		*/
		
		/*method 2 - Without using inbulit method
		String[] chWord = lstWord.split("");
		System.out.print("Reversed Last Word: ");		
		for(int i=chWord.length-1; i>=0; i--)
			System.out.print(chWord[i]);
		
		*/
		
		System.out.println("original string: "+strText);
		String revString="";
		
		for(int i=0; i<strText.length(); i++) {
			revString = strText.charAt(i) + revString;
		}
		
		System.out.println(revString);
		
	}

}
