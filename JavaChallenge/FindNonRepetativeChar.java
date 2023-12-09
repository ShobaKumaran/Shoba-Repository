package JavaChallenge;

import java.util.HashSet;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;

/*Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
Example 1:- Input: s = "TestLeaf"; Output: 0
Example 2:- Input: s = "LoveTestLeaf"; Output: 1
Example 3:- Input: s = "aabb"; Output: -1
 */
public class FindNonRepetativeChar {

	public static void main(String[] args) {
	//	String strValue = "aabb";
	//	String strValue = "TestLeaf";
		String strValue = "LoveTestLeaf";
		String orgstrValue = strValue;
		char[] chArr = strValue.toCharArray();
		
		int count=0;
		for(int i=0; i<chArr.length; i++) {			
			count = StringUtils.countMatches(strValue, chArr[i]);
			
			if(count>1)
			strValue = strValue.replaceAll(String.valueOf(chArr[i]),"");
			}
		if(strValue!="") {
			char chFirst = strValue.charAt(0);
			System.out.println("Index of non-repeating character "+chFirst + " is " + orgstrValue.indexOf(chFirst));
			}
		else
			System.out.println("-1");
	
	}
	
}
