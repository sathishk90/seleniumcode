package basic;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fire {

	public static void main(String[] args) throws Exception {
		//String key=("webdriver.gecko.driver");
		//String value=("./Drivers/geckodriver.exe");
		
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(2000);
		driver.close();

	}

}
