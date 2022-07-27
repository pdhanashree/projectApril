package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	public static void main(String[] args) {	
	System.setProperty("webdriver.chrome.driver","F:\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	
	//WebDriverWait mywait =new  WebDriverWait (driver, 5);//use in old selenium version
	WebDriverWait mywait =new WebDriverWait(driver,Duration.ofSeconds(10));
	
	driver.findElement(By.name("q")).sendKeys("selenium");
	driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	
	
}
}
