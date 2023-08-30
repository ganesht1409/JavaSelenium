package com.selenium.project;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSelectOption {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		//creating webdriver object
		WebDriver driver=new ChromeDriver();
		
		//opening the URL
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		
		//maximizing the window
		driver.manage().window().maximize();
		
		
		
		//creating object of select class
		Select options=new Select(driver.findElement(By.xpath("//select[@name='selenium_commands']")));
		
		options.selectByIndex(2);
		Thread.sleep(2000);
		options.selectByIndex(3);
		Thread.sleep(2000);
		
		List<WebElement> li=new ArrayList();
		li=options.getAllSelectedOptions();
		
		for(WebElement s:li)
		{
			System.out.println(s.getText());
		}

	}

}
