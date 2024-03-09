package HashMap;

import java.time.Duration;

import org.apache.commons.collections4.map.HashedMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class H1 {

	public static void main(String[] args) {

		HashedMap<String, String> ref= new HashedMap<String, String>();
		// to add data in hashmap we use put method
		ref.put("url", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		ref.put("username", "Admin");
		ref.put("password", "admin123");
		//open browser
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String url = ref.get("url");
		driver.get(url);
		// enter username
		String un =ref.get("username");
		driver.findElement(By.name("username")).sendKeys(un);
		//enter password
		String pass=ref.get("password");
		driver.findElement(By.name("password")).sendKeys(pass);
		//click on button
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		
		

	}

}
