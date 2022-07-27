package Actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragndrop{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement dest = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		Actions act= new Actions(driver);
		act.dragAndDrop(source, dest).perform();
		
	}

}
