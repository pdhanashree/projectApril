package seledemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Dhanashree");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@type='text'])[1]")).clear();
	Thread.sleep(2000);
	
	
}
}
