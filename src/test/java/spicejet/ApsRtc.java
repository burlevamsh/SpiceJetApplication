package spicejet;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApsRtc {

	WebDriver driver;

	@BeforeAll
	public static void setup() {
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");


	}

	@Test
	public void test() {
		driver = new ChromeDriver();

		driver.get("https://www.apsrtconline.in/oprs-web/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("VIJAYAWADA");;
		driver.findElement(By.xpath("//input[@id='toPlaceName']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//input[@id='txtJourneyDate']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'28')]")).click();
		driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
		
	}
}
