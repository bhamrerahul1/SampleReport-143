package handlingWebElements;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		WebElement dd = driver.findElement(By.id("month"));
		Select s = new Select(dd);
		Thread.sleep(2000);
		s.selectByIndex(0);
		Thread.sleep(2000);
		s.selectByValue("7");
		Thread.sleep(2000);
		s.selectByVisibleText("Feb");
		Thread.sleep(2000);
		
		List<WebElement> opt = s.getOptions();
		System.out.println( opt.size());
		ArrayList a= new ArrayList();
		for(WebElement b:opt)
		{
			String text = b.getText();
			System.out.println(text);
			a.add(text);
			
			
			
		}
		System.out.println(s.isMultiple());
		System.out.println("*****************afer sorting************************");
		Collections.sort(a);
		for (Object opt1:a)
		{
			System.out.println( opt1);	
		}
		driver.close();
		
		
		
		
		 

	}

}
