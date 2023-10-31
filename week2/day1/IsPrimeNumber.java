package week2.day1;

// Determine if the given number is Prime.

public class IsPrimeNumber {
	
	//Number shouldn't be divisible by any other number other than itself
	
	public boolean isPrimeNum(int iNum){
		
		int iGivenNo=iNum;
		
		int midNum;
		boolean isPrime =false;
		
		if(iGivenNo % 2==0)
			midNum = iGivenNo/2;
		else
			midNum = (iGivenNo+1)/2;
		
		for(int i=2; i<=midNum; i++) {
			if(iGivenNo % i ==0) {
			//	not prime
				isPrime = true;
				break;
			}
			else {
				//prime
				isPrime = false;
			}
		}
		
		return isPrime;
	}
	
	public static void main(String[] args) {
		
		int iGivenNum = 7;
		
		IsPrimeNumber isPrimeNo = new IsPrimeNumber();
		boolean isNumPrime = isPrimeNo.isPrimeNum(iGivenNum);
			
			if(isNumPrime==true)
				System.out.println("The given number, "+ iGivenNum + " is not Prime Number");
			else
				System.out.println("The given number, "+ iGivenNum + " is a Prime Number");				
				
		}
			
}
