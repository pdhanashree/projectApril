package seledemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class wmethods1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","F:\\chromedriver_win32\\Chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	Thread.sleep(2000);
    boolean result =driver.findElement(By.xpath("//button[@value='1']")).isEnabled();
	System.out.println(result);
	if(result==true) {
		System.out.println("element is enabled"); 
	}
	else {
		System.out.println("element is disabled");
	}
	
	System.out.println("-----------------------******-----------------------------");
	WebElement check =driver.findElement(By.xpath("//button[@value='1']"));
	System.out.println(check.isEnabled());
	System.out.println(check.isDisplayed());
	System.out.println(check.isSelected());
	System.out.println(check.getText());
	System.out.println(check.getAttribute("class"));
	
	
}
}
