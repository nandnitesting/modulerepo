package com.ParentAndChildWindow;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentIDChildID {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M RAMA CHENNAREDDY\\Desktop\\10-30 Batch\\CoreJava\\Browsers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://gmail.com");
		driver.manage().window().maximize();
		WebElement help=driver.findElement(By.linkText("Help"));
		help.click();
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		Set<String>child=driver.getWindowHandles();
		System.out.println(child);
		if(child.equals(parent))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}


	}

}
