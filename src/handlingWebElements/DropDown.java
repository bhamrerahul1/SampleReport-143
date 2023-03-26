package handlingWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement dropdown1 = driver.findElement(By.name("_sacat"));
		Select s= new Select(dropdown1);
		Thread.sleep(3000);
		s.selectByIndex(3);
		Thread.sleep(3000);
		s.selectByVisibleText("DVDs & Movies");
		Thread.sleep(3000);
		s.selectByValue("625");
		
	 
		
		
		

	}
	

}
