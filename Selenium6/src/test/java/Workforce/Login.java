package Workforce;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Login {
	public class createuser extends Base {
		@Test

		// 6
		public void Login() throws InterruptedException, IOException {

			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

			{
				JavascriptExecutor jse = (JavascriptExecutor) driver;
				jse.executeScript("window.scrollBy(0,200)");
			}

			Thread.sleep(2000);

			driver.findElement(By.xpath("//*[@id='operations-user-loginUser']")).click();

			driver.findElement(By.xpath("(//*[@class='try-out'])[4]")).click();
			{
				JavascriptExecutor jse = (JavascriptExecutor) driver;
				jse.executeScript("window.scrollBy(0,70)");
			}
			WebElement Username = driver
					.findElement(By.xpath("//*[@placeholder='username - The user name for login']"));

			Username.click();
			Username.clear();
			Username.sendKeys("Saurabh@004");
			{
				JavascriptExecutor jse = (JavascriptExecutor) driver;
				jse.executeScript("window.scrollBy(0,70)");
			}

			WebElement pwd = driver.findElement(By.xpath("//*[@placeholder='password - The password for login in clear text']"));

			pwd.click();
			pwd.clear();
			pwd.sendKeys("1234");
			
			driver.findElement(By.xpath("(//*[text()='Execute'])[4]")).click();
			

		}
	}
}
