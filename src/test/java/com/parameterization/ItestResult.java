package com.parameterization;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ItestResult {
	@Test
	public void TestCaseFail() {
		fail();
		assertTrue(true);
	}
	@Test
	public void TestCasePass() {
		assertTrue(true);
	}
	@AfterMethod
	public void getStatus(ITestResult result) {
		if(result.getStatus()== ITestResult.SUCCESS) {
			System.out.println("Sucess=MethodStatus:"+result.getStatus());
		}
	}

}
