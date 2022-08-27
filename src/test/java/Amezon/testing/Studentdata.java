package Amezon.testing;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Studentdata {

	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Users\\mypc\\Desktop\\Selenium Components\\Files\\StudentDetails.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
		XSSFSheet sheet = xssfWorkbook.getSheet("Student");
		int rowCount= sheet.getPhysicalNumberOfRows();
		for (int i = 1; i < rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			int cellCount = row.getPhysicalNumberOfCells();
			for (int j = 0; j < cellCount; j++) {
			System.out.print("Name : "+sheet.getRow(i).getCell(j).getStringCellValue()+"Marks: "+sheet.getRow(i).getCell(j).getStringCellValue());
			System.out.println();
				}
			
				}
	}}


