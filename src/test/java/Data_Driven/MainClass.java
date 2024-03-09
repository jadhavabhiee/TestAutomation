package Data_Driven;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MainClass {
	@Test
	public void Login() throws IOException {
		WebDriver driver = new ChromeDriver();
		UtlityMethod un = new UtlityMethod();
		driver.get(un.getDataFromExcel("Sheet3", 0, 0));
//		
	
	}
	
}

