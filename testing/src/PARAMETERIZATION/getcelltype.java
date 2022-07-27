package PARAMETERIZATION;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getcelltype {
public static void main(String[] args) throws IOException {
	FileInputStream file =new FileInputStream("C:\\Users\\ADMIN\\Desktop\\excel\\s1.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("sheet1");
	String data = sh.getRow(0).getCell(0).getStringCellValue();
	System.out.println(data);
}
}
