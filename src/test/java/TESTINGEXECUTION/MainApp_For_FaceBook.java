package TESTINGEXECUTION;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class MainApp_For_FaceBook {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.afacebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		FaceBookLoginPage page = new FaceBookLoginPage(driver);
		page.clickoncreateAccount();
		page.clickonLoginbutton();
	}
	public class TestAccount{
		@Test
		public void TestAccount() {
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.afacebook.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			FaceBookLoginPage page = new FaceBookLoginPage(driver);
			page.clickoncreateAccount();
			FaceBook_SignUp page1 = new FaceBook_SignUp(driver);
			page1.setName("Admin", "Manager12");
			page1.setMobileNumber("Admin125@gmail.com");
			page1.setPassword("Manager123");
			page1.selectDOB("10", "10", "1998");
			
		}
		
	}
}
