package pkSelenium;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/*- Initialize the WebDriver (ChromeDriver).
- Load the URL http://leaftaps.com/opentaps/.
- Maximize the browser window.
Requirements:
- Enter a username and password.
- Click the "Login" button.
- Click on the "CRM/SFA" link.
- Click on the "Accounts" tab.
- Click on the "Create Account" button.
- Enter an account name.
- Enter a description as "Selenium Automation Tester."
- Select "ComputerSoftware" as the industry.
- Select "S-Corporation" as ownership using SelectByVisibleText.
- Select "Employee" as the source using SelectByValue.
- Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex.
- Select "Texas" as the state/province using SelectByValue.
- Click the "Create Account" button.
- Verify that the account name is displayed correctly.
- Close the browser window
*/

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		 
		//Launch chrome
		ChromeDriver driver = new ChromeDriver();
				
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		String strTitle = driver.getTitle();
		//Login screen
		if(strTitle.equals("Leaftaps - TestLeaf Automation Platform")) {
			
			WebElement elemUsrName = driver.findElement(By.id("username"));
			elemUsrName.sendKeys("DemoCSR");
			
			WebElement elemPwd = driver.findElement(By.id("password"));
			elemPwd.sendKeys("crmsfa");			
			
			WebElement elemLogin = driver.findElement(By.className("decorativeSubmit"));
			elemLogin.click();
		}
		
		String strTitle1 = driver.getTitle();
		if(strTitle1.equals("Leaftaps - TestLeaf Automation Platform")) {
			
			WebElement elemCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
			elemCRMSFA.click();
						
		}
		
		String strTitle2 = driver.getTitle();
		if(strTitle2.equals("My Home | opentaps CRM")) {
		//Accounts
			
			WebElement elemAccounts = driver.findElement(By.linkText("Accounts"));
			elemAccounts.click();
			
		}
		
        
		WebElement elemCreateAccount = driver.findElement(By.linkText("Create Account"));
		elemCreateAccount.click();
      
		Random randomNum = new Random();
        int newAccNum = randomNum. nextInt(10000);
		
				
		WebElement elmAccName = driver.findElement(By.id("accountName"));
		elmAccName.sendKeys("A"+newAccNum);
		
		WebElement elmDescp = driver.findElement(By.name("description"));
		elmDescp.sendKeys("Selenium Automation Tester.");
		
		
		WebElement ddIndustry = driver.findElement(By.name("industryEnumId"));
		Select optionInd = new Select(ddIndustry);
		optionInd.selectByIndex(3);		
		
		WebElement ddOwnership = driver.findElement(By.name("ownershipEnumId"));
		Select optionOwnership = new Select(ddOwnership);
		optionOwnership.selectByVisibleText("S-Corporation");
		
		WebElement ddSource= driver.findElement(By.id("dataSourceId"));
		Select optionSource = new Select(ddSource);
		optionSource.selectByValue("LEAD_EMPLOYEE");
		
		WebElement ddCampaign = driver.findElement(By.id("marketingCampaignId"));
		Select optionCamp = new Select(ddCampaign);
		optionCamp.selectByIndex(6);
		
		WebElement ddState = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select optionState = new Select(ddState);		
		optionState.selectByValue("TX");
		
		WebElement elemSubmit = driver.findElement(By.className("smallSubmit"));
		elemSubmit.click();
		 
		String strAccTitle = driver.getTitle();
		Thread.sleep(2000);
				
		System.out.println("Acc No: "+ "A"+newAccNum + "can be seen on: " +strAccTitle);
		
		driver.close();
		 
	}

}
