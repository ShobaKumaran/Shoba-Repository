package Week3.Day3Polymorphism;

public class LoginPageTest extends BaseClassTest {
	
	@Override public void FindElementMethod() {
		System.out.println("This is FindElementMethod override implemented");
	}
		
	@Override public void PerformCommonTasksMethod() {
		System.out.println("This is PerformCommonTasksMethod override implemented");
	}
	

	public static void main(String[] args) {
		 
		LoginPageTest logObj = new LoginPageTest();
		logObj.FindElementMethod();
		logObj.PerformCommonTasksMethod();
		logObj.ClickElementMethod();
		logObj.EnterTextMethod();
	}

}
