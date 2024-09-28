package com.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M RAMA CHENNAREDDY\\Desktop\\10-30 Batch\\CoreJava\\Browsers\\chromedriver.exe");

		ChromeDriver driver=new ChromeDriver();

		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();

		WebElement frameProperty=driver.findElement(By.className("demo-frame"));
		//To Enter the frame

		driver.switchTo().frame(frameProperty);
		WebElement drag=driver.findElement(By.id("draggable"));

		//	String dragText=drag.getText();
		//	System.out.println(dragText);
		System.out.println(drag.getText());

		WebElement drop=driver.findElement(By.id("droppable"));
		String dropText=drop.getText();
		System.out.println(dropText);
		//System.out.println(drop.getText());

		Actions action=new Actions(driver);
		action.dragAndDrop(drag, drop).build().perform();
		driver.switchTo().defaultContent();

		WebElement resizableProperty=driver.findElement(By.linkText("Resizable"));
		resizableProperty.click();



	}

}
