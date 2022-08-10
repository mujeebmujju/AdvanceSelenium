package Login;

import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import genericUtilities.ExcelUtility;
import objectRepository.LoginPage;

public class ReadingDataFromExcel_Test extends BaseClass {
	@Test(dataProvider = "test data", dataProviderClass =ExcelUtility.class)
public void readingData(String un, String pwd) {
	LoginPage login=new LoginPage(driver);
	login.getLoginLink().click();
	login.getEmailTExtField().sendKeys(un);
	login.getPasswordTextField().sendKeys(pwd);
	login.getLoginButton().click();

}
}
