package TESTINGEXECUTION;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateAccount extends Base_Script {
	@Test
	public void Create() {
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Abhishek");
		driver.findElement(By.name("lastname")).sendKeys("Jadhav");
		driver.findElement(By.name("reg_email__")).sendKeys("Admin125@gmail.com");
	}

}
