package pkSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


/*Precondition:
- Initialize ChromeDriver
- Load the URL https://en-gb.facebook.com/
- Maximize the browser window
- Add an implicit wait to ensure the web page elements are fully loaded
Requirements:
- Click on the Create new account button.
- Enter the First name.
- Enter the Surname.
- Enter the Mobile number or email address.
- Enter the New password.
- Handle all three dropdowns in Date of birth
- Select the radio button in Gender.
*/


@SuppressWarnings("unused")
public class FBookRegister {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		WebElement elemCreateAcc = driver.findElement(By.linkText("Create new account"));
		
		elemCreateAcc.click();
		
		driver.findElement(By.name("firstname")).sendKeys("shoba");
		
		driver.findElement(By.name("lastname")).sendKeys("Kumaran");
		
		driver.findElement(By.name("reg_email__")).sendKeys("1234567890");
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("password");
		
		WebElement ddDate = driver.findElement(By.name("birthday_day"));		
		WebElement ddMonth = driver.findElement(By.name("birthday_month"));
		WebElement ddYear = driver.findElement(By.name("birthday_year"));
		
		Select selDate = new Select(ddDate);
		selDate.selectByValue("10");
		
		Select selMonth = new Select(ddMonth);
		selMonth.selectByIndex(5);
		
		Select selYear = new Select(ddYear);
		selYear.selectByVisibleText("2000");
		
		driver.findElement(By.xpath("(//label[@class='_58mt'])[1]")).click();		
			 
		
	}

}
