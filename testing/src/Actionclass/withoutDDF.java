package Actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class withoutDDF {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe");
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--disable-notifications");
	WebDriver driver=new ChromeDriver(opt);
	driver.get("https://kite.zerodha.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("OKP335");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("WSX12345");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("7654321");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(2000);
	String ActualUID = driver.findElement(By.xpath("//span[text()='OKP335']")).getText();
	
	String expectedUID="OKP335";
	if(expectedUID.equals(ActualUID)) {
		System.out.println("Textcase pass");
	}
	else 
		System.out.println("Fail");
}
}

