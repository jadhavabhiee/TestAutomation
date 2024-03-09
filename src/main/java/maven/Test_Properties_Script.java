package maven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test_Properties_Script {

	public static void main(String[] args) throws IOException {
		//copy File from Rom to Ram
		FileInputStream file = new FileInputStream("../maven/Sample.property");
		Properties p = new Properties();
		p.load(file);
		// Read Data 
		String url = p.getProperty("url");
		//open Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// open url
		driver.get(url);
		// Enter Username
		String username=p.getProperty("un");
		driver.findElement(By.name("username")).sendKeys(username);
		//Enter password 
		String pass= p.getProperty("pwd");
		driver.findElement(By.name("password")).sendKeys(pass);
		//clickOnLoginButton
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		System.out.println("Home Page Is Dispalay===============");

	}

}
