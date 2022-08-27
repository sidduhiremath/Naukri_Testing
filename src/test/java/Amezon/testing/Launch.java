package Amezon.testing;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Launch {
@Test
public void google() throws InterruptedException, Exception {
	//Launching the browser
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\mypc\\Desktop\\Selenium Components\\Chrome\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
		Thread.sleep(2000);
//		Set<String> ids=driver.getWindowHandles();
//		String a=driver.getWindowHandle();
//		for(String id:ids ) {
//			if(!(id.equalsIgnoreCase(a))) {
//				driver.switchTo().window(id);
//				driver.close();
//			}
//		}
//		driver.switchTo().window(a);
//		driver.findElement(By.xpath("//div[text()='Login']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("siddalingayya7785@gmail.com");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("Sidd@8546");
//		Thread.sleep(2000);
//	    driver.findElement(By.xpath("//button[text()='Login']")).click();
//	    Thread.sleep(2000);
//	    driver.findElement(By.xpath("//div[@class='crossIcon chatBot chatBot-ic-cross']")).click();
//		driver.findElement(By.xpath("//em[@title='Upload']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@name='Fjb56fnotys359[UEEuQChJFqQ66Y]']")).click();
//	    Thread.sleep(3000);
//	    driver.findElement(By.xpath("//div[text()='UPDATE PROFILE']")).click();
//	    Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id='attachCV']")).click();
//		Thread.sleep(2000);
		
		
		//File Upload 
//		Robot robot=new Robot();
//	    StringSelection stringSelection = new StringSelection("C:\\Users\\mypc\\Pictures\\2017-09\\siddu.jpg");
//	    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
//	    clipboard.setContents(stringSelection, null);
//	    Thread.sleep(2000);
//	    robot.delay(250);
//	    robot.keyPress(KeyEvent.VK_ENTER);
//	    robot.keyRelease(KeyEvent.VK_ENTER);
//	    robot.keyPress(KeyEvent.VK_CONTROL);
//	    robot.keyPress(KeyEvent.VK_V);
//	    robot.keyRelease(KeyEvent.VK_V);
//	    robot.keyRelease(KeyEvent.VK_CONTROL);
//	    robot.keyPress(KeyEvent.VK_ENTER);
//	    robot.delay(150);
//	    robot.keyRelease(KeyEvent.VK_ENTER);
//	    
		
		
		
		driver.close();
		}

}
