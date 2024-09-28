package com.WaitMethods;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitMethodsExample {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement userName=driver.findElement(By.id("txtUsername"));
		userName.sendKeys("JOSHI");

		WebElement password=driver.findElement(By.id("txtPassword"));
		password.sendKeys("Nandu@7899");

		driver.findElement(By.id("btnLogin")).click();

		WebElement welcomeProperty=driver.findElement(By.id("welcome"));

		welcomeProperty.click();
		//driver.findElement(By.linkText("Logout")).click();

		//By logOutProperty=By.linkText("Logout");
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(logOutProperty));
		//WebElement logOut=driver.findElement(logOutProperty);
		//logOut.click();

		//FluentWait<WebDriver>wait=new FluentWait<WebDriver>(driver);
		//wait.withTimeout(Duration.ofSeconds(20));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(logOutProperty));
		//WebElement logOut=driver.findElement(logOutProperty);
		//logOut.click();

		WebElement admin=driver.findElement(By.id("menu_admin_viewAdminModule"));
		admin.click();
	}

}
