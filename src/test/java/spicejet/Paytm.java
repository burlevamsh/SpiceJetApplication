package spicejet;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paytm {
	
	//div[@class='_3ac-']

		WebDriver driver;

		@BeforeAll
		public static void setup() {
			System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");


		}

		@Test
		public void test() {
			driver = new ChromeDriver();

			driver.get("https://paytm.com/");
			driver.manage().window().maximize();
			System.out.println(driver.findElements(By.tagName("a")).size());
			
			
			//class="_1XsR"
			WebElement footer= driver.findElement(By.xpath("//div[@class='_1XsR']")); 
			 System.out.println(footer.findElements(By.tagName("a")).size()) ;
		
		  int i = footer.findElements(By.tagName("a")).size(); System.out.println(i);
		 
			
			
			 
			 

		}
}
