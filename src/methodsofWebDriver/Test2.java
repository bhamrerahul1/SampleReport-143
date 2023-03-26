package methodsofWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) throws InterruptedException 
	{
      WebDriver d1= new ChromeDriver();
       d1.manage().window().maximize();//maximize the browser
      d1.get("https://skillrary.com/");
      Thread.sleep(3000);
      d1.manage().window().fullscreen();// full screens  the browser
      Thread.sleep(3000);
      
      d1.manage().window().minimize();// minimize of window 
     
     
     
      
      
     
      
      

	}

}
