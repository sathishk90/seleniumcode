package sect2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosugges {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      driver.get("https://www.myntra.com/");
	      WebElement search=driver.findElement(By.className("desktop-searchBar"));
	      search.sendKeys("dresses");
	      
	      Thread.sleep(2000);
	      
	      List<WebElement> options=driver.findElements(By.xpath("//li[@class='desktop-suggestion null']"));
	      System.out.println(options.size());
	      for(WebElement alloptions:options)
	      {
	    	  System.out.println(alloptions.getText());
	      }
	      driver.close();
	      }

}
