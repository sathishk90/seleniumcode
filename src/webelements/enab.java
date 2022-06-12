package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class enab {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      driver.get("https://www.facebook.com/");
	      WebElement btn=driver.findElement(By.name("login"));
	      if(btn.isEnabled()) {
	    	  System.out.println("pass");
	    	  btn.click();
	    	  
	      }
	      else
	      {
	    	  System.out.println("fail");
	      }
	      Thread.sleep(2000);
	      driver.close();


	}

}
