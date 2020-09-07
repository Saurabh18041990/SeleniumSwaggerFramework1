package Workforce;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Newlist extends Base {
	@Test

	// 8
	public void Newlist() throws InterruptedException, IOException {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		{
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,-1000)");
		}

		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id='operations-pet-findPetsByStatus']")).click();

		driver.findElement(By.xpath("(//*[text()='Cancel'])[4]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//*[@class='try-out'])[3]")).click();
		{
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,100)");
		}

		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='available']")).click();
		

		driver.findElement(By.xpath("(//*[text()='Execute'])[3]")).click();
		Thread.sleep(3000);

		{
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,200)");
		}

		WebElement list = driver.findElement(By.xpath("(//*[@class=' microlight']/code)[2]"));
		Thread.sleep(3000);

		System.out.println(list.getText());
	}
}
