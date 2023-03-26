package handlingWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBar4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.meesho.com/");
		Thread.sleep(3000);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement element = driver.findElement(By.xpath("	//img[@src='https://images.meesho.com/images/products/113427752/egnaa_400.jpg']"));
		Thread.sleep(3000);
		Point p = element.getLocation();
		int x= p.getX();
		int y= p.getY();
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("window.scrollBy("+x+" ,"+y+")");
		j.executeScript("arguments[0].click();",element);
		
		
		
		
		
		
		
		
		
		
	}

}
