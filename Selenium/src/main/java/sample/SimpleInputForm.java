package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleInputForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("Webdriver.chrome.driver", "C:\\Hareend\\Selenium_Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/index.php");
		WebElement page = driver.findElement(By.xpath("//div[@id='collapsibleNavbar']/ul/li[2]"));
		page.click();
		WebElement page1 = driver.findElement(By.xpath("//div[@class='card']/ul/li[1]"));
		page1.click();
		driver.findElement(By.id("single-input-field")).sendKeys("Hello Team");
		driver.findElement(By.xpath("//button[@id='button-one']")).click();
		System.out.println("Your Message: "+driver.findElement(By.id("//*[@id=\"message-one\"]")));
	}

}
