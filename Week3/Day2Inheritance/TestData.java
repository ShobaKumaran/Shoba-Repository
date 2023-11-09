package Week3.Day2Inheritance;

public class TestData {

	 public void enterCredentials() {
		 System.out.println("enterCredentials - This is TEstData Super class.");
		 
	 }

	 public void navigateToHomePage() {
		 
		 System.out.println("navigateToHomePage :- This is TEstData Super class.");
		 
	 }
	 
	 public static void main(String[] str) {
		 
		 TestData test = new TestData();
		 
		//calling its own methods 
		 test.enterCredentials();
		 test.navigateToHomePage();
		 
		//calling sub class methods
		 LoginTestData logTest = new LoginTestData();
		 logTest.enterUsername();
		 logTest.enterPassword();
	 }
	
}
