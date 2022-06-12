package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class meth {
	static {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver = new ChromeDriver();//shortcut for importing ctrl+shift+o
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		//Options options=driver.manage();
		
		//Thread.sleep(5000);
		driver.close();

	}

}
