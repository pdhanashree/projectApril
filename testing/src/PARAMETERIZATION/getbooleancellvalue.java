package PARAMETERIZATION;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getbooleancellvalue {
public static void main(String[] args) throws IOException {
	FileInputStream file =new FileInputStream("C:\\Users\\ADMIN\\Desktop\\excel\\s1.xlsx");
	boolean data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(1).getBooleanCellValue();
	System.out.println(data );
}
}
