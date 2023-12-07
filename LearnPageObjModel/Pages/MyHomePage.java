package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import Base.ProjectSpecificMethod;

public class MyHomePage extends ProjectSpecificMethod {

	public MyHomePage(RemoteWebDriver driver) {
		this.driver = driver;
	}

	public MyLeadsPage clickLeads() {
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		return new MyLeadsPage(driver);
	}
	
}
