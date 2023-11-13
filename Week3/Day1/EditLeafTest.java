package Week3.Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*
 * Precondition:
- Initialize the WebDriver (ChromeDriver).
- Load the URL http://leaftaps.com/opentaps/.
- Maximize the browser window.
Requirements:
- Enter the Username as "DemoSalesManager" and the Password as "crmsfa".
- Click on the Login Button.
- Click on the CRM/SFA Link.
- Click on the Leads Button.
- Click on Create Lead.
- Enter the CompanyName Field Using Xpath.
- Enter the FirstName Field Using Xpath.
- Enter the LastName Field Using Xpath.
- Enter the FirstName (Local) Field Using Xpath.
- Enter the Department Field Using any Locator of Your Choice.
- Enter the Description Field Using any Locator of your choice.
- Enter your email in the E-mail address Field using the locator of your choice.
- Select State/Province as NewYork Using Visible Text.
- Click on the Create Button.
- Click on the edit button.
- Clear the Description Field.
- Fill the Important Note Field with Any text.
- Click on the update button.
- Get the Title of the Resulting Page.
- Close the browser window
 */
public class EditLeafTest {

	public static void main(String[] args) {
	 
		WebDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
	
		driver.findElement(By.cssSelector("a[href='/crmsfa/control/leadsMain']")).click();
	
		driver.findElement(By.linkText("Create Lead")).click();
		
		/*- Enter the CompanyName Field Using Xpath.
		- Enter the FirstName Field Using Xpath.
		- Enter the LastName Field Using Xpath.
		- Enter the FirstName (Local) Field Using Xpath.*/
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Amex Bank");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Shoba");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Kumaran");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Shobs");
		
		/*- Enter the Department Field Using any Locator of Your Choice.
		- Enter the Description Field Using any Locator of your choice.
		- Enter your email in the E-mail address Field using the locator of your choice.
		 */
		
		//using xpath-axes for Dept field- bottom to top, non-sibling relation
		driver.findElement(By.xpath("//span[@class='tableheadtext' and contains(text(),'Department')]//following::input[1]")).sendKeys("IT");
		
		//Description Field : top-bottom- parent to child
		driver.findElement(By.xpath("//div[@class='fieldgroup-body']//following::textarea[1]")).sendKeys("Learning Selenium-Java");
		
		// Enter your email in the E-mail address Field using the locator of your choice.
		driver.findElement(By.cssSelector("input#createLeadForm_primaryEmail")).sendKeys("aa@gmail.com");
		
		//Select State/Province as NewYork Using Visible Text.
		WebElement elemState = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		
		Select stateDD = new Select(elemState);
		stateDD.selectByVisibleText("New York");
		
		//Click on the Create Button - cssSelector -> tagname.classvalue[attribute='value']
		driver.findElement(By.cssSelector("input.smallSubmit[name='submitButton']")).click();
		
		
		//Click on the edit button - Edit screen
		driver.findElement(By.cssSelector("a.subMenuButton[href*='updateLeadForm?']")).click();
		
		/*Clear the Description Field.
		- Fill the Important Note Field with Any text.
		- Click on the update button.*/
		
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Learning Java and Selenium for automated testing");
		driver.findElement(By.cssSelector("input.smallSubmit[value='Update']")).click();
		
		// Get the Title of the Resulting Page.
		System.out.println(driver.getTitle());
		
		// Close the browser window
		driver.close();
		
		
	}

}
