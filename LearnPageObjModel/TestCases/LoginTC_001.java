package TestCases;

import org.testng.annotations.Test;

import Base.ProjectSpecificMethod;
import Pages.LoginPage;
import Pages.WelcomePage;
 
public class LoginTC_001 extends ProjectSpecificMethod{
	
 @Test	
 public void runLogin() {
	 
	 new LoginPage(driver)
	 .enterUsername()
	 .enterPassword()
	 .clickLoginButton()
	 .verifyLoginPage()	 
	 .clickCrmsfaLink()
	 .clickLeads(); 
	 
 }
	
}
