package com.KeyboardActions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyPressesExample {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/key_presses");
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
		action.sendKeys(Keys.ENTER).perform();
		Thread.sleep(5000);
		action.sendKeys(Keys.BACK_SPACE).perform();
		Thread.sleep(5000);
		action.sendKeys(Keys.ALT).perform();
		Thread.sleep(5000);
		action.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(5000);
		action.sendKeys(Keys.ARROW_LEFT).perform();
		Thread.sleep(5000);
		action.sendKeys(Keys.ARROW_RIGHT).perform();
		Thread.sleep(5000);
		action.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(5000);
	}

}
