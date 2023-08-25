package com.selenium.project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DayFiveTaskExplicit {

	public static void main(String[] args) {
		//browser driver setup
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gtambe\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		
		//browser setup
		co.setBinary("C:\\Users\\gtambe\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		
		//Chrome driver object
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Maximazi the Screen
		 driver.manage().window().maximize();
		 
		 
		 //Object of Explicit wait
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		 
		 //UserName
		 WebElement userName = wait.until(ExpectedConditions.elementToBeClickable(By.name("username")));
	     userName.click();
		 userName.sendKeys("Admin",Keys.ENTER);
	     
	     //Password
	     WebElement password = wait.until(ExpectedConditions.elementToBeClickable(By.name("password")));
	     password.sendKeys("admin123");
	     
	     
	     //Login
	     WebElement login = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")));
	     login.click();
	     
	     //Click Admin
	     WebElement admin=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")));
	     admin.click();
	     
		 //Search System user base on UserName:Admin
		 WebElement SysUserName = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")));
	     SysUserName.click();
		 SysUserName.sendKeys("Admin");
		 
	     //Search
		 WebElement search=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")));
		 search.click();
		 
		 
		 driver.close();
	     

	}

}
