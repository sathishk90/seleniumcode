package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class test{

	@Test(priority = 1)
	public void calls()
	{
		Reporter.log("calls", true);
	}
	// priortize the testcase
	@Test(priority = -1,invocationCount=5)
	public void chats()
	{
		Reporter.log("chats", true);
	}
	//skip the test case
	@Test(priority = -1,enabled=false)
	public void settings()
	{
		Reporter.log("settings", true);
	}
}
		
	
	

