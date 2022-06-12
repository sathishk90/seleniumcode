package sect2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag {
	static {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");	
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement block2=driver.findElement(By.xpath("//h1[text()='Block 2']"));
		WebElement block3=driver.findElement(By.xpath("//h1[text()='Block 3']"));
		Actions a=new Actions(driver);
		a.dragAndDrop(block2, block3).perform();
		Thread.sleep(2000);
		driver.close();

	}

}
