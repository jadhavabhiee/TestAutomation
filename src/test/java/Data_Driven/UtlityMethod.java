package Data_Driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtlityMethod {
	public String getDataFromProperty(String key) throws IOException {
		FileInputStream file = new FileInputStream("../maven/Sample.property");
		Properties p = new Properties();
		p.load(file);
		return p.getProperty(key);

	}

	public String getDataFromExcel(String Sheetname, int rownum, int cellnum) throws IOException {
		FileInputStream file = new FileInputStream("../maven/Actitime.xlsx");
		Workbook book = null;
		try {
			book = WorkbookFactory.create(file);
		} catch (EncryptedDocumentException e) {

		}
		Sheet sh = book.getSheet(Sheetname);
		String Email = sh.getRow(rownum).getCell(cellnum).toString();
		String Password=sh.getRow(rownum).getCell(cellnum).toString();

		return sh.getRow(rownum).getCell(cellnum).toString();

	}

}