package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertpopup {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	
	driver.get("https://nxtgenaiacademy.com/alertandpopup/");
	//driver.findElement(By.xpath("//button[@name='alertbox']")).click();
	//Thread.sleep(2000);
	//driver.switchTo().alert().accept();
	
	//driver.findElement(By.xpath("//button[@name='confirmalertbox']")).click();
	//Thread.sleep(2000);
	//driver.switchTo().alert().dismiss();
	
	driver.findElement(By.xpath("//button[@name='promptalertbox1234']")).click();
	Thread.sleep(2000);
	Alert alt = driver.switchTo().alert();
	String text = alt.getText();
	System.out.println(text);
	
	alt.sendKeys("Dhanu");
	alt.accept();
}
}