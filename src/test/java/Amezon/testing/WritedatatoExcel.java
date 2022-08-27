package Amezon.testing;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class WritedatatoExcel {

//	public static void writeData() throws Exception {
		public static void main(String[] args) throws Exception {
			XSSFWorkbook xssfWorkbook = new XSSFWorkbook();
			XSSFSheet xssfSheet = xssfWorkbook.createSheet("Student");
			xssfSheet.createRow(0);
			xssfSheet.getRow(0).createCell(0).setCellValue("Name");
			xssfSheet.getRow(0).createCell(1).setCellValue("Marks");
			xssfSheet.createRow(1);
			xssfSheet.getRow(1).createCell(0).setCellValue("Siddu");
			xssfSheet.getRow(1).createCell(1).setCellValue("12");
			xssfSheet.createRow(2);
			xssfSheet.getRow(2).createCell(0).setCellValue("Progress");
			xssfSheet.getRow(2).createCell(1).setCellValue("0");
			File file = new File("C:\\Users\\mypc\\Desktop\\Selenium Components\\Files\\StudentDetails.xlsx");
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			xssfWorkbook.write(fileOutputStream);
			System.out.println("Done");
		}

}
