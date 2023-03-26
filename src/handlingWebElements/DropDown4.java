package handlingWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Admin/Desktop/multiselectdropdownforseleniumpratice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement dropdown = driver.findElement(By.id("MTR"));
		Select s= new Select(dropdown);
		Thread.sleep(3000);
		s.selectByIndex(1);
		Thread.sleep(3000);
		
		s.selectByVisibleText("coffee");
		Thread.sleep(3000);
		s.selectByValue("t");
		System.out.println(s.isMultiple());
		
		s.deselectAll();
		
		Thread.sleep(3000);
		
		
		
		if(s.isMultiple())
			
		{
			System.out.println("the given drop down is a multisleect");
			s.deselectAll();
			
			
			
		}
		else
		{
			System.out.println("the given drop down is not multisleect");
			
		}
		driver.close();

	}

}
