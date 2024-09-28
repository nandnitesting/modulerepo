package com.Livetech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FacebookLogin extends FacebookBaseTest {


	@Test
	public void Facebook()
	{

		WebElement userName=driver.findElement(By.id("email"));
		userName.sendKeys("Livetech");
		WebElement passWord=driver.findElement(By.id("pass"));
		passWord.sendKeys("livetech@gmail.com");
		WebElement login=driver.findElement(By.name("login"));
		login.click();
		driver.navigate().back();
	}
	@Test
	public void Forget()
	{
		WebElement forgot=driver.findElement(By.linkText("Forgotten password?"));
		forgot.click();
	}

}
