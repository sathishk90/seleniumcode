package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class dm {
	@Test
	public void test() {
		Reporter.log("Hello World", true);
		Reporter.log("Hello World", false);
	}
}
