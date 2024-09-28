package com.Abstraction;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://imgur.com/upload");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//label[contains(text(),'Choose Photo/Video')]/img")).click();
		
		Thread.sleep(3000);
		
		Robot rb=new Robot();
		
		String filePath="D:\\LiveTech\\Testing Tools\\Screenshot.png";
		
		 StringSelection strSelection = new StringSelection(filePath);
		
		         Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		
		         clipboard.setContents(strSelection, null);
		         
		         rb.keyPress(KeyEvent.VK_CONTROL);
		         rb.keyPress(KeyEvent.VK_V);
		         rb.keyRelease(KeyEvent.VK_V);
		         rb.keyRelease(KeyEvent.VK_CONTROL);
		         
		         
		         rb.keyPress(KeyEvent.VK_ENTER);
		         rb.keyRelease(KeyEvent.VK_ENTER);
		         
		         Thread.sleep(3000);
		         
		         
		         
		
	}

}
