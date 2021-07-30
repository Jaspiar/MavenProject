package test;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Test1 {

	
	@Test
	public void register() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://magento.com");
		driver.findElement(By.id("gnav_557")).click();
		driver.findElement(By.id("register")).click();
		
		driver.findElement(By.id("firstname")).sendKeys("Natarajan");
		driver.findElement(By.id("lastname")).sendKeys("Ramanathan");
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.className("fa-question-circle"))).perform();
		
		driver.findElement(By.id("email_address")).sendKeys("jaspiarsingh@yahoo.com");
		driver.findElement(By.id("self_defined_company")).sendKeys("YesMSystems");
		
	
		Select cp = new Select(driver.findElement(By.id("company_type")));
		cp.selectByIndex(2);
		cp.selectByValue("development");
		cp.selectByVisibleText("Provides deployment, customization and integration services to merchant.");
		
		
		Select role = new Select(driver.findElement(By.id("individual_role")));
		role.selectByValue("technical/developer");
		
		Select country = new Select(driver.findElement(By.id("country")));
		country.selectByIndex(10);
		
		driver.findElement(By.id("password")).sendKeys("Test@123");
		driver.findElement(By.id("password-confirmation")).sendKeys("Test@123");
		
		
		driver.quit();
		
		
	}
		@Test(priority=1)
		public void login() throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.get("htpp://magento.com");
			driver.findElement(By.xpath("//*[@id=\"gnav_557\"]/span/span/span/span")).click();
			
			driver.findElement(By.id("email")).sendKeys("jaspiarsingh@icloud.com");
			driver.findElement(By.id("pass")).sendKeys("test@123");
			driver.findElement(By.id("send2")).click();
			Thread.sleep(5000);
			
			driver.quit();
			
		}
}

	

