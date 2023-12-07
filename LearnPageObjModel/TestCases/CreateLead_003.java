package TestCases;

import org.testng.annotations.Test;

import Base.ProjectSpecificMethod;
import Pages.LoginPage;

public class CreateLead_003 extends ProjectSpecificMethod {

	@Test
	public void runCreateLead() {
		
		new LoginPage(driver)
		.enterUsername()
		.enterPassword()
		.clickLoginButton()
		.verifyLoginPage()
		.clickCrmsfaLink()
		.clickLeads()
		.clickCreateLead()
		.enterCompanyname()
		.enterFirstname()
		.enterLastname()
		.enterPhoneNum()
		.clickSubmitButton();
	}
}
