package xpath_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locating_Elments_axes_Methods {
	static WebDriver driver;

	public void locating_parent() {
		driver.findElement(By.xpath("//*[@id='divUsername']//parent::form"));
	}

	public void locating_child() {
		driver.findElement(By.xpath("//*[@id='divUsername']//child::*"));

	}

	public void locating_ancestor() {
		driver.findElement(By.xpath("//*[@id='txtUsername']//ancestor::*"));
	}

	public void locating_following() {
		driver.findElement(By.xpath("//*[@id='txtUsername']//following::input[1]"));
	}


	public void loacting_sibling() {

		driver.findElement(By.xpath("//*[@id='txtUsername']//following-sibling::*"));
	}

	public void loacting_preceding() {
		driver.findElement(By.xpath("//*[@class='form-hint']//preceding-sibling::*"));

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Important\\Selenium\\Drivers\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

	}

}
