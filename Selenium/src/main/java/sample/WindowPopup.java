package sample;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("Webdriver.chrome.driver", "C:\\Hareend\\Selenium_Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/index.php");
		WebElement page = driver.findElement(By.xpath("//div[@class='collapse navbar-collapse']/ul/li[6]"));
		page.click();
		WebElement Menu = driver.findElement(By.xpath("//div[@class='card']/ul/li[3]"));
		Menu.click();
		WebElement popup = driver.findElement(By.xpath("//a[text()='  Like us On Facebook ']"));
		popup.click();
		driver.findElement(By.xpath("//a[@class='btn btn-primary windowSingle']")).click();
		String parentwindow = driver.getWindowHandle(); //current window handle
		Set<String> WindowHandlesss = driver.getWindowHandles(); //all window handle
		for(String childWindow : WindowHandlesss)
		{
			if(!parentwindow.equals(childWindow))
			{
				driver.switchTo().window(childWindow);
				driver.manage().window().maximize();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//input[@id=':rn:']")).sendKeys("Hello");
				driver.findElement(By.xpath("//input[@id=':rq:']")).sendKeys("hellonnsss");
			}
		}
		
	}

}



//table[@id='dtBasicExample']/child::tbody/descendant::td[text()='Ashton Cox']

