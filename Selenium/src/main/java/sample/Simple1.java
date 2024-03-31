package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simple1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("Webdriver.chrome.driver", "C:\\Hareend\\Selenium_Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		driver.get("https:www.google.com");
		System.out.println(driver.getTitle());
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		//driver.close();
		driver.quit();
	}

}
