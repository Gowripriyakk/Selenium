package Program;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ScrollUpAndDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GK096332\\Downloads\\chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//span[text()=\"Fashion\"]")).click();
		Thread.sleep(500);
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Women')][last()]"))).perform();
		driver.findElement(By.xpath("//a[text()=\"All Ethnic Wear\"]")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)", "");
		driver.findElement(By.xpath("//span[text()=\"Salwar suits\"]")).click();
		Thread.sleep(500);
		driver.navigate().forward();
		driver.findElement(By.xpath("//span[text()=\"Women's Cotton Kurta With Pant Set\"]")).click();
		driver.close();
		

	}

}
