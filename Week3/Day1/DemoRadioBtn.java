package Week3.Day1;

/*
 * - Select 'Your most favourite browser' from the radio buttons
- Click on a radio button, then click on the same radio button again 
  to verify that it becomes ‘unselected’.
- Identify the radio button that is initially selected by default.
- Check and select the age group (21-40 Years) if not already selected.
 */

import java.time.Duration;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoRadioBtn {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
				
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//	Select 'Your most favourite browser' from the radio buttons
	    driver.findElement(By.xpath("//label[text()='Chrome']")).click();
	    System.out.println("Chrome selected");
	    
	    //Click on a radio button, then click on the same radio button again 
	    //to verify that it becomes ‘unselected’.
        driver.findElement(By.xpath("//label[text()='Chennai']")).click();
       
        WebElement chnRadio = driver.findElement(By.xpath("//label[text()='Chennai']"));
        chnRadio.click();
        boolean isRadSelected = chnRadio.isSelected();
        
        if(!isRadSelected)
        	System.out.println("Chennai not selected");
	 
        //Identify the radio button that is initially selected by default.
        WebElement defaultRadio = driver.findElement(By.xpath("//input[@name='j_idt87:console2' and @checked='checked']"));
        String strDefaultBrowserId = defaultRadio.getAttribute("Id");
               
        WebElement defaultRadLabel =  driver.findElement(By.xpath("//label[@for='"+ strDefaultBrowserId+ "']"));
        System.out.println(defaultRadLabel.getText()+" is selected by default.");
        
        //Check and select the age group (21-40 Years) if not already selected.
      
        WebElement radAge = driver.findElement(By.xpath("//input[@id='j_idt87:age:1' and @value='21-40 Years']"));
        if(!radAge.isSelected()) {
        	WebElement labelAge = driver.findElement(By.xpath("//label[@for='j_idt87:age:1']"));
        	labelAge.click();
        }
        else
        	 System.out.println("21-40 already selected");
        
        //driver.close();
        
	}

}
