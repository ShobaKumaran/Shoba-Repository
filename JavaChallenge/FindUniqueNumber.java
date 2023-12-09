package JavaChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

/*
 * Java Challenge (4/20)

Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

Example 1:

Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4
Example 3:

Input: nums = [1]
Output: 1
 */
public class FindUniqueNumber {
	 
	public static void main(String[] args) {
		
	Integer[] arrNo = {2,2,5,5,7,2,4,4,9,7,9,2,3};
	
	HashMap<Integer, Integer> intOccurance = new HashMap<>();
	List<Integer> lstNo = Arrays.asList(arrNo); // doesnot let you remove items from list
			
	Collections.sort(lstNo);	
	System.out.println("Integer List: "+ lstNo);
 
	int key;
	int counter=1;
	
	for(int i=0; i<lstNo.size(); i++) {
		key=lstNo.get(i);
		for(int j=i+1; j<lstNo.size(); j++) {
			if(lstNo.get(i)==lstNo.get(j)) {
				counter = counter+1;
			}
		}
		if(!intOccurance.containsKey(key))
			intOccurance.put(key, counter);
		counter=1;
	  
	}
	System.out.println("h: " + intOccurance);
	Integer value=1;
	if(intOccurance.containsValue(value))
		// iterate each entry of hashmap
	    for(Entry<Integer, Integer> entry: intOccurance.entrySet()) {

	      // if give value is equal to value from entry
	      // print the corresponding key
	      if(entry.getValue() == value) {
	        System.out.println("The non-repetative number is " + entry.getKey());
	        break;
	      }
	    }
	}
}
