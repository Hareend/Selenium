package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simple2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String actual_Text = "Hello";
		String expected_Text = "Helloo";
		WebDriver driver;
		System.setProperty("Webdriver.chrome.driver", "C:\\Hareend\\Selenium_Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/index.php");
		WebElement webelement = driver.findElement(By.xpath("//*[@id=\"collapsibleNavbar\"]/ul/li[2]/a"));
		webelement.click();
		WebElement message =driver.findElement(By.id("single-input-field"));
		message.sendKeys(actual_Text);
		//WebElement show = driver.findElement(By.id("button-one"));
		driver.findElement(By.id("button-one")).click();
		driver.findElement(By.id("message-one")).getText();
		if(actual_Text.equals(expected_Text))
		{
			System.out.println("values are same");
		}
		else
		{
			System.out.println("Values are not same");
		}
		//show.click();
		//driver.close();
	}

}
