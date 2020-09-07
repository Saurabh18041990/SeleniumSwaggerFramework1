package Workforce;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Deletedog extends Base {
	@Test

	// 7
	public void Login() throws InterruptedException, IOException {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		{
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,-1000)");
		}

		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id='operations-pet-deletePet']")).click();

		driver.findElement(By.xpath("(//*[@class='try-out'])[4]")).click();

		{
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,200)");
		}

		Thread.sleep(2000);

		WebElement Delete = driver.findElement(By.xpath("//*[@placeholder='petId - Pet id to delete']"));

		Delete.click();
		Delete.clear();

		Delete.sendKeys("11");
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//*[text()='Execute'])[4]")).click();
		Thread.sleep(2000);
		{
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,100)");
		}
		WebElement F = driver.findElement(By.xpath("(//*[@class=' microlight']/code)[3]"));
		Thread.sleep(2000);

		System.out.println(F.getText());

	}
}