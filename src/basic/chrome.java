package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome {

	public static void main(String[] args) throws Exception {
		//String key=("webdriver.chrome.driver");
		//String value=("./Drivers/chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 //driver.get("https://www.google.co.in/");
		 
		// String dr = driver.getTitle();
		 //System.out.println(dr);
		 
		 //String url = driver.getCurrentUrl();
		 //System.out.println(url);
		 
		Thread.sleep(2000);
		driver.close();
		 
		

	}

}
