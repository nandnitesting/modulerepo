package com.Livetech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class OHRMLogin extends OHRMBaseTest{

	@Test
	public void OHRM()
	{
		WebElement userName=driver.findElement(By.id("txtUsername"));
	
		userName.sendKeys("JOSHI");
		WebElement passWord=driver.findElement(By.id("txtPassword"));
		passWord.sendKeys("Nandu@7899");
	
	WebElement login=driver.findElement(By.id("btnLogin"));
	login.click();
	}
	@Test
	public void welcome()
	{
		WebElement welcomeProperty=driver.findElement(By.id("welcome"));
		welcomeProperty.click();
	}
	
	
	
	
	
	
}
