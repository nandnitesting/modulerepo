package com.KeyboardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActionsExample {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();

		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)", " ");

		WebElement userNameProperty=driver.findElement(By.id("userName"));

		userNameProperty.sendKeys("Livetech");
		WebElement userMail=driver.findElement(By.id("userEmail"));
		userMail.sendKeys("livetech@gmail.com");

		WebElement currentAddress=driver.findElement(By.id("currentAddress"));
		currentAddress.sendKeys("Ameerpet,Hyderabad");
		WebElement permanentAddress=driver.findElement(By.id("permanentAddress"));

		Actions action=new Actions(driver);
		//	action.keyDown(Keys.CONTROL);
		//	action.sendKeys("a");
		//	action.keyUp(Keys.CONTROL);
		//	action.perform();

		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		action.sendKeys(Keys.TAB);
		action.perform();
		action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
	}

}
