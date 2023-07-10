package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarrinhoComprasElementsMap extends UtilsElements{
	
	//melhorar xpath
	@FindBy(xpath = "//h3[contains(text() ,'SHOPPING CART')]")
	protected WebElement webPageCart;
}
