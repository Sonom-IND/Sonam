package pomcollector;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amiya Acharya\\workspace\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		//driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://mylti.lntinfotech.com/#/");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@type='email']")).clear();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sonom.patro@lntinfotech.com");
		driver.findElement(By.xpath("//input[@id='idSIButton9']")).click();
		driver.findElement(By.id("passwordInput")).clear();
		driver.findElement(By.id("passwordInput")).sendKeys("Gls89350@0720");
		driver.findElement(By.xpath("//*[@id='submitButton']")).click();
		driver.findElement(By.id("idBtn_Back")).click();
		System.out.println(driver.getTitle());
		WebElement dia = driver.findElement(By.xpath("//span[@class='closeIconChat']"));
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(dia));
		dia.click();
		WebElement talentCentralLink = driver.findElement(By.xpath("//*[contains(text(),'GO TO TALENT CENTRAL')]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeAsyncScript("arguments[0].scrollIntoView();", talentCentralLink);
		js.executeAsyncScript("window.scrollBy(0,1000)");
		//WebDriverWait wait1 = new WebDriverWait(driver, 10);
		//wait1.until(ExpectedConditions.visibilityOf(talentCentralLink));
		//Actions a = new Actions(driver);
		//a.moveToElement(talentCentralLink).click().build().perform();
		talentCentralLink.click();
		System.out.println(driver.getTitle());

		}


}
