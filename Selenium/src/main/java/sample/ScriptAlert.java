package sample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ScriptAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		//System.setProperty("Webdriver.chrome.driver", "C:\\Hareend\\Selenium_Drivers\\chromedriver.exe");
		System.setProperty("Webdriver.edge.driver", "C:\\Hareend\\Selenium_Drivers\\msedgedriver.exe");
		//driver = new ChromeDriver();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/index.php");
		WebElement modals = driver.findElement(By.id("alert-modal"));
		modals.click();
		WebElement sidebar = driver.findElement(By.xpath("//a[text()='Javascript Alert']"));
		sidebar.click();
		WebElement alertbutton = driver.findElement(By.xpath("//button[text()='Click for Prompt Box']"));
		alertbutton.click();
		Alert alert = driver.switchTo().alert();
		String a = alert.getText();
		System.out.println(a);
		driver.switchTo().alert().sendKeys("Test");
		Thread.sleep(5000);
		//alert.accept();
	}

}
