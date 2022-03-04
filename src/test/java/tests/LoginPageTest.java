package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.TestBase;

public class LoginPageTest extends TestBase {
	
	LoginPage loginPage;
	
	@BeforeMethod
	public void setUp() {
		initDriver();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
	}
	
	@Test
	public void loginTest() {
		loginPage.enterUserName("demo@techfios.com");
		loginPage.enterUserName("abc123");
		loginPage.clickSignInButton();
	
	}
	@Test
	public void pageTitleTest() {
		loginPage.enterUserName("demo@techfios.com");
		loginPage.enterUserName("abc123");
		loginPage.clickSignInButton();
		
		String expectedTitle = "Login - iBilling";
		String actualTitle = loginPage.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	

}
