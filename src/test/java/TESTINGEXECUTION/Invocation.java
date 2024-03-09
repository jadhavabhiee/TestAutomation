package TESTINGEXECUTION;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Invocation {
	@Test(invocationCount = 4)
	public void AccountUpdated() {
		Reporter.log("Account has Been Updated",true);
	}
}
