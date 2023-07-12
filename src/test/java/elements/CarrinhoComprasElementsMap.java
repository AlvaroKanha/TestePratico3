package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarrinhoComprasElementsMap extends UtilsElements {

	@FindBy(xpath = "//h3[contains(text() ,'SHOPPING CART')]")
	protected WebElement webPageCart;

	@FindBy(xpath = "//a[contains(@class, 'remove')]")
	protected WebElement btnRemove;

	@FindBy(xpath = "//*[@id=\"shoppingCart\"]/div/label")
	protected WebElement webCartEmpty;

}
