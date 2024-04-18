package seleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import project.HomePage;
import project.InputForm;
import project.InputFormDetails;


public class SampleTest {
	
	WebDriver driver;
	public static String URL="https://selenium.qabible.in/";
	
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/main/resources/chromedriver.exe");		
		//System.setProperty("Webdriver.chrome.driver", "C:\\Hareend\\Selenium_Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();		
	}
	
	HomePage HomePage;
	@Test(priority = 1)
	public void verifyClickInputForm()
	{
		HomePage=new HomePage(driver);
		HomePage.clickInputForm();
	}
	
	InputForm InputForm;
	@Test(priority = 2)
	public void verifyClickSimpleFormDemo()
	{
	InputForm=new InputForm(driver);
	InputForm.clickSimpleFormDemo();	
	}
	
	InputFormDetails InputFormDetails;
	@Test(priority = 3)
	public void verifyInputFormDetailsSingleInput()
	{
		InputFormDetails=new InputFormDetails(driver);
		InputFormDetails.enterMessage("Here is a Sample Text");
		InputFormDetails.showMessageButtonClick();
		String messageText=InputFormDetails.yourMessageTextVerify();
		System.out.println(messageText);
		try
		{
		Assert.assertEquals("Your Message : Here is a Sample Text", "Your Message : Here is a Sample Text");
		System.out.println("Inserted & displayed message are the same");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}		
	}
	
	@Test(priority = 4)
	public void browserQuit()
	{
		driver.quit();
	}

}

