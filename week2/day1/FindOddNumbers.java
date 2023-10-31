package week2.day1;

public class FindOddNumbers {

	public static void main(String[] args) {
		
		System.out.println("Odd numbers from 1 to 10");
		for(int maxRange=1; maxRange<=10; maxRange++) {			
			if(maxRange%2==1) {
				System.out.println("odd no: " + maxRange);
			}
		}
	}
}
	


