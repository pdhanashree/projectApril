package seledemo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.amazon.in/");
	Thread.sleep(5000);
	driver.navigate().to("https:web.whatsapp.com/");
	Thread.sleep(2000);
	driver.close();
	WebDriver driver1 =new ChromeDriver();
	driver1.get("https://www.amazon.in/");
	Thread.sleep(2000);
	driver1.quit();
	
	
}
}
