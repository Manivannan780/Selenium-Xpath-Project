package xpath_demo;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Xpath_myProject {
	static WebDriver driver;
	static String sugg;
	public static void main (String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Important\\Selenium\\Drivers\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("http://www.google.co.in");
		driver.manage().window().maximize();

		WebElement text=driver.findElement(By.name("q"));
		text.sendKeys("Tree");//+Keys.ENTER);
		Thread.sleep(2000);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Xpath using Attribute 
		List<WebElement> suggestion=driver.findElements(By.xpath("//ul[@role='listbox']//following::li"));

		//Method 1 using String Contains
		for (WebElement dataa : suggestion) {
			sugg=dataa.getText();
			System.out.println(sugg);
			if(sugg.contains("hindi")) {
				dataa.click();
				break;	
			}

			// 2nd Method using position index

			//int pos=0;
			//if(pos==3) {
			//dataa.click();
			//break;
			//}

		}

	}
}
