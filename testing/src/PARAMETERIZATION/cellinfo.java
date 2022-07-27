package PARAMETERIZATION;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class cellinfo {
public static void main(String[] args) throws IOException {
	
	FileInputStream file  =new FileInputStream("C:\\Users\\ADMIN\\Desktop\\excel\\s1.xlsx");
	Cell a = WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(1);
	
       CellType ct = a.getCellType();
      
       if(ct==CellType.STRING) {
    	   System.out.println(a.getStringCellValue());
       }
       else if(ct==CellType.NUMERIC) {
    	   System.out.println(a.getNumericCellValue());
       }
       else if(ct==CellType.BOOLEAN){
    	   System.out.println(a.getBooleanCellValue());
       }
	
}
}
