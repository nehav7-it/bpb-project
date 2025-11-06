package bpbonline;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bpbLaunchingOfBrowser {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice.bpbonline.com/");
		driver.quit();
		

	}

}
