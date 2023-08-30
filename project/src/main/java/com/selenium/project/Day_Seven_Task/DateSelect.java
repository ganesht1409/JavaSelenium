package com.selenium.project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DateSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		//Creating Object of chrommeDriver
		WebDriver driver=new ChromeDriver();
		
		//opening the URL
		driver.get("https://www.abhibus.com/bus-ticket-booking");
		
		//maximizing the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		//Enter Source Location
		WebElement sourceElement=driver.findElement(By.id("source"));
		sourceElement.sendKeys("Banglore");
		
		//Enter the Destination Location
		WebElement destiElement=driver.findElement(By.id("destination"));
		destiElement.sendKeys("Pune");
		
		
		//Select Date
		WebElement datepick=driver.findElement(By.xpath("//*[@id=\"datepicker1\"]"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','04/10/2023')",datepick);
		
		//Enter the search button
		WebElement serachButton=driver.findElement(By.id("seo_search_btn"));
		destiElement.click();

	}

}
