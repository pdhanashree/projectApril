package seledemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dob {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","F:\\chromedriver_win32\\ChromeDriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.facebook.com//signup/");
	
	WebElement Date = driver.findElement(By.xpath("//select[@name='birthday_day']"));
	Select d=new Select(Date);
	d.selectByValue("2");
	
	WebElement month=driver.findElement(By.xpath("//select[@name='birthday_month']"));
	Select s=new Select(month);
	s.selectByIndex(8);
	
	WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
	Select y=new Select(year);
	y.selectByVisibleText("1996");
	
	
}
}
