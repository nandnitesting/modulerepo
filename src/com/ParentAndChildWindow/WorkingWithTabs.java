package com.ParentAndChildWindow;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithTabs {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.amazon.in/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.meesho.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.myntra.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.flipkart.com/");

		driver.quit();


	}

}
