package com.selenium.project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyEvent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		  
	        //creating driver object for web driver class (driver is mapped with edge browser)
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.google.com/");
	        
	        //maximize the window size
	        driver.manage().window().maximize();
	        
	        //Implicite wait
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	        
	        Actions a=new Actions(driver);
	        
	       WebElement textArea=driver.findElement(By.id("APjFqb"));
	       a.keyDown(Keys.SHIFT);
	       a.sendKeys("hello").perform();
	       
	       //release  the shift key to up
	       a.keyUp(Keys.SHIFT);
	       
	       WebElement textArea1=driver.findElement(By.id("APjFqb"));
	       a.sendKeys("how are you?").perform();
	       

	}

}
