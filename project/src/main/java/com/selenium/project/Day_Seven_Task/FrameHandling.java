package com.selenium.project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		//creating Driver Object
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		
		//Maximizing Window
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	    
	    //Switching the Frame
	    WebElement iframe=driver.findElement(By.id("frame1"));
	    driver.switchTo().frame(iframe);
	    
	    
	    //Getting back to the main frame
	    //driver.switchTo().defaultContent();
	    
	    
	    //Geting Text from current frame
	    Actions a=new Actions(driver);
	    WebElement heading=driver.findElement(By.id("sampleHeading"));
	    
//	    JavascriptExecutor jss = (JavascriptExecutor)driver;
//        jss.executeScript("window.scrollBy(0,70)", "");
        
        a.moveToElement(heading).perform();
	    a.doubleClick(heading).perform();
	    
	    String element=heading.getText();
	    System.out.println(">>>"+element);
		

	}

}
