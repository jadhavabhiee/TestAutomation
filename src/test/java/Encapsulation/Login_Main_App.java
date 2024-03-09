package Encapsulation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Main_App {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://online.actitime.com/test26/login.do");
	Login_Script_For_ActiTime page = new Login_Script_For_ActiTime(driver);
	page.setLogin("Admin@124gmail.com", "Manager");
	page.clickOnLogin();
	}

}
