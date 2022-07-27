package PARAMETERIZATION;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getcellsize {
public static void main(String[] args) throws IOException {
	FileInputStream file =new FileInputStream("C:\\Users\\ADMIN\\Desktop\\excel\\s1.xlsx");
	short data = WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getLastCellNum();
	System.out.println(data);
}
}
