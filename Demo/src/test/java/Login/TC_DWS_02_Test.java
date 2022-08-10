package Login;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import genericUtilities.UtilityClass;
import objectRepository.LoginPage;
import objectRepository.SearchProduct;

public class TC_DWS_02_Test extends BaseClass
{
	@Test
	
	public void search_product() throws IOException
	{
		LoginPage Login=new LoginPage(driver);   
		SearchProduct sc=new SearchProduct(driver);
		String ExpectedTitle="Demo Web Shop1";
		UtilityClass utility=new UtilityClass();
		Login.getLoginLink().click();
		Reporter.log("Clicked on Login button",true);
		
		assertEquals(false, true);
		
		
		Login.getEmailTExtField().sendKeys(utility.propertyFileReader("Username"));
		assertEquals(utility.propertyFileReader("Username"), Login.getEmailTExtField().getAttribute("value"), "Email Adderss is not proper");
		Reporter.log("Succesfully entered email adderss",true);
		
		Login.getPasswordTextField().sendKeys(utility.propertyFileReader("Password"));
		assertEquals(utility.propertyFileReader("Password"), Login.getPasswordTextField().getAttribute("value"), "password is not proper");
		Reporter.log("Succesfully entered Password",true);
		
		Login.getLoginButton().click();
		Reporter.log("Succesfully Logged in to the application",true);
		assertNotEquals(ExpectedTitle, driver.getTitle(),"Test case failed");
		
		sc.getSearchbar().sendKeys(utility.propertyFileReader("Book"));
		sc.getSearchButton().click();
		
	}
	
	}


