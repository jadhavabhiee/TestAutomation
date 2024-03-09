package com.parameterization;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Parametrs {
@Parameters({"un","pwd"})
	@Test
	public void signup(String un,String pwd) {
		Reporter.log(un,true);
		Reporter.log(pwd,true);
		
	}
}

