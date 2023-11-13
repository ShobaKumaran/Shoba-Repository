package Week3.Day1;

/*
 * Precondition:
- Initialize the WebDriver (ChromeDriver).
- Load the URL https://leafground.com/button.xhtml .
- Maximize the browser window.
Requirements:
- Click on the button with the text ‘Click and Confirm title.’
- Verify that the title of the page is ‘dashboard.’
- Check if the button with the text ‘Confirm if the button is disabled’ is disabled.
- Find and print the position of the button with the text ‘Submit.’
- Find and print the background color of the button with the text ‘Find the Save button color.’
- Find and print the height and width of the button with the text ‘Find the height and width of this button.’
- Close the browser window.

 * 
 */
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundButton {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		//Creating the JavascriptExecutor interface object by Type casting		
      //  JavascriptExecutor jsExe = (JavascriptExecutor)driver;		
		
		
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Click on the button with the text ‘Click and Confirm title.’
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt90']")).click();
		
		//verify the page title - Dashboard
		String strTitle = driver.getTitle();
		if(strTitle.equals("Dashboard"))
			System.out.println("yes! Its Dashbord page");
		else
			System.out.println("Not Dashbord page"+strTitle);
		
		driver.navigate().back();
		
		//Check if the button with the text ‘Confirm if the button is disabled’ is disabled.
		WebElement btnDisabled = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt92']"));
		boolean boolAttribute = btnDisabled.isEnabled();
		
		if(boolAttribute)
			System.out.println("Button is Enabled.");
		else
			System.out.println("Button is disabled.");
		
		//Find and print the position of the button with the text ‘Submit.’
		 WebElement btnSubmit = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt94']"));			 
		 System.out.println("location of submit btn: "+  btnSubmit.getLocation());
		 
		 //Find and print the background color of the button with the text ‘Find the Save button color.’				  
		WebElement btnBgColor = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt90']"));
		System.out.println("Color of the button: "+ btnBgColor.getCssValue("background-color"));
		
		// Find and print the height and width of the button with the text ‘Find the height and width of this button.’
		 
		WebElement btnDimention = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt98']"));
		System.out.println("Dimentions of the button: "+ btnDimention.getSize());
		
		 // Close the browser window.
		 driver.close();
		 
		 
		 
	}

}
