package com.RadioButtons;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonsExample {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M RAMA CHENNAREDDY\\Desktop\\10-30 Batch\\CoreJava\\Browsers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		WebElement tableproperty=driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		List<WebElement>group1Elements=tableproperty.findElements(By.name("group1"));
		int group1ElementsSize=group1Elements.size();
		System.out.println(group1ElementsSize);
		
//		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
//		List<WebElement>group2Elements=tableproperty.findElements(By.name("group2"));
//	    System.out.println(group2Elements.size());
		
		for(int GroupIndex=0;GroupIndex<=2;GroupIndex++)
		{
			group1Elements.get(GroupIndex).click();
			Thread.sleep(5000);
			
		for(int checkedStatus=0;checkedStatus<=2;checkedStatus++)	
		{
			
		String AttributesAndItsValues=	group1Elements.get(checkedStatus).getAttribute("value")+" "+group1Elements.get(checkedStatus).getAttribute("checked");	
		System.out.println(AttributesAndItsValues);
		}
		}
	
	}

}
