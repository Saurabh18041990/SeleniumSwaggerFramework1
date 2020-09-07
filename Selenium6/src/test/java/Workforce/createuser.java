package Workforce;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;


//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class createuser extends Base{
	@Test
	
	//1
    public void createuser() throws InterruptedException, UnsupportedFlavorException, IOException
    {
	
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	
	{
		WebElement Position = driver.findElement(By.xpath("//*[@id='operations-user-createUser']"));
		Point point = Position.getLocation();
		System.out.println("Element's Position from left side is: " + point.getX() + " pixels.");
		System.out.println("Element's Position from top is: " + point.getY() + " pixels.");
	}


  { JavascriptExecutor jse = (JavascriptExecutor) driver;
  jse.executeScript("window.scrollBy(0,1400)"); }
  
  
  Thread.sleep(2000);
  
  	
      WebElement Createuser= driver.findElement(By.xpath("//*[@id='operations-user-createUser']"));
      Createuser.click();
      

      driver.findElement(By.xpath("//*[@class='try-out']")).click();
      Thread.sleep(2000);

      WebElement user1= driver.findElement(By.xpath("//*[@class='body-param__text']"));
      user1.click();
      user1.clear();
      user1.sendKeys("{\r\n" + 
      		"  \"id\": 2,\r\n" + 
      		"  \"username\": \"Saurabh@004\",\r\n" + 
      		"  \"firstName\": \"Saurabh\",\r\n" + 
      		"  \"lastName\": \"Goel\",\r\n" + 
      		"  \"email\": \"saurabh@gmail.com\",\r\n" + 
      		"  \"password\": \"1234\",\r\n" + 
      		"  \"phone\": \"9999999999\",\r\n" + 
      		"  \"userStatus\": 1\r\n" + 
      		"}");
      
      Thread.sleep(2000);

      { JavascriptExecutor jse = (JavascriptExecutor) driver;
      jse.executeScript("window.scrollBy(0,1700)"); }
      
      driver.findElement(By.xpath("//*[@class='btn execute opblock-control__btn']")).click();
      
      { JavascriptExecutor jse = (JavascriptExecutor) driver;
      jse.executeScript("window.scrollBy(0,200)"); }
      
      Thread.sleep(2000);
      
      { JavascriptExecutor jse = (JavascriptExecutor) driver;
      jse.executeScript("window.scrollBy(0,-1000)"); }
      
      Thread.sleep(2000);

      WebElement Createuser1= driver.findElement(By.xpath("//*[@id='operations-user-createUser']"));
      Createuser1.click();
      
    WebElement D =  driver.findElement(By.xpath("//*[@class='highlight-code']/div[2]"));
   D.click();
     	  
      WebElement E=  driver.findElement(By.xpath("//*[@class=' microlight']/code"));
      Thread.sleep(2000);

           

    	System.out.println(E.getText());
    	
//    	if(E.getText().equals("{ \"code\": 200,"))
//    	{
//    		System.out.println("Login is confirmed");
//    	}
//    	else {
//    		System.out.println("Login is not confirmed");
//    	}


    }
}