package com.Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M RAMA CHENNAREDDY\\Desktop\\10-30 Batch\\CoreJava\\Browsers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement alert=driver.findElement(By.id("alert1"));
		alert.click();
		Alert alertText=driver.switchTo().alert();
		String text=alertText.getText();
		System.out.println(text);
		//alertText.accept();
		//alertText.dismiss();
		alertText.sendKeys("LiveTech");
	}

}
