package Week3.Day4;

import java.util.Arrays;
import java.util.Collections;

/*
 * - Declare an array for {3, 2, 11, 4, 6, 7}
- Declare another array for {1, 2, 8, 4, 9, 7}
- Compare both the arrays
- Print the values if they are equal

10-06
 */
public class LearnArrList {

	public static void main(String[] args) {
		 
		int[] array1 = {3, 2, 11, 4, 6, 7};
		int[] array2 =  {1, 2, 8, 4, 9, 7};
		
			
		for(int i=0; i<array1.length; i++) {
			for(int j=0; j<array2.length; j++) {
				if(array1[i]==array2[j])
						System.out.println("Common num: "+ array1[i]);								
			}
		}

	}

}
