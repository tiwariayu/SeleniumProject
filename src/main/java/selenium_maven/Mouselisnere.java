package selenium_maven;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouselisnere {
	@Test
	public void add() {
	String baseUrl="http://www.facebook.com/";
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();

	driver.get(baseUrl);
	WebElement txtUsername=driver.findElement(By.id("email"));
	Actions builder=new Actions(driver);
	Action seriesofActons=builder
	.moveToElement(txtUsername)
	.click()
	.keyDown(txtUsername, Keys.SHIFT)
	.sendKeys(txtUsername,"hello")
	.keyUp(txtUsername, Keys.SHIFT)
	.doubleClick(txtUsername)
	.contextClick()
	.build();
	seriesofActons.perform();
	}
}

