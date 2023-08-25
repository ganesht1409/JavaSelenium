package com.selenium.project;



import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NewEdgeBrowser {
	static String URL = "https://www.flipkart.com/";

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//browser driver setup
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\gtambe\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	   ChromeOptions co=new ChromeOptions();
				
		//browser setup
		co.setBinary("C:\\Users\\gtambe\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		//Chrome driver object
		WebDriver driver=new ChromeDriver(co);
		WebDriver driver1=new ChromeDriver(co);
		
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
//        driver1.get("https://www.flipkart.com/");
//        driver1.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.tagName("body")).sendKeys(Keys.ESCAPE);
        
        driver.findElement(By.name("q")).sendKeys("Mobile",Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        WebElement samsung=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div/div[1]/div/section[3]/div[2]/div[1]/div[2]/div/label/div[2]"));
        samsung.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        List<WebElement> data=driver.findElements(By.className("_4rR01T"));
        for(WebElement webElement: data)
        {
        	System.out.println(webElement.getText());
        }
        
        //scroll the page
        JavascriptExecutor jsExecutor=(JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollBy(0,10000)", "");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        jsExecutor.executeScript("window.scrollBy(0,-10000)", "");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//        String title = driver.getTitle();
//        int Title_Length = title.length();
//        String Url_get = driver.getCurrentUrl();
//
//        System.out.println("Title :"+title);
//        System.out.println("Title Length :" +Title_Length);
//
//        if(URL.equals(Url_get)) {
//            System.out.println(Url_get);
//        }
//
//        String source = driver.getPageSource();
//        int Length_source = source.length();
//
//        System.out.println(Length_source);
//        
        
        

        driver.quit();
	}

}
