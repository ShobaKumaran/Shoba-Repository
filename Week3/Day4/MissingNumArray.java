package Week3.Day4;

import java.util.Arrays;

/*
 * Find the missing element from the list of integers
Assignment Requirements:
- Declare an array {1, 2, 3, 4, 10, 6, 8}.
- Do a comparison check if there is a gap in the sequence of numbers.
- Print the numbers that are missing.
 * 
 */
public class MissingNumArray {

	public static void main(String[] args) {
		int[] arrNumbers = {1, 2, 3, 5, 7, 10, 6, 8};
		
		Arrays.sort(arrNumbers);
		
		System.out.println("sorted:"+ Arrays.toString(arrNumbers));
		
		String missingNum ="";
		for(int i=0; i<arrNumbers.length-1; i++) {
			if(!(arrNumbers[i]+1 == arrNumbers[i+1])) {
				missingNum = missingNum + "  " + (arrNumbers[i]+1);
			}				
		}
		if(!(missingNum==""))
			System.out.println("Missing Numbers:"+missingNum);	
	}

}
