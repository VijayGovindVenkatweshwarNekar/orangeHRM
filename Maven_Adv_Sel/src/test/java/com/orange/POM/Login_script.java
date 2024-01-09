package com.orange.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_script 
{
	@FindBy(name="username")
	private WebElement un_tf;
	
	@FindBy(name="password")
	private WebElement pwd_tf;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement login_btn;
	
	public Login_script(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Enter_un(String un )
	{
		 un_tf.sendKeys(un);
	}
	
	public WebElement Enter_pwd( )
	{
		return pwd_tf;
	}
	
	public void Click_login()
	{
		login_btn.click();
	}

}
