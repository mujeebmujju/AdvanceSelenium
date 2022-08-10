package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

import genericUtilities.BaseClass;

public class LoginPage extends BaseClass
{
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(linkText="Log in")
	private WebElement LoginLink;
	
	@FindBy(id="Email")
	private WebElement EmailTExtField;

	@FindBy(name="Password")
	private WebElement PasswordTextField;

	@FindBy(xpath="//input[@value='Log in']")
	private WebElement LoginButton;

	public WebElement getLoginLink() {                          // Right click goto source click on generate getters and setters
		return LoginLink;
	}

	public WebElement getEmailTExtField() {
		return EmailTExtField;
	}

	public WebElement getPasswordTextField() {
		return PasswordTextField;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}
	
	

}
