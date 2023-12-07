package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import Base.ProjectSpecificMethod;

public class WelcomePage extends Base.ProjectSpecificMethod {
	
	public WelcomePage(RemoteWebDriver driver) {
		this.driver = driver;
	}

	public WelcomePage verifyLoginPage() {
		String strTitle = driver.getTitle();
		System.out.println(strTitle);
		return this;
	}
	
	public MyHomePage clickCrmsfaLink() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage(driver);
	}
	
	public LoginPage clickLogoutButton() {
		System.out.println("logout btn");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();		
		return new LoginPage(driver);
	}
	
	
}
