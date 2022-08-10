package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.BaseClass;

public class SearchProduct 
{
	
		public SearchProduct(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		@FindBy(id= "small-searchterms")
		private WebElement Searchbar;
		
		@FindBy(xpath="//input[@type='submit']")
		private WebElement SearchButton;

		public WebElement getSearchbar() 
		{
			return Searchbar;
		}


		public WebElement getSearchButton() 
		{
			return SearchButton;
		}

		
		
		

}
