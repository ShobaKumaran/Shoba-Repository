package week2.day1;

public class Palindrome {
	
	public void isPalindrome(int a) {
	int givenNum = a;         
    int tempNumber=givenNum;
    int remainder, sum;
    
    for(sum=0;givenNum>0;givenNum/=10)
    {
    	remainder=givenNum%10;
    	sum=(sum*10)+remainder;
    }
   if(sum==tempNumber)
	System.out.println(tempNumber+" is a palindrome number ");
              else
	System.out.println(tempNumber+" is not a palindrome number ");
}



	public static void main(String[] args) {
		 
		Palindrome isPalin = new Palindrome();
		isPalin.isPalindrome(11211);
		
		System.out.println(".....");
		isPalin.isPalindrome(11215);
		
		
		                  
			
	}

}
