package bpbonline;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class accountCreationForm {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice.bpbonline.com/");
		WebElement myAccount =driver.findElement(By.linkText("My Account"));
		myAccount.click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Continue')]")).click();
		
		//Fill the form
		
		//Select Female 
		driver.findElement(By.xpath("//input[@value='f']")).click();
		
		//FirstName
		driver.findElement(By.name("firstname")).sendKeys("Test");
		
		//LastName
		driver.findElement(By.name("lastname")).sendKeys("BB");
		
		//DOB
		driver.findElement(By.id("dob")).sendKeys("01/04/2005");
		
		//Email address
		driver.findElement(By.name("email_address")).sendKeys("test2@gmail.com");
		
		
		//Address Details
		
		driver.findElement(By.name("street_address")).sendKeys("Test address");
		
		driver.findElement(By.name("suburb")).sendKeys("Test street");
		
		driver.findElement(By.name("postcode")).sendKeys("223344");
		
		
		driver.findElement(By.name("city")).sendKeys("test city");
		
		driver.findElement(By.name("state")).sendKeys("test state");
		
		
		//Select Country
		
		WebElement country = driver.findElement(By.name("country"));
		
		Select select =  new Select(country);
		
		select.selectByVisibleText("India");
		
	
	   //Select Contact Information
		
		driver.findElement(By.name("telephone")).sendKeys("1234567890");
		driver.findElement(By.name("password")).sendKeys("Test@123");
	    driver.findElement(By.name("confirmation")).sendKeys("Test@123");
	    
	    
	    //Submit form
	    
        driver.findElement(By.xpath("//span[contains(text(),'Continue')]")).click();	}

}
