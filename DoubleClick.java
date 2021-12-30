package Program;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GK096332\\Downloads\\chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//span[text()=\"Fashion\"]")).click();
		driver.get("https://www.amazon.in/gp/browse.html?node=6648217031&ref_=nav_cs_fashion");
		Thread.sleep(50);
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Women')][last()]"))).perform();
		driver.findElement(By.xpath("//a[text()=\"All Ethnic Wear\"]")).click();
		Thread.sleep(50);
		driver.navigate().to("https://www.amazon.in/Sanganeri-Kurti-Womens-Embroidred-Printed/dp/B083HKPS6T/ref=sr_1_1?pf_rd_i=1968253031&pf_rd_m=A1VBAL9TL5WCBF&pf_rd_p=2ab50b1d-3c28-4271-b8ec-b0ed5b688f0c&pf_rd_r=JWQAR9SZC6T9Y801MFK6&pf_rd_s=merchandised-search-5&pf_rd_t=30901&qid=1640753515&s=apparel&sr=1-1");
		WebElement element = driver.findElement(By.id("native_dropdown_selected_size_name"));
		Select dropdown = new Select (element);
		dropdown.selectByVisibleText("M");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(By.xpath("//a[text()=\" Add to Wish List \"]")).click();
		driver.close();

	}

}
