package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isdis {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      driver.get("https://www.myntra.com/");
	      WebElement web=driver.findElement(By.className("desktop-searchBar"));
	      if(web.isDisplayed()) {
	    	  System.out.println("pass");
	    	  web.sendKeys("shoes");
	      }
	      else
	      {
	    	  System.out.println("fail");
	      }
	      Thread.sleep(2000);
	      driver.close();
	}
}

	    		
	    	 
	    	  
	    	  
	    	  
	    	  
	
