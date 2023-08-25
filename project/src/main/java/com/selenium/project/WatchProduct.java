package com.selenium.project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WatchProduct {

	public static void main(String[] args) throws Exception {

		//browser driver setup
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\gtambe\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				ChromeOptions co=new ChromeOptions();
				
				//browser setup
				co.setBinary("C:\\Users\\gtambe\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
				
				//Chrome driver object
				WebDriver driver=new ChromeDriver(co);
				driver.get("https://www.booking.com/");
				
				//maximize window size
				driver.manage().window().maximize();
				// Open the Booking.com website

		        driver.get("https://www.booking.com");

		        //close pop
		        driver.findElement(By.tagName("body")).sendKeys(Keys.ESCAPE);


		        //select Stays Hotel
		        WebElement selectstays = driver.findElement(By.xpath("//*[@id=\"accommodations\"]"));
		        selectstays.click();
		        Thread.sleep(2000);
		        
		        driver.findElement(By.name("ss")).sendKeys("John F. Kennedy International Airport");
		        Thread.sleep(2000);
		        driver.findElement(By.name("ss")).click();
		        Thread.sleep(2000);
		        
		        driver.findElement(By.className("b91c144835")).click();
		        Thread.sleep(2000);
		        
		        driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[2]/table/tbody/tr[3]/td[6]/span")).click();
		        Thread.sleep(2000);
		        
		        driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[2]/table/tbody/tr[4]/td[1]/span")).click();
		        Thread.sleep(2000);
		        
		        driver.findElement(By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/form/div[1]/div[4]/button")).click();
		        Thread.sleep(2000);
		        
		        driver.findElement(By.xpath("//*[@id=\"search_results_table\"]/div[2]/div/div/div[3]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div/div[2]/a")).click();
		        Thread.sleep(2000);

		        
			 // driver.close();

	}

}
