package com.selenium.project;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;

 

public class FliteBooking {

    public static void main(String[] args) throws InterruptedException {

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
        

        // Close the pop-up
        driver.findElement(By.tagName("body")).sendKeys(Keys.ESCAPE);

        

        // Select "Flights"
        WebElement selectflight = driver.findElement(By.xpath("//*[@id=\"flights\"]/div/span"));
        selectflight.click();

        

        // Check if the one-way radio button is selected or not

        WebElement onewaybox = driver.findElement(By.xpath("//*[@id=\"basiclayout\"]/div/div[1]/div/div/div/div/div[2]/div[1]/div/fieldset/div/div[2]/label/span[2]"));

        boolean isSelected = onewaybox.isSelected();

        if (isSelected) {

            System.out.println("Onewaybox is Selected.");

        } else {

            System.out.println("Onewaybox is not Selected.");

        }
        onewaybox.click();

        

        // Click on the "From" search bar
        WebElement from = driver.findElement(By.xpath("//*[@id=\"basiclayout\"]/div/div[1]/div/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/button[1]"));
        from.click();

        

        // Remove the current airport selection
        WebElement removeCurrentAirport = driver.findElement(By.xpath("//*[@id=\":Rhdl3b5:\"]/div/div/div/div/div/div/div[1]/div/div/div/div/span"));
        removeCurrentAirport.click();

        

        // Search for airport "Bangalore"
        WebElement searchInput = driver.findElement(By.xpath("//*[@id=\":Rhdl3b5:\"]/div/div/div/div/div/div/div/div/div/div/div/input"));
        searchInput.sendKeys("BLR Kempegowda International Airport");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"listbox\"]/li")).click();

        

        // Search for destination airport "New York"
        WebElement searchInput2 = driver.findElement(By.xpath("//*[@id=\"basiclayout\"]/div/div[1]/div/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/button[3]"));
        searchInput2.click();

        

        // Search for destination airport "New York"
        WebElement searchInput3 = driver.findElement(By.xpath("//*[@id=\":Rjdl3b5:\"]/div/div/div/div/div/div/div[1]/div/div/div/div/input"));
        searchInput3.sendKeys("New York");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"listbox\"]/li[2]")).click();

        

        // Search button click
        WebElement select3 = driver.findElement(By.xpath("//*[@id=\"basiclayout\"]/div/div[1]/div/div/div/div/div[2]/div[2]/div/div/button"));
        select3.click();
        Thread.sleep(5000);

        

        // Select Emirates flight
        WebElement select4 = driver.findElement(By.xpath("//*[@id=\"flight-card-2\"]/div/div/div[2]/div[2]/button"));
        String selectedFlightName = select4.getText();
        select4.click();
        Thread.sleep(5000);

        

        // Select flight again
        WebElement select5 = driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div[2]/div[3]/div[2]/button"));
        select5.click();
        Thread.sleep(2000);

        // Click on next
        WebElement select6 = driver.findElement(By.xpath("//*[@id=\"basiclayout\"]/div/div[2]/div/div[2]/div[2]/div/div/div[2]/button"));
        select6.click();
        Thread.sleep(10000);

        // Close the browser
        driver.quit();
    }
}

 


