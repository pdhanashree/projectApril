package PARAMETERIZATION;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class print1row {
public static void main(String[] args) throws EncryptedDocumentException, IOException {

	FileInputStream file =new FileInputStream("C:\\Users\\ADMIN\\Desktop\\excel\\s1.xlsx");
	
	Sheet s = WorkbookFactory.create(file).getSheet("sheet1");

	short cellsize = s.getRow(0).getLastCellNum();
	System.out.println(cellsize);
	for(int i=0;i<cellsize;i++) {
		
		String data = s.getRow(0).getCell(i).getStringCellValue();
		
		System.out.print(data + " ");
	}
	
	
}
}
