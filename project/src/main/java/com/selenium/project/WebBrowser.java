package com.selenium.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebBrowser {

	public static void main(String[] args) {
		//browser driver setup
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\gtambe\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				ChromeOptions co=new ChromeOptions();
				
				//browser setup
				co.setBinary("C:\\Users\\gtambe\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
				
				//Chrome driver object
				WebDriver driver=new ChromeDriver(co);
				driver.get("https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html");
				
				// Locate the checkbox element using its ID (change this to the appropriate locator)
		        WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/input[1]"));

		        // Check if the checkbox is enabled or not
		        boolean isEnabled = checkbox.isEnabled();

		        // Print the result
		        if (isEnabled) 
		        {
		            System.out.println("Checkbox is enabled.");

		        } 
		        else 
		        {
		            System.out.println("Checkbox is disabled.");
		        }

		        // Check if the checkbox is selected or not
		        boolean isSelected = checkbox.isSelected();

		        if (isSelected)
		        {
		            System.out.println("Checkbox is Selected.");

		        } 
		        else 
		        {
		            System.out.println("Checkbox is not Selected.");
		        }
		        
		        
		     //Select the green, orange,purple
		      WebElement tick1 = driver.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/input[4]"));
		      tick1.click();
		      
		      WebElement tick2 = driver.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/input[5]"));
		      tick2.click();
		      
		      WebElement tick3 = driver.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/input[6]"));
		      tick3.click();

		      //check internet explorer selected or not
		      WebElement checkbox1 = driver.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/div/input[1]"));
		      boolean isSelected1 = checkbox1.isSelected();

		        if (isSelected1)
		        {
		            System.out.println("Internet Explorer is Selected.");

		        } 
		        else 
		        {
		            System.out.println("Internet Explorer is not Selected.");
		        }
		      //Check that "opera radio button "  is selected or not
		        WebElement Operacheckbox = driver.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/div/input[3]"));
		        boolean isSelected3 = Operacheckbox.isSelected();
		        if (isSelected3)
		        {
		            System.out.println("OperaRadioBox is Selected.");
		        } 
		        else
		        {
		            System.out.println("OperaRadioBox is not Selected.");
		        }
		        
		        //close the browser
		      //  driver.close();
		        
		        

	}

}
