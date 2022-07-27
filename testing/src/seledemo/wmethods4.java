package seledemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class wmethods4 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","F:\\chromedriver_win32\\ChromeDriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.com/");
	
	driver.findElement(By.xpath("//span[text()='Hello, Sign in']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[@id='createAccountSubmit']")).click();
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Dhanashree Patil");
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("patildhanshree555@gmail.com");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Dhanesh@123");
	
	driver.findElement(By.xpath("//input[@name='passwordCheck']")).sendKeys("Dhanesh@123");
	driver.findElement(By.xpath("//input[@id='continue']")).click();
	
}
}