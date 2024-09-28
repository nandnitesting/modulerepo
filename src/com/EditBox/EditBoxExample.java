package com.EditBox;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class EditBoxExample {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\M RAMA CHENNAREDDY\\Desktop\\10-30 Batch\\CoreJava\\Browsers\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
driver.manage().window().maximize();
WebElement userName=driver.findElement(By.id("email"));
userName.sendKeys("Livetech");
WebElement password=driver.findElement(By.id("pass"));
password.sendKeys("Livetech@123");
String userid=userName.getAttribute("value");
System.out.println(userid);

String pwd=password.getAttribute("value");
System.out.println(pwd);

if(pwd.contains(userid))
{
	System.out.println("true");
}
else
{
	System.out.println("false");
}

if(password.equals(userName))
{
	System.out.println("true");
}
else
{
	System.out.println("false");
}



	}

}
