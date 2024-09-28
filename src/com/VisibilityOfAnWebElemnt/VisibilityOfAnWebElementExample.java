package com.VisibilityOfAnWebElemnt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VisibilityOfAnWebElementExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M RAMA CHENNAREDDY\\Desktop\\10-30 Batch\\CoreJava\\Browsers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();

		//isDisplayed()  
		WebElement userName=  driver.findElement(By.id("txtUsername"));
		boolean displayed=userName.isDisplayed();
		System.out.println(displayed);
		userName.sendKeys("JOSHI");

		//isEnabled()
		WebElement password=driver.findElement(By.id("txtPassword"));
		boolean enabled=  password.isEnabled();
		System.out.println(enabled);
		password.sendKeys("Nandu@7899");
		driver.findElement(By.id("btnLogin")).click();

		driver.findElement(By.id("menu_admin_viewAdminModule")).click();

		driver.findElement(By.id("menu_admin_UserManagement")).click();

		//isSelected()
		WebElement checkBox=driver.findElement(By.id("ohrmList_chkSelectAll"));

		boolean selected= checkBox.isSelected();
		System.out.println(selected);

		checkBox.click();

		System.out.println(checkBox.isSelected());
	}

}
