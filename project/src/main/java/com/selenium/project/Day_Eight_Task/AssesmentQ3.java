package com.selenium.project;
import java.time.Duration;

import java.util.ArrayList;

 

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

 

import io.github.bonigarcia.wdm.WebDriverManager;

 

public class AssesmentQ3 {

 

    public static void main(String[] args) throws InterruptedException {

        // TODO Auto-generated method stub

        WebDriverManager.chromedriver().setup();

        //create instance of the chromedriver
        WebDriver driver = new ChromeDriver();

        //open url
        driver.get("https://www.naukri.com/");

        //maximize the window
        driver.manage().window().maximize();

        //implicitly wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

        String s = driver.getWindowHandle();

        

        //Clicking on Software & IT
        JavascriptExecutor jss = (JavascriptExecutor)driver;
        jss.executeScript("window.scrollBy(0,300)", "");
        driver.findElement(By.xpath("//*[contains(text(),'& IT')]")).click();

        //switch the control to child window
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

  

        Actions action = new Actions(driver);   
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

        

        //Apply the filter 
        WebElement element = driver.findElement(By.xpath("//*[text()='Engineering - Hardware & Networks']"));
        action.moveToElement(element).click().perform();
        Thread.sleep(3000);
        
        WebElement first = driver.findElement(By.xpath("//*[(text()='Mobile Developer (IBM Mobile First Platform)')]"));
        action.moveToElement(first).click().perform();
        tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(2));
        Thread.sleep(3000);

        

        //Switch back control
        driver.switchTo().window(s);
        Thread.sleep(8000);
        driver.quit();

        

        

    }

 

}