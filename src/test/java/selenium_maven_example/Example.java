package selenium_maven_example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import selenium_maven.Action;
import selenium_maven.FireFoxDriver;
import selenium_maven.string;

public class Example {
private static final String SHIFT = null;
@Test
	public void selmav() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        Thread.sleep(100);
        WebElement element=driver.findElement(By.name("txtUsername"));
        element.sendKeys("Admin");
        Thread.sleep(100);
        driver.findElement(By.name("txtPassword")).sendKeys("admin123");
        Thread.sleep(100);
        driver.findElement(By.name("Submit")).click();
        }
}
