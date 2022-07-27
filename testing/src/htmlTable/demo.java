package htmlTable;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(2000);
	      List<WebElement> noofrow = driver.findElements(By.xpath("//table[@id='customers']//tr"));
	
	    System.out.println("No of Rows : "+ noofrow.size());
	    
	    for(int i=1;i<noofrow.size();i++) {
	    	List<WebElement> noofcell = driver.findElements(By.xpath("//table[@id='customers']//tr["+(i+1)+"]//td"));
	    	System.out.println("Row no : " + i + " No of cell :"+ noofcell.size());
	    	
	    	for(int cell=0;cell<noofcell.size();cell++) {
             System.out.print(noofcell.get(cell).getText()+",");
	    
	    }
	    	System.out.println();
	    }
	}
}
	
	
	
	
	
	
	

