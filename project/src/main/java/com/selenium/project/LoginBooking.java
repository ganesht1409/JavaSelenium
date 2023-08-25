package com.selenium.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class LoginBooking {
    public static void main(String[] args) throws InterruptedException {
        // Set the Microsoft Edge WebDriver executable path
        //System.setProperty("webdriver.edge.driver", "path/to/your/msedgedriver.exe");

        // Initialize the WebDriver
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        // Open Booking.com
        driver.get("https://www.booking.com");

        // Check if the sign-in or register popup appears
        driver.manage().window().maximize();       

        //close pop

        driver.findElement(By.tagName("body")).sendKeys(Keys.ESCAPE);

        

        //select flights

        WebElement selectflight = driver.findElement(By.xpath("//*[@id=\"b2indexPage\"]/div[2]/div/header/nav[1]/div[2]/span/a"));

        selectflight.click();
//        selectsignin.click(); 
        
        WebElement signin = driver.findElement(By.xpath("//*[@id=\"b2helpPage\"]/header/nav/div[2]/div[6]/a"));

        signin.click();
        
        WebElement emailsearchbox = driver.findElement(By.xpath("//*[@id=\"username\"]"));
        emailsearchbox.sendKeys("aditya.ghorpade64@gmail.com"); // Replace with the actual password
        
        WebElement emailsubmit = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div/div/div/div/div/div/form/div[3]/button"));
        emailsubmit.click();
       ////*[@id="new_password"]
  /* -----------------------------------------  password -------------------------------------    */      
        
        
        
        
        
        WebElement password = driver.findElement(By.xpath("//*[@id=\"username\"]"));
        password.sendKeys("aditya@123");
        
        WebElement conformpassword = driver.findElement(By.xpath("//*[@id=\"confirmed_password\"]"));
        conformpassword.sendKeys("aditya@1847");
        
        WebElement clickpass = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div/div/div/div/div/div/form/button"));
        clickpass.click();
    }
}////*[@id="username"]
