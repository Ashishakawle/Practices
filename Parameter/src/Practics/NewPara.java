package Practics;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class NewPara {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	String	fle="D:\\Excel\\kitti.xlsx";
		FileInputStream file= new FileInputStream(fle);
        String sour= WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
         System.out.println(sour);
	}

}
