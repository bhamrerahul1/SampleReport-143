package handlingWebElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown3 {

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
		
		s.deselectByIndex(1);
		s.deselectByValue("t");
		s.deselectByVisibleText("coffee");
		List<WebElement> opt = s.getOptions();
		System.out.println(opt.size());
		for(WebElement b:opt)
		{
			System.out.println(b.getText());
			
			
		}
		driver.close();
		
		

}
}