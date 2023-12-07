package TestCases;

	import org.testng.annotations.Test;

	import Base.ProjectSpecificMethod;
	import Pages.LoginPage;
	import Pages.WelcomePage;
	 
	public class LogoutTC_002 extends ProjectSpecificMethod{
		
	 @Test	
	 public void runLogout() {
		 
		 new LoginPage(driver)
		 .enterUsername()
		 .enterPassword()
		 .clickLoginButton()
		 .verifyLoginPage()	; 
		// .clickLogoutButton();
		
	 }
		
	}


