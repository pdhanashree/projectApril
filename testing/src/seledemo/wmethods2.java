package seledemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class wmethods2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","F:\\chromedriver_win32\\Chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.facebook.com/signup/");
	Thread.sleep(2000);
	 boolean result =driver.findElement(By.xpath("//input[@name='custom_gender']")).isSelected(); 
	 System.out.println(result);
    if(result==true) {
     System.out.println("Female is selected");
     }
     else {
    	 System.out.println("Female  is not selected");
    	 
     }
}

}