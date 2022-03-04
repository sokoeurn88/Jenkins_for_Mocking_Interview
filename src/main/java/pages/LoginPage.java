package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage  {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Element Library
	@FindBy(how = How.XPATH, using = "//*[@id=\"username\"]") WebElement UserName;
	@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]") WebElement Password;
	@FindBy(how = How.XPATH, using = "/html/body/div/div/div/form/div[3]/button") WebElement SigninButton;
	
	//Methods to interact with element
	public void enterUserName(String userName) {
		UserName.sendKeys(userName);
	}
	
	public void enterPassword(String password) {
		Password.sendKeys(password);
	}
	
	public void clickSignInButton() {
		SigninButton.click();
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
}
