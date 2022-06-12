package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class workout {
	
	public static void main(String [] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
	WebDriver dr =new ChromeDriver();
	dr.manage().window().maximize();
	dr.get("https://www.amazon.co.in/");
	String drivers = dr.getTitle();
	System.out.println(drivers);
	String url = dr.getCurrentUrl();
	System.out.println(url);
	Thread.sleep(2000);
	dr.close();
	}

	
	
	
	
	

}
