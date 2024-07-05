package genericUtilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFIleUtility {
	public String readDataFromExcelfile(String sheetNO, int rowNo, int cellNo) throws EncryptedDocumentException, IOException
	{
	FileInputStream fis= new FileInputStream(".\\src\\test\\resources\\CONTACTS.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	String result = wb.getSheet(sheetNO).getRow(rowNo).getCell(cellNo).toString();
	return result;
	}
}
