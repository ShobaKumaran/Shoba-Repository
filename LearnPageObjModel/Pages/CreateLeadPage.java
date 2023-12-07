package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import Base.ProjectSpecificMethod;

public class CreateLeadPage extends ProjectSpecificMethod{

	public CreateLeadPage(RemoteWebDriver driver) {
		this.driver = driver;
	}
 
	public CreateLeadPage enterCompanyname() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Google");
		return this;
	}
	
	public CreateLeadPage enterFirstname() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("test Firstname");
		return this;
	}
	
	public CreateLeadPage enterLastname() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Test lname");
		return this;
	}
	
	public CreateLeadPage enterPhoneNum() {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("123456789");
		return this;
	}
	
	public ViewLeadPage clickSubmitButton() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver);
	}
	
	
	
		
}
