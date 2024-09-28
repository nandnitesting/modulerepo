package com.AutoIT;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OHRMAutoITExample {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("txtUsername")).sendKeys("JOSHI");
		driver.findElement(By.id("txtPassword")).sendKeys("Nandu@7899");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("menu_pim_viewPimModule")).click();

		driver.findElement(By.id("menu_pim_addEmployee")).click();
		driver.findElement(By.id("firstName")).sendKeys("Livetech");
		driver.findElement(By.id("lastName")).sendKeys("Institute");
		WebElement photoFile=driver.findElement(By.id("photofile"));

		JavascriptExecutor js=(JavascriptExecutor)driver;

		js.executeScript("arguments[0].click();", photoFile);

		Runtime.getRuntime().exec(System.getProperty("user.dir")+"\\Browsers\\FileUploadScript.exe");
		Thread.sleep(5000);
		driver.findElement(By.id("btnSave")).click();
	}

}
