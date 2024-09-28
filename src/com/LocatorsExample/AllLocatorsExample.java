package com.LocatorsExample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Utility.Logs;

public class AllLocatorsExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M RAMA CHENNAREDDY\\Desktop\\10-30 Batch\\CoreJava\\Browsers\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
		
        //Id
       //1st Method
        //<input name="txtUsername" id="txtUsername" type="text">
       
       //driver.findElement(By.id("txtUsername")).sendKeys("LiveTech");
        
        //OR
        //2nd Method 
//     WebElement userName= driver.findElement(By.id("txtUsername"));
//     userName.sendKeys("Institute");
     
     //OR
      //3rd Method  
//    String userName=  "Testing";
//    By userNameProperty= By.id("txtUsername");
//    WebElement user= driver.findElement(userNameProperty);
//    user.sendKeys(userName);
    
    
      
    //Name
    
    driver.findElement(By.name("txtUsername")).sendKeys("JOSHI");
    
    //Class Name
    //<input type="submit" name="Submit" class="button" 
    //id="btnLogin" value="LOGIN">
    driver.findElement(By.id("txtPassword")).sendKeys("Nandu@7899");
    
    driver.findElement(By.className("button")).click();
   // LinkText
    driver.findElement(By.linkText("Welcome Admin")).click();
	//Partial LinkText
	driver.findElement(By.partialLinkText("Admin")).click();
	//System.out.println("Testing");
	Logs.info("testing");

	}
}
