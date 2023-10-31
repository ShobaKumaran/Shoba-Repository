package week2.day1;

public class FibonacciSeries {
	
	//The Fibonacci sequence is a type series where each number is the sum of the two that precede it. 
	//It starts from 0 and 1 usually. 
	//The Fibonacci sequence is given by 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, and so on.



	public static void main(String[] args) {
		
		 int iMaxNo=8;
		 int iNum1=0, iNum2=1;
		 int sumNum;
		 System.out.println(iNum1);
		 System.out.println(iNum2);
		 
		 for(int i=1; i<=iMaxNo-2; i++) {		 
		
		 sumNum = iNum1 +iNum2;
		 iNum1 = iNum2;
		 iNum2 = sumNum;
		 
		 System.out.println(sumNum);
		 }		 
 
	}

}
