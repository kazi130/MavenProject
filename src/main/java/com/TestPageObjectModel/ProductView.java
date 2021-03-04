package com.TestPageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductView {

	private WebDriver driver;

	public ProductView(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public void product() throws InterruptedException {
		
        driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[2]")).click();
        Thread.sleep(2000);
	
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']")));
        Thread.sleep(2000);
	
        driver.findElement(By.id("quantity_wanted")).clear();
        Thread.sleep(2000);
        
		driver.findElement(By.id("quantity_wanted")).sendKeys("4");
		Thread.sleep(2000);
		
		driver.findElement(By.id("add_to_cart")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent(); // switch to default frame
	}
	
	public void proceedtocart() throws InterruptedException {
//		driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
//		Thread.sleep(2000);
	}
	
	
	
	
	//driver.switchTo().defaultContent();

}
