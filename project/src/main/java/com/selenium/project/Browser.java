package com.selenium.project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browser {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//browser driver setup
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gtambe\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		
		//browser setup
		co.setBinary("C:\\Users\\gtambe\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		
		//Chrome driver object
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.google.com/");
		
		
		
		//search "google" in serach box
		//driver.findElement(By.name("q")).sendKeys("Google",Keys.ENTER);
		 
		
//		  driver.switchTo().newWindow(WindowType.TAB);
//        driver.get("https://www.google.com");
//        driver.findElement(By.className("gLFyf")).sendKeys("bing",Keys.ENTER);
//
//        
//
//        driver.switchTo().newWindow(WindowType.TAB);
//        driver.get("https://www.google.com");
//        driver.findElement(By.className("gLFyf")).sendKeys("firefox",Keys.ENTER);
//		 
		
		

//		WebElement searchbox=driver.findElement(By.name("q"));
//		searchbox.sendKeys("Google");
//		Thread.sleep(100);
//		searchbox.clear();
		
		

//		WebElement gmailbtn=driver.findElement(By.partialLinkText("Gmail"));
//		boolean isgmailenable= gmailbtn.isEnabled();
//		System.out.println(isgmailenable);
		
		//Locators

		WebElement searchbox=driver.findElement(By.id("//textarea[starts-with(@id,\"A\")]//parent::div"));
		String valueofsearchbox=searchbox.getAttribute("class");
		System.out.println(valueofsearchbox);
		
		//WebElement searcmobile=driver.findElements(By.className(""));
//		WebElement gmail=driver.findElement(By.linkText("Gmail"));
//        gmail.click();

//        WebElement gmail1=driver.findElement(By.partialLinkText("Gma"));
//        gmail1.click();
		

		
		//Click google search
		//driver.findElement(By.className("gLFyf")).submit();
		
		
		Thread.sleep(1000);
		driver.quit();
	}

}
