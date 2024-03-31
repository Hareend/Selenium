package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("Webdriver.chrome.driver", "C:\\Hareend\\Selenium_Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.gmail.com");
		//isDisplayed() method returns boolean value either True or False
		Boolean Display = driver.findElement(By.xpath("//*[@id='next']")).isDisplayed();
		//To print the value
		System.out.println("Element displayed is :"+Display);
		//isEnabled() method returns boolean value either True or False 
		Boolean Enable = driver.findElement(By.xpath("//*[@id='next']")).isEnabled();
		System.out.println("Element enabled is :"+Enable);
		//Passing value as "softwaretestingmaterial" in the email field
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("<put_an_email_id>");
		//to click on next button
		driver.findElement(By.xpath("//*[@id='next']")).click();
		//isSelected() method returns boolean value either True or False
		Boolean Select = driver.findElement(By.xpath("//*[@id='PersistentCookie']")).isSelected();
		System.out.println("Element selected is :"+Select);
	}

}
