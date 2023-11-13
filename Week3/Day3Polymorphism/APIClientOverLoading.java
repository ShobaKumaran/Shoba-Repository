package Week3.Day3Polymorphism;

public class APIClientOverLoading {

	public void SendRequest(String str) {
		String endPoint = str;
		
		System.out.println("Single parameter send request method."+ endPoint);
		
	}
	
	public void SendRequest(String a, String b, boolean c) {
		String endPoint = a;
		String requestBody = b;
		boolean requestStatus = c;
		
		if(requestStatus) 
			System.out.println("Request Status true.");		
		else
			System.out.println("Request Status false.");	
		
		System.out.println(a + " " + b);			
		
	}
	
	
	public static void main(String[] args) {
		
		APIClientOverLoading obj = new APIClientOverLoading();
		
		obj.SendRequest("Hello");
		
		obj.SendRequest("Hello", "World", true);		

	}

}
