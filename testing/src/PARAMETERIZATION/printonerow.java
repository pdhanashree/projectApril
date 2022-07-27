package PARAMETERIZATION;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class printonerow {
public static void main(String[] args) throws IOException {
	FileInputStream file= new FileInputStream("C:\\Users\\ADMIN\\Desktop\\excel\\s1.xlsx");
	Sheet data = WorkbookFactory.create(file).getSheet("sheet1");
	
	for(int i=0;i<=data.getLastRowNum();i++) {
		
		for(int j=0;j<=data.getRow(i).getLastCellNum()-1;j++) {
			
			String sh = data.getRow(i).getCell(j).getStringCellValue();
		System.out.print(sh + " ");
		}
		System.out.println();
	}
	
}
}
