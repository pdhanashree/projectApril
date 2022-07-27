package seledemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class relative {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","F:\\chromedriver_win32\\ChromeDriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.facebook.com/login");
	driver.manage().window().maximize();
 //   driver.findElement(By.xpath("//*[@id='loginform']/div[2]/div/div/input")).sendKeys("adcs");
	
	//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Dhanashree");

    driver.findElement(By.xpath("//input[type()='text']")).sendKeys("Dhanu");
	
}
}
