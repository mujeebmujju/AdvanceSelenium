package Login;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import objectRepository.LoginPage;

public class TestCaseID extends BaseClass
{
	@Test
	public void TestCaseDescription()
	{
	
		LoginPage test=new LoginPage(driver);
		test.getLoginLink().click();
		test.getEmailTExtField().sendKeys("mujeeb");
		test.getPasswordTextField().sendKeys("9901040361");
		test.getLoginButton().click();
	}

}
