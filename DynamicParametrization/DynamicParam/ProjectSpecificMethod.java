package Week5.DynamicParam;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import java.time.Duration;

public class ProjectSpecificMethod {
		
		public RemoteWebDriver driver;
		
		/*From xml file
		 *  <parameter name="url" value ="http://leaftaps.com/opentaps/" />
		  <parameter name= "password"  value="crmsfa"/>
		  <parameter name="un" value ="demosalesmanager" />
		   <parameter name="browser" value="chrome" />
		  */
		
		@Parameters({"un", "password", "url", "browser"})
		@BeforeMethod
		public void preCondition( String usrname, String pwd, String url, String browser) {
			
			switch(browser) {
			case "chrome":
				driver = new ChromeDriver();
				break;
			case "edge":
				driver = new EdgeDriver();
				break;
			case "firefox":
				driver = new FirefoxDriver();
				break;
			default :
				driver = new ChromeDriver();
				break;
			}
			
			
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.id("username")).sendKeys(usrname);
			driver.findElement(By.id("password")).sendKeys(pwd);
			
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
		}

		
		@AfterMethod
		public void postCondition() {
			driver.close();
		}
		
	}
	
	
 
