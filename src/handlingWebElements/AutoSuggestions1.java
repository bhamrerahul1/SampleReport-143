package handlingWebElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestions1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 WebElement ele2 = driver.findElement(By.id("twotabsearchtextbox"));
		 ele2.sendKeys("phone");
		 Thread.sleep(5000);
		List<WebElement> ele3 = driver.findElements(By.xpath("//div[@class='s-suggestion-cont22ainer']"));
		//count the options
		System.out.println(ele3.size());
		for (WebElement b:ele3)
		{
			System.out.println(b.getText());
			
		}
		driver.close();


	}

}
