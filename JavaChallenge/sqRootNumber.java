package JavaChallenge;
//find the square root of a positive integer

public class sqRootNumber {

	 
	public static double square(double number){
		double t;
		double squareroot = number / 2;
		do 
		{
			t = squareroot;
		//	System.out.println("t: "+t);
			squareroot = (t + (number / t)) / 2;
		//	System.out.println("squareroot: " + squareroot);
		}while ((t - squareroot) != 0);
		
		return squareroot;
	}
	
	
	public static void main(String[] args)
	{
	double number = 16;
	double root;
	root = square(number);
	System.out.println("Number : "+number);
	System.out.println("Square Root : "+root);
	}
	 
}
