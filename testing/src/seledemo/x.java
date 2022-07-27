package seledemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class x {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	
	driver.get("https://www.facebook.com/login/");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@type ='text']")).sendKeys("abc123@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type ='password']")).sendKeys("Dh@nesh123");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@name ='login']")).click();
}
}
