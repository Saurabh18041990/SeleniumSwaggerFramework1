package Workforce;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;



public class Dogselection extends Base
{
	@Test
	
	//2
    public void Dogselection() throws InterruptedException{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		Thread.sleep(3000);
		
		 { JavascriptExecutor jse = (JavascriptExecutor) driver;
	      jse.executeScript("window.scrollBy(0,-1900)"); }
		 
		 
		 
		 driver.findElement(By.xpath("//*[@id='operations-pet-addPet']")).click();
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//*[@class='try-out']")).click();
		 
		 Thread.sleep(2000);
		 
		 
		 WebElement user2= driver.findElement(By.xpath("//*[@class='body-param__text']"));
	      user2.click();
	      user2.clear();
	      user2.sendKeys("{\r\n" + 
	      		"  \"id\": 11,\r\n" + 
	      		"  \"category\": {\r\n" + 
	      		"    \"id\": 11,\r\n" + 
	      		"    \"name\": \"ANIMAL\"\r\n" + 
	      		"  },\r\n" + 
	      		"  \"name\": \"chihuahua 2-year-old\",\r\n" + 
	      		"  \"photoUrls\": [\r\n" + 
	      		"    \"https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.dreamstime.com%2Fphotos-images%2Fchihuahua-2-years-old-standing.html&psig=AOvVaw3JT59r47y85QIMAuYI_Pe9&ust=1599233197095000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCLC1gYmmzesCFQAAAAAdAAAAABAD\"\r\n" + 
	      		"  ],\r\n" + 
	      		"  \"tags\": [\r\n" + 
	      		"    {\r\n" + 
	      		"      \"id\": 111,\r\n" + 
	      		"      \"name\": \"Tag2\"\r\n" + 
	      		"    }\r\n" + 
	      		"  ],\r\n" + 
	      		"  \"status\": \"available\"\r\n" + 
	      		"}");
	      
	      { JavascriptExecutor jse = (JavascriptExecutor) driver;
	      jse.executeScript("window.scrollBy(0,100)"); }
	    		  
	      driver.findElement(By.xpath("//*[@class='btn execute opblock-control__btn']")).click();
	      
	      Thread.sleep(2000);

	      
	      
	      WebElement F=  driver.findElement(By.xpath("(//*[@class=' microlight']/code)[1]"));
	      Thread.sleep(2000);
	    	System.out.println(F.getText());
		      Thread.sleep(2000);

		 
	      { JavascriptExecutor jse = (JavascriptExecutor) driver;
	      jse.executeScript("window.scrollBy(0,-1500)"); }

		driver.findElement(By.xpath("//*[@id='operations-pet-addPet']")).click();

}}