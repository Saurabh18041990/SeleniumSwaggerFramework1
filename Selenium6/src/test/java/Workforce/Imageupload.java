package Workforce;

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
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class Imageupload extends Base{
	@Test
	//3
    public void Login() throws InterruptedException
    {
	
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
       
        WebElement Sign1= driver.findElement(By.xpath("//*[@id='operations-pet-uploadFile']"));
        Sign1.click();
        
        
        Thread.sleep(2000);
        
        
        WebElement User2 =driver.findElement(By.xpath("//*[@class='try-out']"));
        User2.click();
        
        Thread.sleep(2000);

        { JavascriptExecutor jse = (JavascriptExecutor) driver;
	      jse.executeScript("window.scrollBy(0,200)"); }
        
        
        WebElement Pwd2 =driver.findElement(By.xpath("//*[@placeholder='petId - ID of pet to update']"));
        Pwd2.click();
        Pwd2.clear();
        Pwd2.sendKeys("11");
        Thread.sleep(2000);

        { JavascriptExecutor jse = (JavascriptExecutor) driver;
	      jse.executeScript("window.scrollBy(0,250)"); }
        
        Thread.sleep(2000);

        
        Thread.sleep(2000);
        
        WebElement El = driver.findElement(By.xpath("//*[@class='parameters']//td[@class='parameters-col_description']//input[@type='file']"));
        ((RemoteWebElement) El ).setFileDetector(new LocalFileDetector());
        Thread.sleep(2000);

        El.sendKeys("C:\\Users\\Saurabh Gupta\\eclipse-workspace\\Selenium6\\src\\test\\resources\\resources\\chihuahua-2-years-old-standing-15359888.jpg");
        Thread.sleep(2000);

		driver.findElement(By.xpath("(//*[text()='Execute'])[3]")).click();


        System.out.println("Image uploaded sucessfully");


        
       
   }}
