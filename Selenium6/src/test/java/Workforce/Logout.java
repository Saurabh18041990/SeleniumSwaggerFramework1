package Workforce;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Logout extends Base {

	@SuppressWarnings("unlikely-arg-type")
	@Test
	//5
	public void Logout() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(2000);
		{
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,1200)");
		}
		
		
		driver.findElement(By.xpath("//*[@id='operations-user-logoutUser']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//*[@class='try-out'])[4]")).click();
		{
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,100)");
		}
		driver.findElement(By.xpath("(//*[text()='Execute'])[4]")).click();
		Thread.sleep(2000);

		
		
	}
	}