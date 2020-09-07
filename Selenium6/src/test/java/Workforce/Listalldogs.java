package Workforce;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Listalldogs extends Base {

	@SuppressWarnings("unlikely-arg-type")
	@Test
	public void shopping() throws InterruptedException {
		// 4
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(2000);

		{
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,1500)");
		}

		driver.findElement(By.xpath("//*[@id='operations-pet-findPetsByStatus']")).click();
		Thread.sleep(2000);
		

		WebElement User3 = driver.findElement(By.xpath("(//*[@class='try-out'])[3]"));
		User3.click();
		Thread.sleep(2000);
		{
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,100)");
		}

		driver.findElement(By.xpath("//*[@value='available']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//*[text()='Execute'])[3]")).click();
		Thread.sleep(2000);

		{
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,400)");
		}

		WebElement FT = driver.findElement(By.xpath("(//*[@class=' microlight']/code)[2]"));
		Thread.sleep(2000);

		System.out.println(FT.getText());
		System.out.println("List of all dogs");

	}
}