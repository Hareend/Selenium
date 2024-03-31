package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("Webdriver.chrome.driver", "C:\\Hareend\\Selenium_Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:www.google.com");
		System.out.println(driver.getTitle());
		WebElement search =driver.findElement(By.id("APjFqb"));
		search.sendKeys("Selenium");
		search.sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).sendKeys(Keys.ENTER);
		driver.findElement(By.linkText("Selenium")).sendKeys(Keys.ENTER);
		System.out.println(driver.getTitle());
		driver.close();
	}

}
