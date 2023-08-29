package com.selenium.project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeLocatorsRL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		     WebDriverManager.chromedriver().setup();
		  
	        //creating driver object for web driver class (driver is mapped with edge browser)
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.softwaretestingmaterial.com/");
	        
	        //left click
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        WebElement btn = driver.findElement(By.xpath("//*[@id=\"kt-layout-id_ce6aeb-d9\"]/div/div[2]/div/figure/a/img"));
	        WebElement leftof = driver.findElement(RelativeLocator.with(By.tagName("img")).toLeftOf(btn));
	        leftof.click();
	        
	        //right click
	        WebElement rightof = driver.findElement(RelativeLocator.with(By.tagName("img")).toRightOf(btn));
	        rightof.click();
	        
	        //near will take nearest element in the range of 50px
	        WebElement near = driver.findElement(RelativeLocator.with(By.tagName("img")).near(btn));
	        near.click();
	}

}
