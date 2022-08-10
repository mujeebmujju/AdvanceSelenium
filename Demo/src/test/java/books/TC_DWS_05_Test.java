package books;

import static org.testng.Assert.assertEquals;

import java.io.IOException;


import org.testng.Reporter;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import genericUtilities.UtilityClass;
//import genericUtilities.UtilityClass;



public class TC_DWS_05_Test extends BaseClass{
	@Test
	public void Validate_Books_valid_credentials() throws IOException {
		Bookpage book = new Bookpage(driver);
		String ExpectedTitle = "Demo Web Shop. Books";
		UtilityClass utility = new UtilityClass();
		
		book.getBooksLink().click();
		Reporter.log("Clicked on link",true);
		assertEquals(ExpectedTitle,driver.getTitle(),"Test case Passed");
		

}
}