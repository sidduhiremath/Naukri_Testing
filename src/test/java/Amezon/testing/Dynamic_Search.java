package Amezon.testing;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Search {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mypc\\Desktop\\Selenium Components\\Chrome 96\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
			driver.get("https://www.google.com/");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium");
			String s="Selenium ide";
			Thread.sleep(3000);
			List<WebElement> values=driver.findElements(By.className("wM6W7d"));
			for(WebElement v:values) {
				Thread.sleep(2000);
				if(v.getText().equalsIgnoreCase(s)) {
				Thread.sleep(2000);
					v.click();
					Thread.sleep(1000);
					break;	
				}	
			}
			Thread.sleep(2000);
			driver.close();
			System.out.println("Completed");
			}
	}
