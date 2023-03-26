package handlingWebElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement dropdown = driver.findElement(By.name("url"));
		Select s= new Select(dropdown);
		Thread.sleep(3000);
		s.selectByIndex(8);
		Thread.sleep(3000);
		
		s.selectByVisibleText("Automotive");
		Thread.sleep(3000);
		s.selectByValue("search-alias=baby-products-intl-ship");
		
		s.deselectAll();
		List<WebElement> options = s.getOptions();      
		System.out.println(options.size());
		
	
		
		for(WebElement b:options)
		{
			System.out.println(b.getText());
		
	}

}
}
