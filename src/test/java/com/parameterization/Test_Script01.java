package com.parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_Script01 {
@Test
public void TestLogin() {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("Admin@123");
	driver.findElement(By.id("pass")).sendKeys("Admin123");
}
}
