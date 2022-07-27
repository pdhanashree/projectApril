package PARAMETERIZATION;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getcelltypewithfetchingdata {
public static void main(String[] args) throws IOException {
	
	FileInputStream file= new  FileInputStream("C:\\Users\\ADMIN\\Desktop\\excel\\s1.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("sheet1");
	
	for(int i=0;i<=sh.getLastRowNum();i++) {
		for(int j=0;j<=sh.getRow(i).getLastCellNum()-1;j++) {
			
			Cell a = sh.getRow(i).getCell(j);
			
			CellType ct = a.getCellType();
			
			if(ct==CellType.STRING) {
				System.out.print(a.getStringCellValue() + " | ");
			}
			else if(ct==CellType.NUMERIC) {
				System.out.print(a.getNumericCellValue() + " | ");
			}
			else if(ct==CellType.BOOLEAN) {
				System.out.print(a.getBooleanCellValue() + " | ");
			}
		}
		System.out.println();
	}
	
}
}
