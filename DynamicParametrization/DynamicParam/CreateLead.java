package Week5.DynamicParam;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class CreateLead extends ProjectSpecificMethod {

	@Test(dataProvider="fetchData")  //-> keyword dataProvider is keysensitive	

	public void CrtLead(String cname, String fname, String lname, String phno){ //-> instead of main()
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phno);
		driver.findElement(By.name("submitButton")).click();
		
	}
	
	//for dynamic values
	// TestLEaf - Hari - logan - 123456789
	// TestLEaf - Blana - Sree - 344545789
	// TestLEaf - Fanaa - Gia -  232356789

	@DataProvider(name="fetchData")
	public String[][] setData(){
	String[][] data = new String[3][4];

	data[0][0] = "TestLeaf";
	data[0][1] = "Hari";
	data[0][2] ="logan";
	data[0][3] = "123456789";


	data[1][0] = "TestLeaf";
	data[1][1] = "Blana";
	data[1][2] = "Sree";
	data[1][3] = "344545789";

	data[2][0] = "TestLeaf";
	data[2][1] = "Fanaa";
	data[2][2] ="Gia";
	data[2][3] = "232356789";

	return data;

	}
}






