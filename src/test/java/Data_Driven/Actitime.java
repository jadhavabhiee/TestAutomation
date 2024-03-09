package Data_Driven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
		FileInputStream file =new FileInputStream("../maven/Actitime.xlsx");
		
		//openExcel
		Workbook wb = WorkbookFactory.create(file);
		Sheet sh = wb.getSheet("Sheet1");
		String EmailId=sh.getRow(1).getCell(0).toString();
		String Password=sh.getRow(1).getCell(1).toString();
		// Selenium Code
		WebDriver driver = new ChromeDriver();
		driver.get("https://online.actitime.com/test26/login.do");
		driver.findElement(By.name("username")).sendKeys(EmailId);
		driver.findElement(By.name("pwd")).sendKeys(Password);
		

	}

}
