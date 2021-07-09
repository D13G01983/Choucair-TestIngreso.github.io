package EjercicioAutomatizacionJavaSelenium;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.*;


public class EjercicioChoucair {
	
	private WebDriver driver;
	
	@Before
	
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium Webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.choucairtesting.com/");
		
		Actions actEmpleos = new Actions(driver);
		
		WebElement empleos =  driver.findElement(By.xpath("//*[@id=\"menu-item-550\"]/a"));
		
		actEmpleos.moveToElement(empleos).click().build().perform(); /* Mueve el mouse hasta la opción Empleos y da click*/
		
	}
	
	@Test
	
	public void testChoucairPage() {
		
		WebElement searchopEmpleos = driver.findElement(By.name("Empleos"));
		searchopEmpleos.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	@After
	
	public void tearDown() {
		
		driver.quit();
	}


}
