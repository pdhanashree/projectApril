package seledemo;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selemethods {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
	driver.get("https://www.amazon.in/");
	/*Thread.sleep(5000);
	driver.navigate().to("https://web.whatsapp.com/");
	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(3000);
	driver.navigate().forward();
	Thread.sleep(5000);
	driver.navigate().refresh();
	driver.switchTo().newWindow(WindowType.TAB);     //to open new tab in same browser
	driver.get("https://www.google.com/");*/
	
	Dimension D = new Dimension(300,400);
	driver.manage().window().setSize(D);
	Thread.sleep(2000);
	
	Point p =new Point(300,400);
	driver.manage().window().setPosition(p);
	
}
}



	
	
	
	







