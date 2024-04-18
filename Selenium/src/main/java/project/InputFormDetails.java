package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InputFormDetails {
	
	WebDriver driver;
	public InputFormDetails(WebDriver driver) 
	{
		this.driver=driver;
	}

//elements from Input Form page of https://selenium.qabible.in/simple-form-demo.php
	
	By messageTextBox=By.id("single-input-field");
	By showMessageButton=By.xpath("//button[contains(@id,'button-one')]");
	By yourMessageText=By.id("message-one");
	
	By valueATextBox=By.id("value-a");
	By valueBTextBox=By.id("value-b");
	By getTotalButton=By.id("button-two");
	By totalText=By.id("message-two");
	
	public void enterMessage(String message)
	{
		driver.findElement(messageTextBox).sendKeys(message);			
	}
	
	public void showMessageButtonClick()
	{
		driver.findElement(showMessageButton).click();
	}
	public String yourMessageTextVerify()
	{
		String messageTextValue = driver.findElement(yourMessageText).getText();
		return messageTextValue;
	}

}
