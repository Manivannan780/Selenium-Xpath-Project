package xpath_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locating_Elements_Attributes {
static WebDriver driver;

public static void locating_attribute() {
	
	WebElement username=driver.findElement(By.xpath("//*[@name='txtUsername']"));
	username.sendKeys("Admin");
	WebElement password=driver.findElement(By.xpath("//*[@name='txtPassword']"));
	password.sendKeys("admin123");
	WebElement clickbutton=driver.findElement(By.xpath("//*[@name='Submit']"));
	clickbutton.click();

}

public static void locating_elment_attribute() {
	
	WebElement username=driver.findElement(By.xpath("//input[@name='txtUsername']"));
	username.sendKeys("Admin");
	WebElement password=driver.findElement(By.xpath("//input[@name='txtPassword']"));
	password.sendKeys("admin123");
	WebElement clickbutton=driver.findElement(By.xpath("//input[@name='Submit']"));
	clickbutton.click();

}

public static void locating_element_visibletext() {
	WebElement visibletext=driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']"));
	visibletext.click();
	
	
}

public static void locating_element_partialtext() {
	WebElement visibletext=driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM')]"));
	visibletext.click();
	
	
}

public static void locating_multipleattributes() {
	WebElement username=driver.findElement(By.xpath("//input[@name='txtUsername']"));
	username.sendKeys("Admin");
	WebElement password=driver.findElement(By.xpath("//input[@name='txtPassword']"));
	password.sendKeys("admin123");
	WebElement clickbutton=driver.findElement(By.xpath("//input[@name='Submit'][@class='button']"));
	clickbutton.click();

}

public static void locating_startswith() {
	WebElement username=driver.findElement(By.xpath("//input[@name='txtUsername']"));
	username.sendKeys("Admin");
	WebElement password=driver.findElement(By.xpath("//input[@name='txtPassword']"));
	password.sendKeys("admin123");
	WebElement clickbutton=driver.findElement(By.xpath("//*[starts-with(@name,'Sub')]"));
	clickbutton.click();

}


public static void locating_containswith() {
	WebElement username=driver.findElement(By.xpath("//input[@name='txtUsername']"));
	username.sendKeys("Admin");
	WebElement password=driver.findElement(By.xpath("//input[@name='txtPassword']"));
	password.sendKeys("admin123");
	WebElement clickbutton=driver.findElement(By.xpath("//*[contains(@name,'Sub')]"));
	clickbutton.click();

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Important\\Selenium\\Drivers\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.xpath("//input[@name='txtUsername']"));
		username.sendKeys("Admin");
		WebElement password=driver.findElement(By.xpath("//input[@name='txtPassword']"));
		password.sendKeys("admin123");
		WebElement clickbutton=driver.findElement(By.xpath("//input[@name='Submit'][@class='button']"));
		clickbutton.click();
	
		
	}

}
