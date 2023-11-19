package Week3.Day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Find the second largest number from the given array
	Assignment Requirements:
- Declare an array {3, 2, 11, 4, 6, 10}.
- Pick the 2nd element from the last and print it
 */
public class ArraySort {

	public static void main(String[] args) {
		
		List<Integer> arrList = new ArrayList<Integer>();
		
		arrList.add(3);
		arrList.add(2);
		arrList.add(11);
		arrList.add(4);
		arrList.add(6);
		arrList.add(10);
		
		Collections.sort(arrList);
		int a = arrList.size()-2;
		System.out.println("Second largest num:" + arrList.get(a));	

	}

}
