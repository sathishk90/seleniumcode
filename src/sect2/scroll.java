package sect2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		JavascriptExecutor ks=(JavascriptExecutor) driver;
		ks.executeScript("window.scrollBy(0,5000)");
		Thread.sleep(3000);
		ks.executeScript("window.scrollBy(0,-5000)");
		driver.close();

	}

}
