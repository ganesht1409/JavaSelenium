package com.selenium.project;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationWaits {

	public static void main(String[] args) {
		
		//browser driver setup
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gtambe\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		
		//browser setup
		co.setBinary("C:\\Users\\gtambe\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		
		//Chrome driver object
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://omayo.blogspot.com/");
		
		
		//Imlicit Wait
//		Long startTime=System.currentTimeMillis();
//        driver.get("https://omayo.blogspot.com/");
//        driver.manage().window().maximize();
//        driver.findElement(By.className("dropbtn")).click();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
//        long endTime=System.currentTimeMillis();
//        System.out.println(((endTime-startTime)/1000.0)+"Seconds...");
//        driver.findElement(By.linkText("Facebook")).click();
        
		
//		// Explicit wait
		Long startTime=System.currentTimeMillis();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
        WebElement webElement = driver.findElement(By.id("timerButton"));
        long endTime=System.currentTimeMillis();
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
        System.out.println(((endTime-startTime)/1000.0)+"Seconds...");
        
        //Fluient Wait
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
        driver.findElement(By.className("dropbtn")).click();
        Wait<WebDriver> fluentWait=new FluentWait<WebDriver>(driver)
        		.withTimeout(Duration.ofSeconds(10))
        		.pollingEvery(Duration.ofSeconds(2))
        		.ignoring(NoSuchElementException.class);
        WebElement too=fluentWait.until(new Function<WebDriver,WebElement>(){
        	public WebElement apply(WebDriver driver)
        	{
        		return driver.findElement(By.id("foo"));
        	}
        	
        });
        webElement.click();
		
//        driver.close();
		
	}

}
