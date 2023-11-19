package Week3.Day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*
 * Reverse the given collection of String elements
Assignment Requirements:
Declare a String array and add the values as {HCL, Wipro, Aspire Systems, CTS}
Add the collection to a list 
Iterate the values in the list
Print the required output as Wipro, HCL, CTS, Aspire Systems
 */
public class ReverseStringArray {

	public static void main(String[] args) {

		List<String> lstCompanyNames = new ArrayList<String>();
		
		lstCompanyNames.add("HCL");
		lstCompanyNames.add("Wipro");
		lstCompanyNames.add("Aspire Systems");
		lstCompanyNames.add("CTS");
		
		Collections.sort(lstCompanyNames);
		
		Iterator iterate = lstCompanyNames.iterator();
		 		
		if(iterate.hasNext())
				System.out.println("Given List:" + lstCompanyNames);
		
		Collections.reverse(lstCompanyNames);
		Iterator revIterate = lstCompanyNames.iterator();
 		
		if(revIterate.hasNext())
				System.out.println("Reversed Order:"+  lstCompanyNames);
		
	}

}
