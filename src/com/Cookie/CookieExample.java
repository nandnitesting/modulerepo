package com.Cookie;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookieExample {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Set<Cookie> cookies=driver.manage().getCookies();
		System.out.println(cookies.size());
		//		int cookieSize=cookies.size();
		//		System.out.println(cookieSize);

		//		for(Cookie cookie:cookies)
		//		{
		//			System.out.println(cookie.getName()+"  "+cookie.getValue());
		//		}

		//System.out.println(driver.manage().getCookieNamed("session-id-time"));

		Cookie obj=new Cookie("MyCookie12","1234567");
		driver.manage().addCookie(obj);
		cookies=driver.manage().getCookies();
		System.out.println(cookies.size());
		for(Cookie cookie:cookies)
		{
			System.out.println(cookie.getName()+"  "+cookie.getValue());
		}

		driver.manage().deleteCookie(obj);
		cookies=driver.manage().getCookies();
		System.out.println(cookies.size());
		for(Cookie cookie:cookies)
		{
			System.out.println(cookie.getName()+"  "+cookie.getValue());
		}
		driver.manage().deleteAllCookies();
		cookies=driver.manage().getCookies();
		System.out.println(cookies.size());

	}

}
