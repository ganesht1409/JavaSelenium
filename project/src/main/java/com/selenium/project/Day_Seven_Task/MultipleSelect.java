package com.selenium.project;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		//creating object of ChromeDriver browser
		WebDriver driver=new ChromeDriver();
		
		
		//opening the browser
		driver.get("https://demo.opencart.com/index.php?route=product/category&language=en-gb&path=24&sort=p.sort_order&order=ASC");
		
		//maximaizing the window
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		

        Select s = new Select(driver.findElement(By.xpath("//*[@id=\"input-sort\"]")));

        List<WebElement> li =s.getOptions();
        List<String> str=new ArrayList();
        for(WebElement l:li)
        {
            str.add(l.getText());
        }
        
        s.selectByVisibleText("Rating (Highest)");
        //s.deselectAll();
        Collections.sort(str);
        for (String st : str) 
        {
            System.out.println(st);
        }
	}

}
