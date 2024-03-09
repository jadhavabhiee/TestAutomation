package TESTINGEXECUTION;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FaceBookForgotPass  {

	private WebElement emailfiel;
	private WebElement cancelbutton;
	private WebElement searchfield;
	
	public FaceBookForgotPass(WebDriver driver) {
		emailfiel = driver.findElement(By.id("identify_email"));
		searchfield = driver.findElement(By.name("did_submit"));
		cancelbutton=driver.findElement(By.linkText("Cancel"));
	}
	public void setEmail(String mail) {
		emailfiel.sendKeys(mail);
	}
	public void clickonsearchbutton() {
		searchfield.click();
	}
	public void clickoncancelbutton() {
		cancelbutton.click();
	}
}
