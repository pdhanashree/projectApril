package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	Thread.sleep(2000);
	
	driver.switchTo().frame("iframeResult");
	
	driver.findElement(By.xpath("//button[@type='button']")).click();//After click- Tue Jul 05 2022 13:41:05 GMT-0400 (Eastern Daylight Time)
	
	//driver.switchTo().defaultContent();
	
	driver.switchTo().parentFrame();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//a[@id='tryhome']")).click();
	
}
}
