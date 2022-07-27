package Screenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	
	public static void M1() throws IOException {
	System.setProperty("webdriver.chrome.driver","F:\\chromedriver_win32\\ChromeDriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	for(int i=1;i<=10;i++) {
	
   File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    System.out.println(source);
   String td= new SimpleDateFormat("dd-MM-YYYY-hh-mm-ss").format(new Date());
    
  File dest =new File("C:\\Users\\ADMIN\\Desktop\\Sc\\Dhanu1  " + td  + i + ".jpg");
   FileHandler.copy(source, dest);
	}
	
}
}
