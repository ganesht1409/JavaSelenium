package com.selenium.project;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		
		//Chrome driver object
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.com/");
		
		//maximize window size
		driver.manage().window().maximize();
		
		//
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://omayo.blogspot.com/");
//		String handleid=driver.getWindowHandle();
//		System.out.println(handleid);
		
	     Set<String> handels=driver.getWindowHandles();
		for(String h:handels)
		{
			System.out.println(driver.switchTo().window(h));
			System.out.println(driver.getTitle());
		}
		
		
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		driver.navigate().refresh();
		
		//browser Command
		String title=driver.getTitle();
		System.out.println("Title:"+title);
		
		String CurrentUrl=driver.getCurrentUrl();
		System.out.println("Current URL:"+CurrentUrl);
		
		String pageSource=driver.getPageSource();
		System.out.println("PageSource:"+pageSource);
		System.out.println("Length:"+pageSource.length());
		
	 
		
		driver.quit();
		driver.close();
		
	
	}

}
