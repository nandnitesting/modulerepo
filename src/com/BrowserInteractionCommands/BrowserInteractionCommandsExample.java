package com.BrowserInteractionCommands;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserInteractionCommandsExample {

	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\M RAMA CHENNAREDDY\\Desktop\\10-30 Batch\\CoreJava\\Browsers\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();	
	//To Specify The URL
	driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
	//To maximize the window
	driver.manage().window().maximize();
	//To get the page source 
	String pgesrc=driver.getPageSource();
	System.out.println(pgesrc);
	//To get the title of the web page
	String title=driver.getTitle();
	System.out.println("The title of the web page is:"+title);
	//To get the URL of the web page
	String url=driver.getCurrentUrl();
	System.out.println(url);
	     //OR
	System.out.println(driver.getCurrentUrl());
	Thread.sleep(5000);
	//to navigate the URL of the webpage
	driver.navigate().to("https://www.facebook.com/");
	Thread.sleep(5000);
	//to move one page back
	driver.navigate().back();
	Thread.sleep(5000);
	//to move one page Forward
	driver.navigate().forward();
	Thread.sleep(5000);
	//To refresh the webpage
	driver.navigate().refresh();
	//To close the current window
	//driver.close();
	driver.quit();
		

	}

}
