package bpbonline;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class VerifyTitleExample {

	public static void main(String[] args) {
		
		String expectedTitle = "BPB Online";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice.bpbonline.com/");
		
		String actualTitle = driver.getTitle();
		
	
		 if (actualTitle.equals(expectedTitle)) {
	            System.out.println("✅ Test Passed: Title matched!");
	        } else {
	            System.out.println("❌ Test Failed: Title did not match!");
	            System.out.println("Expected: " + expectedTitle);
	            System.out.println("Actual: " + actualTitle);
	        }

	}

}
