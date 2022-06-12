package sect2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class select {
	static {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");	
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/GSK/Desktop/drop.html");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement ele=driver.findElement(By.id("taj"));
		Select s=new Select(ele);
		Thread.sleep(2000);
		s.selectByIndex(4);
		Thread.sleep(2000);
		s.selectByValue("300");
		Thread.sleep(2000);
		s.selectByVisibleText("Laptops");
		//delselect statements starting
		Thread.sleep(2000);
		s.deselectByIndex(4);
		Thread.sleep(2000);
		s.deselectByValue("300");
		Thread.sleep(2000);
		s.deselectByVisibleText("Laptops");
		//Thread.sleep(2000);
		//s.deselectAll();
		boolean multi = s.isMultiple();
		System.out.println(multi);
		Thread.sleep(2000);
		driver.close();
		

	}

}
