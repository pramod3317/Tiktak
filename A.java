package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class A {

	WebDriver driver;
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AD\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void testCase1() {

		String title="Flipcard";
		String exptitleOfThepage =	driver.getTitle();
		Assert.assertEquals(exptitleOfThepage,title,"title is not matched");
	}
	@AfterTest
	public void endSee() {
		driver.close();
		driver.quit();
	}









}


