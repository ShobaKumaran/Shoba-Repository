package JavaChallenge;
/*
 * Java Challenge (3/20)

A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
 */
public class FindStringPallindrome {
 
	public static void main(String[] args){
	  
		//String str= "This#string%contains^ special* characters&.";  
		String str = "A man, a plan, a canal: Panama";
		//String str = "Hello";
		str = str.replaceAll("[^a-zA-Z0-9]", "");  
		System.out.println("given string:" + str);  
		
		String reverseStr = "";
		for(int i=0; i<str.length(); i++) {
			reverseStr = str.charAt(i)+reverseStr;		
		}  
		System.out.println("reversed string:" + reverseStr); 
		if(str.equalsIgnoreCase(reverseStr))
			System.out.println("Its a Pallindrome");
		else
			System.out.println("Its NOT a Pallindrome");
	}
}
