package JavaChallenge;

import java.util.ArrayList;
import java.util.List;


/*Given a string array words, return an array of all characters that show up in all strings within the words (including duplicates). 
 * You may return the answer in any order. 
Example 1:
Input: words = ["bella","label","roller"]
Output: ["e","l","l"]

Example 2:
Input: words = ["cool","lock","cook"]
Output: ["c","o"]
 * 
 */
public class RepeatingChar {
	
	public static void main(String[] args) {
		
		//String[] words = {"bella","label","roller"};
		//String[] words = {"cool","looock","ccookl"};
		String[] words = {"cool","lock","cook"};
		
		//first value in the 'word' String array.
		char[] arrChar = words[0].toCharArray();
		List<Character> arrMatchingLetter = new ArrayList<Character>();
		
		char s='\0';
		for(int i=0; i<arrChar.length; i++) {
			if((words[1].indexOf(arrChar[i])!= -1) && (words[2].indexOf(arrChar[i]) != -1) ){
				 s = words[0].charAt(i);
				 String str = String.valueOf(s);
				 words[1].replaceFirst(str, "");
				 words[2].replaceFirst(str, "");
				 arrMatchingLetter.add(s);
			}		
		}
		System.out.println(arrMatchingLetter);	
	}
}
 



