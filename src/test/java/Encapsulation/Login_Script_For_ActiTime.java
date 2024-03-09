package Encapsulation;

import javax.management.loading.PrivateClassLoader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Login_Script_For_ActiTime {
	private WebElement Username;
	private WebElement Password;
	private WebElement LoginButton;
	
	public Login_Script_For_ActiTime(WebDriver driver) {
		Username = driver.findElement(By.id("username"));
		Password = driver.findElement(By.name("pwd"));
		LoginButton= driver.findElement(By.id("loginButton"));
	}
		public void setLogin(String un,String pwd) {
			Username.sendKeys(un);
			Password.sendKeys(pwd);
		}
		public void clickOnLogin() {
			LoginButton.click();
		}
}
 	
