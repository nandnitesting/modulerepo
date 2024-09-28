package com.ValidatingAnApplication;

import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M RAMA CHENNAREDDY\\Desktop\\10-30 Batch\\CoreJava\\Browsers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();

		String Expected_Title="HRM";
		System.out.println(Expected_Title);

		String Actual_Title=driver.getTitle();
		System.out.println(Actual_Title);
		
//		if(Actual_Title.equals(Expected_Title))
//		{
//			System.out.println("True");
//		}
//		else
//		{
//			System.out.println("False");
//		}

//		if(Actual_Title.equals(Expected_Title))
//		{
//			System.out.println("True");
//		}
//		else
//		{
//			System.out.println("False");
//		}
		
		if(Actual_Title.contains(Expected_Title))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}

	}

}
