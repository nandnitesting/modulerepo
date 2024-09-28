package com.MouseOverActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverActionExample {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M RAMA CHENNAREDDY\\Desktop\\10-30 Batch\\CoreJava\\Browsers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement helloSignIn=driver.findElement(By.id("nav-link-accountList"));

		Actions action=new Actions(driver);
		action.moveToElement(helloSignIn).build().perform();

		driver.findElement(By.linkText("Your Orders")).click();
		Thread.sleep(5000);

		driver.navigate().back();
		Thread.sleep(5000);
		WebElement helloSignIns=driver.findElement(By.id("nav-link-accountList"));

		Actions action1=new Actions(driver);
		action1.moveToElement(helloSignIns).build().perform();
		driver.findElement(By.linkText("Your Prime Membership")).click();
	}

}
