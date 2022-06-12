package interviewscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class script {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		String actual = driver.getTitle();
		//System.out.println(actual);
		//String expected = "Google";
		if (actual.equals("Google"))
		{
			System.out.println("Google page successfully displayed");
		}
		else
		{
			System.out.println("check the url");
		}
		//Thread.sleep(2000);
		//driver.navigate().to("https://www.google.co.in/");
		//String actuall = driver.getTitle();
		//System.out.println(actual);
		String utl=driver.getCurrentUrl();
		if(utl.contains("google.co.in")) {
			System.out.println("pass url contains google.co.in");
		}
		else
		{
			System.out.println("fail url does not contains google.co.in");
		}
driver.close();
		//String expectedd = "Google";
		//if (actuall.equals(expectedd))
		//{
			//System.out.println("Valid url");
		//}
		//else
		//{
			//System.out.println("check the url");
			
		//}
		

	}

}
