package bpbonline;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bpbLocatorsExample {

	public static void main(String[] args) {
		
		String wlcmTitle = "Welcome, Please Sign In";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice.bpbonline.com/");
	//	WebElement element =driver.findElement(By.xpath("//span[contains(text(),'My Account')]"));
		
		WebElement myAccount =driver.findElement(By.linkText("My Account"));
		myAccount.click();
		
		WebElement welcomeTitle = driver.findElement(By.cssSelector("#bodyContent h1"));
		String title = welcomeTitle.getText();
		
		Boolean flag = wlcmTitle.equals(title);
		if(flag)
			System.out.println("You are on Sign in Page");
		
		else
			System.out.println("Please Try Again!!!!");
	
		
		
		

	}

}
