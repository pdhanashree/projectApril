package seledemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import graphql.execution.instrumentation.tracing.TracingInstrumentation.Options;

public class wmethods3 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","F:\\chromedriver_win32\\ChromeDriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com//signup/");
	
	WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
	Select s=new Select(year);
	List<WebElement> options = s.getOptions();
	int size = options.size();
	System.out.println("size of list= "+size);
	
	for(int i=0; i<=options.size()-1;i++) {
		System.out.println(options.get(i).getText());
	}
	
	
	boolean result = s.isMultiple();
	System.out.println(result);
	if(result==true) {
		System.out.println("listbox is multiple Selectable");
	}
	else {
		System.out.println("listbox is single Selectable");
	}
	
	
}
}
