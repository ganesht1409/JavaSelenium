package com.selenium.project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  WebDriverManager.chromedriver().setup();
		  
	        //creating driver object for web driver class (driver is mapped with edge browser)
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://demoqa.com/droppable/");
	        
	        //maximize the window size
	        driver.manage().window().maximize();
	        
	      
	        
	        //Implicite wait
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	        
	        Actions a=new Actions(driver);
	        WebElement srcElement=driver.findElement(By.id("draggable"));
	        WebElement destElement=driver.findElement(By.id("droppable"));
	        
	        //Add scrolling command
	        JavascriptExecutor jss = (JavascriptExecutor)driver;
	        jss.executeScript("window.scrollBy(0,70)", "");
	        
	        //perform drag and drop operation
	        //a.clickAndHold(srcElement).release(destElement).build().perform();
	        a.dragAndDrop(srcElement, destElement).perform();

	}

}
