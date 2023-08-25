package com.selenium.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoQA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  WebDriverManager.edgedriver();
	        WebDriver driver = new EdgeDriver();
	        driver.get("https://www.google.com");
	        driver.manage().window().maximize();

	        driver.switchTo().newWindow(WindowType.TAB);
	        driver.quit();

	}

}
