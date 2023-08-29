package com.selenium.project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseEvents {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		  WebDriverManager.chromedriver().setup();
		  
	        //creating driver object for web driver class (driver is mapped with edge browser)
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.browserstack.com/");
	        
	        //maximize the window size
	        driver.manage().window().maximize();
	        
	      
	        
	        //Implicite wait
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	        
	        
	        //creating object of action class
	        Actions a=new Actions(driver);
	        WebElement hoverElement = driver.findElement(By.xpath("//*[@id=\"post-26\"]/section/div[1]/div/div/div/article[1]/div/div/div/div[1]/h1"));
            a.doubleClick(hoverElement).perform();
	        
	       

	}

}
