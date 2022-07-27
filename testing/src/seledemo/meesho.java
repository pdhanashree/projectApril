package seledemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class meesho{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver =new ChromeDriver();
		driver.get("https://www.meesho.com/");
	
		driver.findElement(By.className("//*[@id=\"__next\"]/div[2]/div[1]/div/div[3]/div[5]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.className("//a[contains(@id,'nav-link-accountList')]")).click();
	}
}
