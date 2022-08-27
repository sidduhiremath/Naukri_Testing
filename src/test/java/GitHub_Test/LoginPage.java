package GitHub_Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPage {
@Test
public void Signin() throws InterruptedException, AWTException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\mypc\\Desktop\\Selenium Components\\Chrome\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://github.com/settings/profile");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='login_field']")).sendKeys("sidduhiremath");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Sidd@8546");
	Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@value='Sign in']")).click();
    Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html/body/div[1]/header/div[7]/details/summary/span[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.partialLinkText("profile")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"js-pjax-container\"]/div[2]/div/div[1]/div/div[2]/div[1]/div[1]/a/img")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"js-pjax-container\"]/div/div[2]/div[2]/div/div/div[2]/div[2]/dl/dd/div/details/summary/div")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//label[@for='avatar_upload']")).click();
	Thread.sleep(3000);
	
	//File Upload 
	Robot robot=new Robot();
    StringSelection stringSelection = new StringSelection("C:\\Users\\mypc\\Pictures\\2017-09\\1506324761139.jpg");
    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    clipboard.setContents(stringSelection, null);
    Thread.sleep(2000);
    robot.delay(250);
    robot.keyPress(KeyEvent.VK_ENTER);
    robot.keyRelease(KeyEvent.VK_ENTER);
    robot.keyPress(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_V);
    robot.keyRelease(KeyEvent.VK_V);
    robot.keyRelease(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_ENTER);
    robot.delay(150);
    robot.keyRelease(KeyEvent.VK_ENTER);

}
}
