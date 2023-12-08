package JavaChallenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/*
 * Given an array nums of size n, return the majority element. 
Example 1:
Input: nums = [2,2,1,1,1,2,2]
Output: 2
 */

public class FindMajarotyElement {

	public static void main(String[] args) {

		int[] arrNo = {1,1,2,1,1,1,2,2};
	 		
		int iCount =1;
		int iNum=0;
		
		for(int i=0; i<arrNo.length; i++) {
			for(int j=i+1; j<arrNo.length; j++) {
				if(arrNo[i]==arrNo[j]) {
					iCount++;	
					iNum=arrNo[i];
					}
			}
			
			if(iCount>(arrNo.length/2)) {
				System.out.println(iNum +" occured "+ iCount +" times");
				System.out.println("Majority element:" + iNum);
				iCount=1;	
				break;
			}
			else {
				System.out.println("No majority element exists");
				break;
			}
	
						 
		}
	 
	}

}
