package sect2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class ass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		WebElement ele=driver.findElement(By.id("month"));
		Select s=new Select(ele);		
		s.selectByIndex(3);
		s.selectByValue("3");
		s.selectByVisibleText("May");
		System.out.println(s.isMultiple());
		List<WebElement> alloptions=s.getOptions();
		System.out.println(alloptions.size());
		ArrayList a=new ArrayList<>();
		for(WebElement b:alloptions) {
			String text=b.getText();
			System.out.println(text);
			a.add(text);
			
		}
		Collections.sort(a);
		System.out.println("after sorting");
		for(Object alloption:a)
		{
			System.out.println(alloption);
		}
	
		Thread.sleep(2000);
		driver.close();

	}

}
