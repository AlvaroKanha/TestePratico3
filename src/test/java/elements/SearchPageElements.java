package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPageElements extends UtilsElements{

	@FindBy(xpath = "//p[contains(text(), 'HP PAVILION 15Z TOUCH LAPTOP')]/..")
	protected WebElement resultSearch;
	
}
