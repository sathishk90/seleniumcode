package sect2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement dropdown=driver.findElement(By.id("searchDropdownBox"));
		Select s=new Select(dropdown);
		Thread.sleep(2000);
		s.selectByIndex(9);
		Thread.sleep(2000);
		s.selectByValue("search-alias=computers-intl-ship");
		Thread.sleep(2000);
		s.selectByVisibleText("Men's Fashion");
		List<WebElement> alloptions=s.getOptions();
		System.out.println(alloptions.size());
		//boolean multi = s.isMultiple();
				//System.out.println(multi);
				//Thread.sleep(2000);
		for(WebElement b:alloptions) {
			System.out.println(b.getText());	
		}
		driver.close();

	}

}
