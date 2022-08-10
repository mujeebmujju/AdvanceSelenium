package Login;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class ReadExcel_Test {
	
	public static Object[] data() throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream file = new FileInputStream("./test_data/data.xlsx");
		Workbook workbook = WorkbookFactory.create(file);
		Sheet sheet = workbook.getSheet("Sheet1");
		int rowCount = sheet.getPhysicalNumberOfRows();
		int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();
		Object[][] obj = new Object[rowCount][cellCount];
		for (int row = 0; row < rowCount; row++) {
			Row actRow = sheet.getRow(row);
			for (int cell = 0; cell < actRow.getLastCellNum(); cell++) {
				obj[row][cell] = actRow.getCell(cell).getStringCellValue();
			}
		}
		return obj;
	}

}
