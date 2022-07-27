package Synchronization;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","F:\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	//deprecated=expire(updated) in new version
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.findElement(By.name("q")).sendKeys("selenium");
	driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	driver.findElement(By.xpath("//h3[text()='Selenium']")).click();
}
}
