package Data_Driven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import graphql.schema.idl.errors.DirectiveUnknownArgumentError;

public class OrangeHrm {
	public static void main(String[] args) throws IOException {
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
		// enter username
		String username = p.getProperty("un");
		driver.findElement(By.name("username")).sendKeys(username);
		//enter password
		String password =p.getProperty("pwd");
		driver.findElement(By.name("password")).sendKeys(password);
		// click on login button
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		// verify login page
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		System.out.println("Home Page is Dispalyed");
		
		
	}
}
