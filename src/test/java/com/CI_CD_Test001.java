package com;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CI_CD_Test001 {	
	@Test
		public void loginTest() throws InterruptedException, IOException { 
			// TODO Auto-generated method stub
		/*org.openqa.selenium.chrome.ChromeOptions options = new org.openqa.selenium.chrome.ChromeOptions();
		options.addArguments("--headless"); 
		options.addArguments("--disable-gpu");
		options.addArguments("--window-size=1920,1080");*/
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
