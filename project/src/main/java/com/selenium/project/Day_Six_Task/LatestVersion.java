package com.selenium.project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LatestVersion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		  WebDriverManager.chromedriver().setup();
		  
	        //creating driver object for web driver class (driver is mapped with edge browser)
	        WebDriver driver = new ChromeDriver();
			
	       
	        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	        driver.manage().window().maximize();
	        
	        //Object of Explicit wait
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
	        
	        By user =RelativeLocator.with(By.tagName("input")).below(By.className("oxd-input-group__label-wrapper"));
	        wait.until(ExpectedConditions.elementToBeClickable(user));
	        WebElement a= driver.findElement(user);
	        a.sendKeys("Admin");
	        
	        
	        By pass=RelativeLocator.with(By.name("password")).above(By.tagName("button"));
	        wait.until(ExpectedConditions.elementToBeClickable(pass));
	        WebElement element=driver.findElement(pass);
	        element.sendKeys("admin123");
	       
	        
	        By login=RelativeLocator.with(By.tagName("button")).below(By.name("password"));
	        wait.until(ExpectedConditions.elementToBeClickable(login));
	        WebElement clickButton=driver.findElement(login);
	        clickButton.click();
		

	     	

	}

}
