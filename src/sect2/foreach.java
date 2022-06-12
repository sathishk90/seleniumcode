package sect2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class foreach {
	static {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");	
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement ele=driver.findElement(By.id("gh-cat"));
		Select s=new Select(ele);
		List<WebElement> options=s.getOptions();
		int count=options.size();
		System.out.println(count);
		for(WebElement b:options) {
			System.out.println(b.getText());	
		}
		Thread.sleep(2000);
		driver.close();
	}

}


