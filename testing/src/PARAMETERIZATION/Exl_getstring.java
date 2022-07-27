package PARAMETERIZATION;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exl_getstring {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream file=new FileInputStream("C:\\Users\\ADMIN\\Desktop\\excel\\s1.xlsx");
	//String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
	 double data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(1).getNumericCellValue();
	System.out.println(data);
}
}
