package Data_Driven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DeleteEmptySheet {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String path ="../maven/Empty2.xlsx";
		FileInputStream file = new FileInputStream(path);
		// open excel
		Workbook wb = WorkbookFactory.create(file);
		// create Sheet
		Sheet sh = wb.getSheet("SampleSheet");
		// create 2nd Row
		Row tgt = sh.getRow(0);
		sh.removeRow(tgt);
		//cretae cell
		Cell tgt_cell=tgt.getCell(1);
		 tgt.removeCell(tgt_cell);
		// Add Data 
		((Cell) tgt).setCellValue("TestNG");
		// save changes
		FileOutputStream out = new FileOutputStream(path);
		wb.write(out);

		}

}
