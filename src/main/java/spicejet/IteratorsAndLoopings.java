package spicejet;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IteratorsAndLoopings {

	WebDriver driver;

	@BeforeAll
	public static void setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	/*
	 * @Test public void test() { driver = new ChromeDriver();//Inovoke the browser
	 * 
	 * driver.get("https://paytm.com/");
	 * driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 * 
	 * //driver.findElement(By.xpath("//div[@class='_3ac-']")).click();
	 * 
	 * //*[@id="wallet-container-new qr-bg-white"]/qr-code-login/div[2]/div[2]/div[
	 * 3]
	 * 
	 * //driver.findElement(By.
	 * xpath("//*[@id='wallet-container-new qr-bg-white']/qr-code-login/div[2]/div[2]/div[3]"
	 * )).click();
	 * 
	 * driver.findElement(By.
	 * xpath("//div[@class='mainContainer _1DB1']//div[6]//div[1]//a[1]")).click();
	 * 
	 * Actions actions=new Actions(driver);
	 * 
	 * actions.moveToElement(driver.findElement(By.
	 * xpath("//input[@placeholder='Search for a Product , Brand or Category']"))).
	 * click().keyDown(Keys.SHIFT).sendKeys("hellow").doubleClick().build().perform(
	 * );
	 * 
	 * actions.moveToElement(driver.findElement(By.xpath("//div[@class='_3fM-']"))).
	 * build().perform();
	 * 
	 * }
	 */

	/*
	 * @Test public void testing() { driver = new ChromeDriver();//Inovoke the
	 * browser
	 * 
	 * driver.get("https://paytm.com/"); List<WebElement>
	 * links=driver.findElements(By.tagName("a"));
	 * System.out.println("Total links="+links.size());
	 * 
	 * }
	 */
	/*
	 * @Test public void testing123() { driver = new ChromeDriver();//Inovoke the
	 * browser
	 * 
	 * driver.get("https://paytm.com/"); driver.manage().window().maximize();
	 * 
	 * List<WebElement> links=driver.findElements(By.tagName("a"));
	 * System.out.println("Total links="+links.size()); //div[@class='_1XsR']
	 * //div[@class='_1XsR'] WebElement
	 * links1=driver.findElement(By.xpath("//div[@class='_1XsR']"));
	 * 
	 * 
	 * List<WebElement> l1=links1.findElements(By.tagName("a"));
	 * System.out.println(l1.size()); }
	 */

	/*
	 * @Test public void Testing() { driver = new ChromeDriver();
	 * driver.get("https://www.cognizant.com/");
	 * 
	 * driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); WebElement
	 * footer=driver.findElement(By.
	 * xpath("//body[@id='bodyId']/div[contains(@class,'off-canvas-wrapper')]/div[contains(@class,'off-canvas-wrapper-inner')]/div[contains(@class,'off-canvas-content')]/div[contains(@class,'pt2')]/div[contains(@class,'small-12 medium-9 columns')]/div[2]"
	 * )); WebElement coloumndriver=footer.findElement(By.
	 * xpath("//div[contains(@class,'small-12 medium-9 columns')]//div[2]//div[1]"))
	 * ; System.out.println(coloumndriver.findElements(By.tagName("a")).size());
	 * 
	 * 
	 * //String clicklinktab=Keys.chord(Keys.CONTROL,Keys.ENTER); //
	 * coloumndriver.findElements(By.tagName("a")).get(1).sendKeys(clicklinktab);
	 * //opening single link
	 * 
	 * for( int i=0;i<coloumndriver.findElements(By.tagName("a")).size();i++) {
	 * String clicklinktab=Keys.chord(Keys.CONTROL,Keys.ENTER);
	 * coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clicklinktab); }
	 * 
	 * 
	 * 
	 * Set<String> ids=driver.getWindowHandles(); Iterator<String>
	 * it=ids.iterator();
	 * 
	 * String parentids=it.next(); String childids=it.next();
	 * driver.switchTo().window(childids); // driver.switchTo().alert().getText();
	 * 
	 * System.out.println(driver.getTitle()); driver.switchTo().window(parentids);
	 * 
	 * 
	 * driver.getWindowHandle(); Set<String> abc=driver.getWindowHandles();
	 * Iterator<String> it=abc.iterator(); while(it.hasNext()) {
	 * driver.switchTo().window(it.next()); System.out.println(driver.getTitle()); }
	 * 
	 * }
	 */

	/*
	 * @Test public void Testing() { driver = new ChromeDriver();
	 * driver.get("https://jqueryui.com/droppable/");
	 * 
	 * driver.switchTo().frame(driver.findElement(By.xpath(
	 * "//iframe[@class='demo-frame']")));//selecting whole iframe //
	 * driver.findElement(By.cssSelector("#draggable")).click();
	 * 
	 * Actions action=new Actions(driver); WebElement
	 * source=driver.findElement(By.id("draggable")); WebElement
	 * target=driver.findElement(By.id("droppable")); action.dragAndDrop(source,
	 * target).build().perform(); }
	 */

	/*
	 * @Test public void Testing() { driver = new ChromeDriver();
	 * driver.get("D:\\visuvalstudio examples\\Tablexp.html");
	 * 
	 * WebElement a = driver.findElement(By.cssSelector("#td22"));
	 * 
	 * WebElement footer = driver.findElement(By.xpath("//*[@id=\'Tab\']"));
	 * 
	 * System.out.println(footer.findElements(By.xpath("//*[@id='td*2']")).size());
	 * 
	 * System.out.println(a.getText());
	 * 
	 * }
	 */

//#td22

}
