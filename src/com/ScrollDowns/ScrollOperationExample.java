package com.ScrollDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollOperationExample {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//Using as Pixels
		
//		js.executeScript("window.scrollBy(0,500)", " ");
//		Thread.sleep(5000);
//		js.executeScript("window.scrollBy(0,-500)", " ");
		
		//Using Visibility of an WebElement
		
//		WebElement key=driver.findElement(By.linkText("Checkboxes"));
//		js.executeScript("arguments[0].scrollIntoView();",key );
//		key.click();
//		
		//Scrolldown using bottom of the webpage
		
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
        //using Horizontal scroll of the webpage
//		WebElement file=driver.findElement(By.linkText("File Upload"));
//		js.executeScript("arguments[0].scrollIntoView();",file );
//		file.click();
		WebElement key=driver.findElement(By.linkText("Checkboxes"));
		js.executeScript("arguments[0].scrollIntoView();",key );
		key.click();
	}

}
