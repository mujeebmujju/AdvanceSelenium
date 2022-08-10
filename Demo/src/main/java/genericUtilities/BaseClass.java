package genericUtilities;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
	public  WebDriver driver;
	
	@BeforeSuite
	public void launchbrowser()
	{
		//ChromeOptions options=new ChromeOptions();
		//options.addArguments("--headless");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		Reporter.log("Browser is launched",true);
		driver.manage().window().maximize();
		Reporter.log("Window is maximized",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@BeforeMethod
	public void Navigateapp()
	{
		driver.get("http://demowebshop.tricentis.com/");
		Reporter.log("Navigate to application",true);
		
	}
	
	@AfterMethod
	public void logoutOperation(ITestResult result) throws IOException
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			ScreenshotUtility.takingScreenshot(driver, result.getName());    //for taking scrrenshot if method use
		}
		System.out.println("Logout from the app");
		Reporter.log("Logged out from application",true);
	}
	
	@AfterSuite
	public void tearDownBrowser()
	{
		driver.quit();
		Reporter.log("Quitted the browser",true);
		
	}
	}
	

