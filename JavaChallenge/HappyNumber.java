package JavaChallenge;

/*Java Challenge (5/20)

Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:

Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.

 

Example 1:

Input: n = 19
Output: true
Explanation:
1^2 + 9^2 = 82
8^2 + 2^2 = 68
6^2 + 8^2 = 100
1^2 + 0^2 + 0^2 = 1
Example 2:

Input: n = 2
Output: false
First few happy numbers are 1, 7, 10, 13, 19, 23, 28, 31, 32, 44, 49, 68, 70, 79, 82, 86, 91, 94, 97, 100
 * 
 */
public class HappyNumber {
	
	public static int sqOfGivenNumber(int number) {
		int sq = 0;
	    while (number > 0) 
	    {
	       //retrieves the last digit
	    	int digit = number % 10;
	       
	        sq += digit * digit;
	        
	        //to eliminate the last digit
	        number = number / 10;		    
	    }
	    return sq;
	}	
	
	public static void main(String[] str) {	
		int numberGiven = 32;
		
		int sqNumber = sqOfGivenNumber(numberGiven);
				
		while(sqNumber>9)
			sqNumber = sqOfGivenNumber(sqNumber);
		
		if(sqNumber==1)	 
			System.out.println("happy number");
		else
			System.out.println("Not a happy number");
		}
	
}
