package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InputForm {
	WebDriver driver;
	public InputForm(WebDriver driver) {
		this.driver=driver;
	}
	
	By simpleFormDemo=By.xpath("//li[@class='list-group-item'][1]/child::a");
	By checkBoxDemo=By.xpath("//li[@class='list-group-item'][2]/child::a");
	By radioButtonsDemo=By.xpath("//li[@class='list-group-item'][3]/child::a");
	By selectInput=By.xpath("//li[@class='list-group-item'][4]/child::a");
	By formSubmit=By.xpath("//li[@class='list-group-item'][5]/child::a");
	By ajaxFormSubmit=By.xpath("//li[@class='list-group-item'][6]/child::a");
	By jquerySelect=By.xpath("//li[@class='list-group-item'][7]/child::a");
	
	public void clickSimpleFormDemo()
	{
		driver.findElement(simpleFormDemo).click();
	}
	public void clickCheckBoxDemo()
	{
		driver.findElement(checkBoxDemo).click();
	}
	public void clickRadioButtonsDemo()
	{
		driver.findElement(radioButtonsDemo).click();
	}
	public void clickSelectInput()
	{
		driver.findElement(selectInput).click();
	}
	public void clickFormSubmit()
	{
		driver.findElement(formSubmit).click();
	}
	public void clickAjaxFormSubmit()
	{
		driver.findElement(ajaxFormSubmit).click();
	}
	public void clickJquerySelect()
	{
		driver.findElement(jquerySelect).click();
	}
}

