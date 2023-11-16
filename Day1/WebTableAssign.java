package Week4.Day1;

import java.time.Duration;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebTableAssign {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://erail.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		WebElement fromLocation = driver.findElement(By.id("txtStationFrom"));
		WebElement toLocation = driver.findElement(By.id("txtStationTo"));
		
		
		fromLocation.clear();
		fromLocation.sendKeys("MAS");
		fromLocation.click();		
		
		Thread.sleep(1000);
		
		toLocation.clear();
		toLocation.sendKeys("MDU");
		toLocation.click();
		 
		driver.findElement(By.id("chkSelectDateOnly")).click();
				
		List<WebElement> trainNames = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr/td[2]"));
			System.out.println();	
		Set<String> trainSet = new TreeSet<String>();
		
		for(WebElement trainName: trainNames) {
			trainSet.add(trainName.getText());
			System.out.println(trainName.getText());
		}
		
		if(trainNames.size()==trainSet.size())
		System.out.println("\nNo Duplicates");

	}

}
