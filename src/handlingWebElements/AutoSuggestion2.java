package handlingWebElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.meesho.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 WebElement ele2 = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		 ele2.sendKeys("top");
		 Thread.sleep(1000);
		List<WebElement> ele3 = driver.findElements(By.xpath("//p[@color='greyBase']"));
		//count the optionsq
		System.out.println(ele3.size());
		for (WebElement b:ele3)
		{
			System.out.println(b.getText());
			
		}
		driver.close();
		

	}

}
