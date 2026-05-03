import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CI_CD_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//LOG IN
		driver.get("https://rahulshettyacademy.com/client");
		driver.findElement(By.id("userEmail")).sendKeys("laidiephaiduong@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("seleniumframework");
		driver.findElement(By.id("login")).click();
		driver.close();
	}

}
