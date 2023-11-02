package week2.ArrayString;

/*
 * Reverse the odd position words from a String with the input: 
	String test = "I am a software tester";
	Expected output: “I ma a erawtfos tester”
 *
 */
public class ReverseOddWords {
	
	
	public static String ReverseWord(String strWord) {
		
		String revWord = "";
		 
		char[] chArr = strWord.toCharArray();
		 
		  for(int j= chArr.length-1 ; j>=0; j--) {
			  revWord = revWord + chArr[j];
		  }
		return revWord;
	}
	

	public static void main(String[] args) {
		 String strInput = "I am a software tester";
		 
		 String strOutput = "";
		 
		 String[] strArr = strInput.split(" ");
		 		 
		 for(int i=0; i<strArr.length; i++) {
			  if(i%2 != 0) {
				  strArr[i] = ReverseWord(strArr[i]);
			  }				 
			  strOutput = strOutput + strArr[i] +" ";
		 }
		 System.out.println("Given String:");
		 System.out.println(strInput);  
		 
		 System.out.println("\nAltered String:");
		 System.out.println(strOutput);  

	}

}
