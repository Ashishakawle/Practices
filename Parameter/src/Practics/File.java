package Practics;

import java.io.FileInputStream;
import java.io.IOException;
//import org.apache.poi.xssf.usermodel.XSSFWorkbookFactory;
//import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class File {

	public static void main(String[] args) throws IOException  {
		FileInputStream file= new FileInputStream("E:\\Group No17.xlsx");
//      String data= WorkbookFactory.create(file).getSheet("Test Cases").getRow(1).getCell(1).getStringCellValue();
//		System.out.println(data);
		 @SuppressWarnings("resource")
		XSSFWorkbook Wb= new XSSFWorkbook(file);
		 XSSFSheet S1= Wb.getSheetAt(1);
		 String name= S1.getRow(0).getCell(0).getStringCellValue();
		System.out.println(name);
		
	}
}
