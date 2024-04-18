package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("Webdriver.chrome.driver", "C:\\Hareend\\Selenium_Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/index.php");
		WebElement webelement = driver.findElement(By.xpath("//*[@id=\"collapsibleNavbar\"]/ul/li[2]/a"));
		webelement.click();
		WebElement webelement1 = driver.findElement(By.xpath("//a[text()='Form Submit']"));
		webelement1.click();
		driver.findElement(By.id("validationCustom01")).sendKeys("Hareend");
		driver.findElement(By.id("validationCustom02")).sendKeys("R U");
		driver.findElement(By.id("validationCustomUsername")).sendKeys("hareend");
		driver.findElement(By.id("validationCustom03")).sendKeys("Trivandrum");
		driver.findElement(By.id("validationCustom04")).sendKeys("Kerala");
		driver.findElement(By.id("validationCustom05")).sendKeys("695021");
		driver.findElement(By.xpath("//button[text()='Submit form']")).sendKeys(Keys.ENTER);
		WebElement actual_text= driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div[2]/form/div[3]/div/div"));
		if(actual_text.getText().trim().equals("You must agree before submitting."))
		{
		System.out.println("Message values are correct");
		}
		else
		{
		System.out.println("Message values are not correct");
		}
		/*try
		{
		System.out.println("Validation message displayed as:"+driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div[2]/form/div[3]/div/div")).isDisplayed());
		}
		catch (Exception e) {
		// TODO: handle exception
		System.out.println("Exception is: "+e);
		}*/
		//driver.close();

	}
	
    

}
