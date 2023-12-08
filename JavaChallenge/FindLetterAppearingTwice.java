package JavaChallenge;

/*Challenge:11
 * Given a string s consisting of lowercase English letters, return the first letter to appear twice.

Note: A letter a appears twice before another letter b if the second occurrence of a is before the second occurrence of b.
s will contain at least one letter that appears twice.

Example 1:
Input: s = "abccbaacz"
Output: "c"

*/

public class FindLetterAppearingTwice {

	public static void main(String[] args) {
	 String str = "abccbaacz";
	 
	 char[] chString = str.toCharArray();
	 int arrCharLength = chString.length;
	 
	 System.out.println("Given String: "+ str);
	 for(int i=0; i<arrCharLength; i++) {
		 if(i<arrCharLength-1) {
			 if(chString[i]==chString[i+1])
				 System.out.println("The letter "+chString[i]+ " appears twice."); 
		 }
	 }
	
	}

}
