package TESTINGEXECUTION;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Account_Creation {
	@Test(priority = 4)
	public void DeleteAccount() {
		Reporter.log("Account Deleted",true);
	}
	
	@Test(priority = 3)
	public void EditAccount() {
		Reporter.log("Account has been edited",true);
	}
	
	@Test(priority = 1)
	public void AccountUpdated() {
		Reporter.log("Account has Been Updated",true);
	}
	
	@Test(priority = 2)
	public void AccountCreated() {
		Reporter.log("Account has Been Created",true);
	}
	
	
	
	

}
