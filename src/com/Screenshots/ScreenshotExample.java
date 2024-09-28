package com.Screenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotExample {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		//Full Screenshot	
		//	File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//
		//	FileUtils.copyFile(screenshot, new File(".//Screenshots//facebookHomePage.png"));


		//	WebElement tableProperty=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]"));
		//	//Screenshot for half section
		//	File screenshot=tableProperty.getScreenshotAs(OutputType.FILE);
		//	FileUtils.copyFile(screenshot, new File(".//Screenshots//FacebookTable.png"));


		WebElement userName=driver.findElement(By.id("email"));
		File screenshot=userName.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File(".//Screenshots//facebookUserid.png"));
	}


}


