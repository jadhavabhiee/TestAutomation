package TESTINGEXECUTION;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;
import com.parameterization.ItestResult;

public class Base_Script {
	WebDriver driver;
	@org.testng.annotations.Parameters("BrowserName")
	@BeforeClass
	public void OpenBrowser(String BrowserName) {
		if(BrowserName.equals("Firefox")) {
			driver= new FirefoxDriver();
		}else if(BrowserName.equals("Chrome")) {
			driver = new ChromeDriver();
		}else {
			driver=new EdgeDriver();
		}
	}
@BeforeMethod
     public void OpenApp() {
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
}
@AfterMethod
public void TestMothodExecution(ITestResult r) {
	String methodName = r.getName();
	if(r.getStatus()==1) {
		Reporter.log(methodName+"EXECUTION IS PASS",true);
		
	}else {
		Reporter.log(methodName+"EXECUTION IS PASS",true);
		
	}
}
@AfterClass
public void CloseBrowser() {
	driver.close();
}
	
}
