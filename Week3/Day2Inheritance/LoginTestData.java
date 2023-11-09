package Week3.Day2Inheritance;

public class LoginTestData extends TestData{

	
	 public void enterUsername() {
		 System.out.println("subclass LoginTestData - enter usrname.");
		 
	 }

	 public void enterPassword() {
		 
		 System.out.println("subclass LoginTestData - enter Password");
		 
	 }
	 
	 public static void main(String[] str) {
		 
		 LoginTestData logTest = new LoginTestData();
		 
		 //calling superclass methods
		 logTest.enterCredentials();
		 logTest.navigateToHomePage();
		 
		 //calling its own methods
		 logTest.enterUsername();
		 logTest.enterPassword();

	 }
	 
	 
	 
}
