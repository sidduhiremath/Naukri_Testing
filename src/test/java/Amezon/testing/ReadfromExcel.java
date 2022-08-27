package Amezon.testing;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadfromExcel {
	public static void main(String[] args) throws Exception {
		List<WebElement> list = null;
		File file = new File("C:\\Users\\mypc\\Desktop\\Selenium Components\\Files\\DynamicSearchEXcel.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
		XSSFSheet sheet = xssfWorkbook.getSheet("DynamicSearch");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mypc\\Desktop\\Selenium Components\\Chrome 96\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("Directed");
		System.out.println("Entered");
		int rowCount= sheet.getPhysicalNumberOfRows();
		for (int i = 1; i < rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			System.out.println("1st iter");
			int cellCount = row.getPhysicalNumberOfCells();
			for (int j = 0; j < cellCount; j++) {	
				System.out.println("URL");
				if((sheet.getRow(i).getCell(j).getStringCellValue()).contains("https://")) {
				driver.get(sheet.getRow(i).getCell(j).getStringCellValue());// url
				Thread.sleep(2000);
				System.out.println(driver.getTitle());
				}
				else  {
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(sheet.getRow(i).getCell(j).getStringCellValue()); // automation
				Thread.sleep(2000);
				list = driver.findElements(By.xpath("//*[@class='wM6W7d']"));
				System.out.println(list.size());				
				Thread.sleep(3000);
				for (WebElement ele : list) {

					Thread.sleep(2000);

					if ((ele.getText()).equalsIgnoreCase("automation testing")) {
						Thread.sleep(1000);
						ele.click();
						break;
					
				}
				Thread.sleep(2000);
			}}
				}
	}
		driver.close();
		fileInputStream.close();
}}