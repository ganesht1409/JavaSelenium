package com.selenium.project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DayFiveTask {
	private static String URL="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

	public static void main(String[] args) {

		//browser driver setup
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\gtambe\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				ChromeOptions co=new ChromeOptions();
				
				//browser setup
				co.setBinary("C:\\Users\\gtambe\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
				
				//Chrome driver object
				WebDriver driver=new ChromeDriver(co);
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				
				//Maximazi the Screen
				 driver.manage().window().maximize();
				 
				 //Implicite Wait
				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				 
				 //UserName
				 WebElement userName = driver.findElement(By.name("username"));
			     userName.click();
				 userName.sendKeys("Admin",Keys.ENTER);
			     
			     //Password
			     WebElement password = driver.findElement(By.name("password"));
			     password.sendKeys("admin123");
			     
			     
			     //Login
			     WebElement login = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
			     login.click();
			     
			     //Click Profile
			     WebElement profile=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/img"));
			     profile.click();
			     
			     //click logout
			     WebElement logout=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a"));
			     logout.click();
			     
			     
			     //Verify the user return the login page or not
			     if(URL.equals(driver.getCurrentUrl()))
			     {
			    	 System.out.println("This is Login Page");
			     }
			     else
			     {
			    	 System.out.println("This is not login page");
			     }
			     
			     

	}

}
