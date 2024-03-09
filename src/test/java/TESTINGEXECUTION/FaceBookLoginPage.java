package TESTINGEXECUTION;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FaceBookLoginPage {
	private WebElement emailfield;
	private WebElement passwordfield;
	private WebElement loginbutton;
	private WebElement forgotfield;
	private WebElement createNewAccount;
	
	public FaceBookLoginPage(WebDriver driver) {
		emailfield = driver.findElement(By.id("email"));
		passwordfield = driver.findElement(By.name("email"));
		forgotfield= driver.findElement(By.linkText("Forgotten password?"));
		loginbutton = driver.findElement(By.name("login"));
		createNewAccount =driver.findElement(By.linkText("Forgotten password?"));
		
	}
	public void setLogin(String user,String pwd) {
		emailfield.sendKeys(user);
		passwordfield.sendKeys(pwd);
	}
	public void clickonLoginbutton() {
		loginbutton.click();
	}
	public void clickonforgotpassword() {
		forgotfield.click();
	}
	public void clickoncreateAccount() {
		createNewAccount.click();
	}

}
