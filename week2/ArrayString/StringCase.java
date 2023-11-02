package week2.ArrayString;

/*Assignment Details: 
Change the odd index of a given String to uppercase 
String test = “changeme”;
Print the characters with the expected output: cHaNgEmE
 * 
 */

public class StringCase {

	public static void main(String[] args) {
		
		String strText = new String("changeme here to upper case");
		
		char[] chrArray = strText.toCharArray();	
		
		String strNewText="";
		
			for(int i=0; i<strText.length(); i++) {
				if(i%2 != 0) 				
					chrArray[i] = Character.toUpperCase(chrArray[i]);					
					strNewText = strNewText + chrArray[i];				
			}
			
			System.out.println(strNewText);
			
		}
		

	}


