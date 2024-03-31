package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("Webdriver.chrome.driver", "C:\\Hareend\\Selenium_Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/index.php");
		WebElement webelement = driver.findElement(By.xpath("//*[@id=\"collapsibleNavbar\"]/ul/li[2]/a"));
		webelement.click();
		WebElement webelement1 = driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/div/ul/li[4]/a"));
		webelement1.click();
		//Select selectColor = new Select(driver.findElement(By.id("single-input-field")));
		//selectColor.selectByValue("Red");
		//or
		Select selectColor = new Select(driver.findElement(By.id("multi-select-field")));
		selectColor.selectByIndex(0);
		selectColor.selectByIndex(2);
	}

}
