package Utility_Class;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {

	public static void Screenshot(WebDriver driver) throws IOException {
		
		TakesScreenshot ss = (TakesScreenshot) driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\ASUS\\OneDrive\\Desktop\\ss\test.jpg");
		FileHandler.copy(source, destination);
	}
	
	public static String FetchData_ExcelSheet(String sheetname, int row, int cell) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\ASUS\\Downloads\\data.xlsx");
		String data = WorkbookFactory.create(fis).getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}
}
