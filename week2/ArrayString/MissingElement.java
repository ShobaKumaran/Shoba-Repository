package week2.ArrayString;

import java.util.Arrays;

/*Find the missing element in the given array 
Input -> {1, 4,3,2,8, 6, 7}; 
Output -> 5 
*/

public class MissingElement {

	public static void main(String[] args) {
		 
		int[] arrGiven = {1, 4, 2, 8, 6, 7};	
		
		Arrays.sort(arrGiven);
		String strArry = Arrays.toString(arrGiven);
		System.out.println("Missing numbers from the list "+strArry+ " :"); 
		
		for (int i = 0; i< arrGiven.length-1; i++) {
		    int missingNo = arrGiven[i];
		    missingNo = missingNo+1;
		    if(missingNo != arrGiven[i+1])
		    	 System.out.println(missingNo); 
		}

		
	}

}
