package com.parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestData_Provider {
@ DataProvider
public Object [][] TestData(){
	Object[][]Obj=new Object[1][2];
	Obj[0][0]="Admin@123";
	Obj[0][1]="Admin123";
	return Obj;
}
@Test(dataProvider="TestData")
	public void TestLogin(String email,String pwd) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(pwd);
	}
}
	
	

