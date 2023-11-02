package week2.ArrayString;

/* Understand the concepts of String manipulation and 
 * control statements in Java to remove duplicate words in a String.
 */

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String str = new String("We learn java basics as part learn of java sessions in java week1");
		 
		
		String[] strArry= str.split(" ");
	
		for(int i =0; i< strArry.length; i++)
		{	
			for(int j=i+1; j< strArry.length; j++) {
				if(strArry[i].equals(strArry[j])) 
					strArry[j] = "";													
			}
		}
		System.out.println("original String");
		System.out.println("----------------");
		System.out.println(str);
		
		System.out.println("\n\n\nString without duplicates:");
		System.out.println("---------------------------");
		for(int i =0; i< strArry.length; i++)
			System.out.print(strArry[i]+" ");
		
	}
}
