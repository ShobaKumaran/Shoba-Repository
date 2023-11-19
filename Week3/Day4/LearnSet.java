package Week3.Day4;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/*
 * - Writing a Java program that takes a string as input and prints only the unique characters from that String using 
the Set interface and its implementation class.
- Given the String companyName = "google"`, the program should print: "gole"
Assignment Requirements:
- You are provided with a string variable: companyName = "google"
- Create a Set to store unique characters.
- Iterate through each character in the companyName string.
- Add each character into the Set.
- Print the unique characters from the string.
 * 
 */
public class LearnSet {

	public static void main(String[] args) {
	 
	String companyName = "google";
	
	String[] chName = companyName.split("");
	Set<String> sName = new LinkedHashSet<String>();
		//sName.addAll(chName);
	
		for(int i=0; i<chName.length; i++)
			sName.add(chName[i]);
	
		for(String s: sName)
			System.out.print(s);
		
	}

}
