package seledemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	
	driver.findElement(By.xpath("(//input[contains(@class,'55r1')])[1]")).sendKeys("patildhanshree555@gmail.com");
	driver.findElement(By.xpath("//a[contains(text(),'acc')]")).click();
	
}
}
