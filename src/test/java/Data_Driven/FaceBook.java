package Data_Driven;

import java.time.Duration;

import org.apache.commons.collections4.map.HashedMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {

	public static void main(String[] args) {
		HashedMap<String, String> ref=new HashedMap<String, String>();
		//Adding Data
		ref.put("url", "https://www.facebook.com/");
		ref.put("email", "jadhavabhi1098@gmail.com");
		ref.put("password", "Aniket@1098");
		
		// invoking Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String url=ref.get("url");
		driver.get(url);
		// enter usename
		String email=ref.get("email");
		driver.findElement(By.id("email")).sendKeys(email);
		//enter password
		String password=ref.get("password");
		driver.findElement(By.id("pass")).sendKeys(password);
		// click on login button
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='_9ay7']")).getText());

	}

}
