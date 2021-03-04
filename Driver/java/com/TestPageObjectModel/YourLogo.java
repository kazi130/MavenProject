package com.TestPageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class YourLogo {
	HomePage hp;
	ProductView pv;
	CheckOutPage co;


	
	@BeforeClass
	public void setup() throws InterruptedException {
		
	 System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		hp=new HomePage(driver);
		pv=new ProductView(driver);
		co=new CheckOutPage(driver);
		driver.manage().window().maximize();
	    Thread.sleep(3000);
	}
     
     @Test
     public void test1() throws InterruptedException {
    	 hp.url();
     }
     
     @Test
     public void test2() throws InterruptedException {
    	 pv.product();
     }
     
    @Test
     public void test3() throws InterruptedException {
    	 co.checkout();
     }
    	 
    	 
     }



