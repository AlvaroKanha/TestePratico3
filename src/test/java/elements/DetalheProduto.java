package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DetalheProduto {

	@FindBy(xpath = "//a[contains(text(),'SPECIAL OFFER')]")
	protected WebElement btnSpecialOffer;
}
