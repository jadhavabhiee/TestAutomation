package MiniProject;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FlipKart_ECommerce {
	@Test
public void Search() throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.name("q")).sendKeys("One Plse MObile");
	driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
	driver.findElement(By.xpath("(//div[text()='OnePlus Nord CE 3 Lite 5G (Pastel Lime, 128 GB)'])[1]")).click();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.xpath("(//li[@class='col col-6-12'])[1]")).click();
	
}
	
	
	
	

}
