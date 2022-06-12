package webelements;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettext {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      driver.get("https://www.facebook.com/");
	      WebElement p=driver.findElement(By.xpath("//h2"));
	      String s= p.getText();
	      System.out.println(s);
	      if (s.equals("Facebook helps you connect and share with the people in your life."))
			{
				System.out.println("Pass");
			}
			else
			{
				System.out.println("Fail");
			}
	      Thread.sleep(3000);
	      driver.close();

	}

}
