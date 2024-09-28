package com.DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectionDropDownExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M RAMA CHENNAREDDY\\Desktop\\10-30 Batch\\CoreJava\\Browsers\\chromedriver.exe")	;
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().window().maximize();
		
		WebElement ideElement=driver.findElement(By.id("ide"));
		
		Select ideName=new Select(ideElement);
		List<WebElement>optionCount=ideName.getOptions();
//		int Option=optionCount.size();
//		System.out.println(Option);
		System.out.println(optionCount.size());
		
		for(int index=0;index<optionCount.size();index++)
		{
			System.out.println(optionCount.get(index).getText());
		}
		for(WebElement option:optionCount)
		{
		System.out.println("The visible text is:"+option.getText());		
		}
		
		ideName.selectByIndex(1);
		ideName.selectByValue("vs");
		ideName.selectByVisibleText("NetBeans");
		Thread.sleep(5000);
		ideName.deselectAll();
//ideName.deselectByIndex(1);
//		Thread.sleep(5000);
//		ideName.deselectByValue("vs");
//		Thread.sleep(5000);
//		ideName.deselectByVisibleText("NetBeans");
		
		List<WebElement>selected=ideName.getAllSelectedOptions();
		for(WebElement select:selected)
		{
			System.out.println("The selected text is:"+select.getText());
		}
		
		WebElement selected1=ideName.getFirstSelectedOption();
		System.out.println(selected1.getText());
	}

}
