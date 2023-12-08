package JavaChallenge;
/*Challenge:8
 * Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
Example 1:
Input: nums = [1,2,3,1], k = 3
Output: true
Example 2:
Input: nums = [1,2,3,1,2,3], k = 2
Output: false
 */
public class IntArrayComparison {

	public static void main(String[] args) {
		//int[] arrNo = {1,2,3,1,2,3};
		//int intGivenNo = 2;
		int[] arrNo = {1,2,3,1};
		int intGivenNo = 3;
		
		boolean isTrue = false;
		
		for(int i=0; i<arrNo.length; i++) {
			for(int j=i+1; j<arrNo.length; j++) {
				if((arrNo[i]==arrNo[j])&&((j-i)<=intGivenNo)) {
					isTrue = true;
				}				 
			}			
		}
		System.out.println(isTrue);
			

	}

}
