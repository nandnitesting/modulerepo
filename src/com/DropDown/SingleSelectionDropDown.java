package com.DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectionDropDown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M RAMA CHENNAREDDY\\Desktop\\10-30 Batch\\CoreJava\\Browsers\\chromedriver.exe")	;
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().window().maximize();
		WebElement courseElement=driver.findElement(By.id("course"));
		Select courseName=new Select(courseElement);

		List<WebElement> optionCount=courseName.getOptions();
		//	int options=optionCount.size();
		//	System.out.println(options);

		System.out.println(optionCount.size());

		for(int index=0;index<optionCount.size();index++)
		{
			System.out.println(optionCount.get(index).getText());
		}

		for(WebElement option:optionCount)
		{
			System.out.println("The value of:"+option.getText());
		}

		courseName.selectByIndex(3);
		Thread.sleep(5000);
		courseName.selectByValue("js");
		Thread.sleep(5000);
		courseName.selectByVisibleText("Dot Net");
		//courseName.deselectByIndex(0);
		courseName.isMultiple();
		List<WebElement>option1=courseName.getAllSelectedOptions();

		for(WebElement selected:option1)
		{
			System.out.println(selected.getText());
		}
		WebElement selected1=courseName.getFirstSelectedOption();
		System.out.println(selected1.getText());


	}

}
