package TESTINGEXECUTION;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FaceBook_SignUp {
	private WebElement firstname;
	private WebElement lastname;
	private WebElement mobilenumber;
	private WebElement password;
	private WebElement date;
	private WebElement month;
	private WebElement year;
	private WebElement femaleoption;
	private WebElement maleoption;
	private WebElement customoption;
	private WebElement login;
	
	public FaceBook_SignUp(WebDriver driver) {
		firstname = driver.findElement(By.name("firstname"));
		lastname = driver.findElement(By.name("lastname"));
		mobilenumber= driver.findElement(By.name("reg_email__"));
		password = driver.findElement(By.name("reg_passwd__"));
		date = driver.findElement(By.id("day"));
		month = driver.findElement(By.id("month"));
		year= driver.findElement(By.id("year"));
		femaleoption=driver.findElement(By.xpath("//input[@value='1']"));
		maleoption=driver.findElement(By.xpath("//input[@value='2']"));
		customoption= driver.findElement(By.xpath("//input[@value='-1']"));
		login=driver.findElement(By.name("websubmit"));
		
	}
	public void setName(String F_Name,String L_Name) {
		firstname.sendKeys(F_Name);
		lastname.sendKeys(L_Name);
	}
	public void setMobileNumber(String number) {
		mobilenumber.sendKeys(number);
	}
	public void setPassword(String pwd) {
		password.sendKeys(pwd);
	}
	public void selectDOB(String day,String Mon,String yea) {
		Select s = new Select(date);
		s.selectByVisibleText(day);
		s=new Select(month);
		s.selectByVisibleText(Mon);
		s=new Select(year);
		s.selectByVisibleText(yea);
		
	}
	public void clickonfemaleOption() {
		 femaleoption.click();
	}
	public void clickonmaleOption() {
		 maleoption.click();
	}
	public void clickonLoginbutton() {
		login.click();
	}
	
}
