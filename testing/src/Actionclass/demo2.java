package Actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demo2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.Amazon.com/");
	driver.manage().window().maximize();
	
	WebElement id = driver.findElement(By.xpath("(//a[@data-nav-role='signin'])[1]"));
	Actions act =new Actions(driver);
	act.moveToElement(id).perform();
	Thread.sleep(2000);
	WebElement or = driver.findElement(By.xpath("//span[text()='Orders']"));
	act.click(or).perform();
	Thread.sleep(2000);
	
}
}
