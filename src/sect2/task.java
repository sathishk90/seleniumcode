package sect2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class task {
	static {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");	
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement dropdown=driver.findElement(By.id("gh-cat"));
		Select s=new Select(dropdown);
		Thread.sleep(2000);
		s.selectByIndex(4);
		Thread.sleep(2000);
		s.selectByValue("10542");
		Thread.sleep(2000);
		s.selectByVisibleText("Travel");
		//boolean multi = s.isMultiple();
		//System.out.println(multi);
		//Thread.sleep(2000);
		driver.close();
	}

}
