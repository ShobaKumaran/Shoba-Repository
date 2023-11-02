package week2.ArrayString;

/*
 * Assignment Details: 
 The assignment requires comparing two arrays and printing matching elements.
 int a[]={3,2,11,4,6,7}; 
 int b[]={1,2,8,4,9,7}; 
 */

public class ElementIntersection {

	public static void main(String[] args) {

		int[] arrA = {3,2,11,4,6,7}; 
		int[] arrB = {1,2,8,4,9,7}; 
		
		System.out.println("Matching elements : ");
		for(int i=0; i<arrA.length; i++) {
			for(int j=0; j<arrB.length; j++) {
				if(arrA[i]==arrB[j])
					System.out.println(arrA[i]);
			}
			
		}
		

	}

}
