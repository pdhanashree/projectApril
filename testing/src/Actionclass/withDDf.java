package Actionclass;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class withDDf {
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	FileInputStream file=new FileInputStream("C:\\Users\\ADMIN\\Desktop\\excel\\s1.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("sheet2");
	System.setProperty("webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe");
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--disable-notifications");
	WebDriver driver=new ChromeDriver(opt);
	
	driver.get("https://kite.zerodha.com/");
	driver.manage().window().maximize();
	 
	String UN = sh.getRow(0).getCell(0).getStringCellValue();
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys(UN);
	Thread.sleep(2000);
	
	String pwd = sh.getRow(1).getCell(0).getStringCellValue();
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pwd);
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(2000);
	
	String pin = sh.getRow(2).getCell(0).getStringCellValue();
	driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(pin);
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(2000);
	
	
	
	
	
}
}
