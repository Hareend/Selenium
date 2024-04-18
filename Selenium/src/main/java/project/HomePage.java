package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	By homeLINK=By.xpath("//div[@id='collapsibleNavbar']/child::ul[@class='navbar-nav']/child::li[@class='nav-item active']/a");
	By inputFormLINK=By.xpath("//div[@id='collapsibleNavbar']/child::ul[@class='navbar-nav']/child::li[@class='nav-item'][1]/a");
	By datePickersLINK=By.xpath("//div[@id='collapsibleNavbar']/child::ul[@class='navbar-nav']/child::li[@class='nav-item'][2]/a");
	By tableLINK=By.xpath("//div[@id='collapsibleNavbar']/child::ul[@class='navbar-nav']/child::li[@class='nav-item'][3]/a");
	By progressBarsLINK=By.xpath("//div[@id='collapsibleNavbar']/child::ul[@class='navbar-nav']/child::li[@class='nav-item'][4]/a");
	By alertsAndModalsLINK=By.xpath("//div[@id='collapsibleNavbar']/child::ul[@class='navbar-nav']/child::li[@class='nav-item'][5]/a");
	By listBoxLINK=By.xpath("//div[@id='collapsibleNavbar']/child::ul[@class='navbar-nav']/child::li[@class='nav-item'][6]/a");
	By othersLINK=By.xpath("//div[@id='collapsibleNavbar']/child::ul[@class='navbar-nav']/child::li[@class='nav-item'][7]/a");

	public void clickHome()
	{
	driver.findElement(homeLINK).click();	
	}
	public void clickInputForm()
	{
		driver.findElement(inputFormLINK).click();
	}
	
	public void clickDatePickers()
	{
	driver.findElement(datePickersLINK).click();	
	}

	public void clickTable()
	{
		driver.findElement(tableLINK).click();
	}
	
	public void clickProgressBar()
	{
		driver.findElement(progressBarsLINK).click();
	}
	
	public void clickAlertsAndModals()
	{
		driver.findElement(alertsAndModalsLINK).click();
	}
	
	public void clickListBox()
	{
		driver.findElement(listBoxLINK).click();
	}
	
	public void clickOthers()
	{
		driver.findElement(othersLINK).click();
	}

}
