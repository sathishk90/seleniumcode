package sect2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectt {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement ele=driver.findElement(By.id("cars"));
		Select s=new Select(ele);
		Thread.sleep(2000);
		s.selectByIndex(3);
		Thread.sleep(2000);
		s.selectByValue("500");
		Thread.sleep(2000);
		s.selectByVisibleText("INR 300 - INR 399 ( 1 ) ");
		//delselect statements starting
		Thread.sleep(2000);
		s.deselectByIndex(3);
		Thread.sleep(2000);
		s.deselectByValue("500");
		//Thread.sleep(2000);
		//s.deselectByVisibleText("INR 300 - INR 399 ( 1 ) ");
		//Thread.sleep(2000);
		//s.deselectAll();
		if(s.isMultiple())
		{
			s.deselectAll();
		}
		Thread.sleep(2000);
		driver.close();

	}

}
