package com.selenium.project;


import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssesmentQ2 {

    public static void main(String[] args) throws InterruptedException {

        // TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
        
        //creating instance of the Chromedriver
        WebDriver driver = new ChromeDriver();
        
        //Opening the url
        driver.get("https://demo.smart-hospital.in/site/login");
        
        //Maximizing the Window Size
        driver.manage().window().maximize();
        
        //Implicitly Wait
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

        //Click on The pathologist
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/div[2]/a[2]")).click();
       
        //click on sign in
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/form/button")).click();
        
        //click on messaging
        driver.findElement(By.xpath("//*[@id=\"sibe-box\"]/ul[2]/li[8]/a")).click();
        
        //click on post new message
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div[1]/div/a[1]")).click();
        
        //Eneter the title
        driver.findElement(By.xpath("//input[@id='title']")).sendKeys("ABC");
        
        //Setting the value of another frame element
         WebElement webelement =  driver.findElement(By.xpath("/html/body"));
         Actions action = new Actions(driver);   
         action.moveToElement(webelement).click().perform();
         action.sendKeys("Entering data").perform();
         

        
        //Setting the Date
        WebElement datepicker1 = driver.findElement(By.xpath("//input[@id=\"date\"]"));
        datepicker1.sendKeys("05/03/2023");
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].setAttribute('value','05/03/2022')", datepicker1);
        WebElement datepicker2 = driver.findElement(By.xpath("//*[@id=\"publish_date\"]"));
        datepicker2.sendKeys("09/22/2022");
//        js.executeScript("arguments[0].setAttribute('value','09/22/2022')", datepicker2);

        

        //click on send
        driver.findElement(By.xpath("//*[@id=\"form1\"]/div/div[3]/div/button")).click();
        
        //Getting the msg from alert
        WebElement successfull_msg = driver.findElement(By.xpath("//*[@id=\"form1\"]/div/div[2]/div/div[1]"));
        String msg = successfull_msg.getText();
        System.out.println(msg);



    }
}

