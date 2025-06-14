package Generic_Library;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exccel_Utility {

	public static String getSelectedData(String Sheet,int i,int j) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(IConstant.excelPath);
		Workbook  w = WorkbookFactory.create(fis);
		Sheet s = w.getSheet(Sheet);
		Row r = s.getRow(0);
		Cell c = r.getCell(0);
		String data = c.getStringCellValue();
		System.out.println(data);
		return data;


	}

	public static String[][] getAllData(String sheet) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream(IConstant.excelPath);
		Workbook  w = WorkbookFactory.create(fis);
		Sheet s = w.getSheet(sheet);
		int rowSize = s.getPhysicalNumberOfRows();
		int cellSize = s.getRow(0).getPhysicalNumberOfCells();
		String[][] data = new String[rowSize][cellSize];
		for(int i=0;i<rowSize;i++) {
			for(int j=0;j<cellSize;j++) {
				data[i][j] = s.getRow(i).getCell(j).getStringCellValue();

			}

		}
		return data;

	}
}
