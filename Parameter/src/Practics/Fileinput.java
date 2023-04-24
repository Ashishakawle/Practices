package Practics;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;

public class Fileinput {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException {
//	       FileInputStream file=new FileInputStream("E:\\SerizeNumber.xlsx");
//           String data= WorkbookFactory.create(file).getSheet("Test Cases").getRow(0).getCell(0).getStringCellValue();
//           System.out.println(data);
	       @SuppressWarnings("resource")
		FileInputStream file=new FileInputStream("E:\\Group No17.xlsx");
	          @SuppressWarnings("resource")
			 SXSSFWorkbook wb=new SXSSFWorkbook();
		      SXSSFSheet sheet=wb.getSheet("Test Cases");
		      int lRN=sheet.getLastRowNum();
		      System.out.println(lRN);
		      int lCN=sheet.getRow(0).getLastCellNum()-1;
		      System.out.println(lCN);
		      for(int i=0;i<=lRN;i++) {
		    	  sheet.getRow(i).getLastCellNum(); 
		      for(int j=0;j<=lCN;j++) {
		      String s=sheet.getRow(i).getCell(j).getStringCellValue();
		       System.out.print(" "+s);
		      }
		      System.out.println(" ");
		      }
	}

}
