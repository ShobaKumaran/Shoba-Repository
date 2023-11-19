package Week3.Day4;

/*
 * - Launch the URL https://www.ajio.com/
- In the search box, type as "bags" and press enter
- To the left of the screen under "Gender" click on "Men"
- Under "Category" click "Fashion Bags"
- Print the count of the items found. 
- Get the list of brand of the products displayed in the page and print the list.
- Get the list of names of the bags and print it
 */
import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListAjio {

	public static void main(String[] args) throws InterruptedException {
		 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys("bags");
		
		driver.findElement(By.xpath("//button[@class='rilrtl-button']")).submit();
	 	
		driver.findElement(By.xpath("(//div[@class='facet-linkhead'])[2]/label")).click();
		Thread.sleep(2000);	
			
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();
		
		Thread.sleep(2000);
		
		WebElement wbCount = driver.findElement(By.xpath("//div[@class='length']"));
		System.out.println(wbCount.getText());
		
		List<WebElement> wbBrandList = driver.findElements(By.xpath("//div[@class='brand']/strong"));
		List<WebElement> wbBagList = driver.findElements(By.xpath("//div[@class='nameCls']"));
		
		Set<String> strBrandNames = new TreeSet<String>();
		
		for(WebElement wbBrandName: wbBrandList) 
			strBrandNames.add(wbBrandName.getText());			
		
		System.out.println("Brands Available:");
		System.out.println(strBrandNames);
		
		int i=1;
		for(WebElement wbBagName:wbBagList) {
			System.out.println(i + ":" + wbBagName.getText());
			i++;
		}
	
		
		 
		
	}

}
