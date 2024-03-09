package Data_Driven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFWorkbookFactory;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class SampleSheet {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// copy from Rom To Ram
		FileInputStream file = new FileInputStream("../maven/Sample.xlsx");
		//open Excel 
		Workbook wb =WorkbookFactory.create(file);
		//openSheet
		Sheet sh = wb.getSheet("Sheet1");
		//iddentify Row
		Row r = sh.getRow(0);
		//identify cell
		Cell c = r.getCell(0);
		String data=c.getStringCellValue();
		System.out.println(data);
		
		
				
	}

}
