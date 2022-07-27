package PARAMETERIZATION;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getrowsize {
public static void main(String[] args) throws IOException {
	FileInputStream file =new FileInputStream("C:\\Users\\ADMIN\\Desktop\\excel\\s1.xlsx");
int data = WorkbookFactory.create(file).getSheet("sheet1").getLastRowNum();
System.out.println(data + 1);
}
}
