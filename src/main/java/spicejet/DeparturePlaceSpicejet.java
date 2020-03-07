package spicejet;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeparturePlaceSpicejet {

	WebDriver driver;

	@BeforeAll
	public static void setup() {
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}
	String expected="Cheap Air Tickets Online, International Flights to India, Cheap International Flight Deals | SpiceJet Airlines";

	@Test
	public void test() {
		driver = new ChromeDriver();

		driver.get("https://www.spicejet.com/default.aspx");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

// driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).sendKeys(Keys.ARROW_DOWN);

// From depature drop down
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).sendKeys("Chennai");

// To dropdown
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).sendKeys("hyderabad");

		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_view_date1']")).click();
// Selecting depature date
		driver.findElement(By.xpath("//a[@class='ui-state-default'][contains(text(),'20')]")).click();

		driver.findElement(By.xpath("//*[@id='divpaxinfo']")).click();

// Adult dropdown
		Select sel = new Select(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_Adult']")));
		sel.selectByIndex(5);
// Adult dropdown using css selector

		Select sel1 = new Select(driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_Adult")));
		sel1.selectByIndex(5);

// child dropdown
		Select sel2 = new Select(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_Child']")));
		sel2.selectByIndex(3);
// Infant dropdown
		Select sel3 = new Select(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_Infant']")));
		sel3.selectByIndex(3);

//selecting  currency
		Select selectcurl = new Select(
				driver.findElement(By.xpath("//*[@id='ctl00_mainContent_DropDownListCurrency']")));
		selectcurl.selectByIndex(3);
//Search button
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_btn_FindFlights']")).click();
		
		String actual=driver.getTitle();
		System.out.println(" ***"+actual+"****");
		assertEquals(expected, actual);

	}
}
