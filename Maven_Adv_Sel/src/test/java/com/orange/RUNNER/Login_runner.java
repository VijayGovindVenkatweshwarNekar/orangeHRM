package com.orange.RUNNER;

import org.testng.annotations.Test;

import com.orange.POM.Login_script;
import com.orange.generic.Base_Class_orange;

public class Login_runner extends Base_Class_orange
{
@Test
public void run() throws InterruptedException
{
	
	Login_script p=new Login_script(driver);
	p.Enter_un("admin");
	Thread.sleep(2000);
	p.Enter_pwd().sendKeys("admin123");
	Thread.sleep(2000);
	p.Click_login();
	
}
}



