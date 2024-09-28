package com.LocatorsExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M RAMA CHENNAREDDY\\Desktop\\10-30 Batch\\CoreJava\\Browsers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
	//Absolute XPath	
		WebElement userName=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/div[2]/input"));
		userName.sendKeys("JOSHI");
	//Relative XPath	
		//	WebElement passWord=driver.findElement(By.xpath("//*[@id=\"txtPassword\"]"));
		//	passWord.sendKeys("Nandu@7899");
		//WebElement pwd=driver.findElement(By.xpath("//input[@id='txtPassword']"));
		//	WebElement pwd=driver.findElement(By.xpath("//input[@id='txtPassword']"));
		//	pwd.sendKeys("LiveTech");
	//CSS Selector
		//	WebElement pwd=driver.findElement(By.cssSelector("input[id='txtPassword']"));
		//	pwd.sendKeys("Institute");
		driver.findElement(By.cssSelector("#txtPassword")).sendKeys("Testing");
	}

}
