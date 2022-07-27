package seledemo;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.amazon.com/");
	Thread.sleep(1000);

	Dimension D =new Dimension(400,600);
	driver.manage().window().setSize(D);
	
	
	Point p =new Point(300,400);
	driver.manage().window().setPosition(p);

}
}


