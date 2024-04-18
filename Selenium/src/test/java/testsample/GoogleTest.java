package testsample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GoogleTest {
	
	private static final boolean False = false;
	public static String page_url = "https:www.google.com";
	@Test(priority = 2, groups = {"smoke", "regression"})
	
	public void verifygoogle()
	{
		WebDriver driver;
		System.setProperty("Webdriver.chrome.driver", "C:\\Hareend\\Selenium_Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		//driver.get("https:www.google.com");
		driver.get(page_url);
		System.out.println(driver.getTitle());
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		//driver.close();
		driver.quit();
	}
	
	@Test(priority = 1, invocationCount = 2, groups = {"smoke"})
	public void testA()
	{
		System.out.println("Test A");
	}
	@Test(priority = 0, enabled = False)
	public void testB()
	{
		System.out.println("Test B");
	}
	@Test(priority = -2, groups = {"regression"})
	@Parameters({"browser"})
	public void testC(String browser) throws Exception
	{
		System.out.println(browser);
	}
	

}
