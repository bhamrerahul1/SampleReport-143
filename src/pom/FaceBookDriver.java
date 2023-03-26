package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookDriver {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		FaceBook f= new FaceBook(driver);
		f.usertextbox("rahulbhamre1137@gmail.com");
		f. passwordextbox("Rahul@555");
		f.loginbutton();
		


	}

}
