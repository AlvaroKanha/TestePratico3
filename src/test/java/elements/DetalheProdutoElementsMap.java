package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DetalheProdutoElementsMap extends UtilsElements {

	@FindBy(xpath = "//div[@id='Description']/h1")
	protected WebElement nomeProduto;

	@FindBy(xpath = "//label[contains(@class, 'attr')][text()='CUSTOMIZATION']/../label[contains(@class, 'value')]")
	protected WebElement specCustomResult;

	@FindBy(xpath = "//label[contains(text(), 'DISPLAY')]/../label[contains(@class, 'value')]")
	protected WebElement specDisplayResult;

	@FindBy(xpath = "//label[contains(text(), 'DISPLAY RESOLUTION')]/../label[contains(@class, 'value')]")
	protected WebElement specResolutionResult;

	@FindBy(xpath = "//label[contains(text(), 'DISPLAY SIZE')]/../label[contains(@class, 'value')]")
	protected WebElement specSizeResult;

	@FindBy(xpath = "//label[contains(text(), 'MEMORY')]/../label[contains(@class, 'value')]")
	protected WebElement specMemResult;

	@FindBy(xpath = "//label[contains(text(), 'OPERATING SYSTEM')]/../label[contains(@class, 'value')]")
	protected WebElement specSystemResult;

	@FindBy(xpath = "//label[contains(text(), 'PROCESSOR')]/../label[contains(@class, 'value')]")
	protected WebElement specProcessorResult;

	@FindBy(xpath = "//label[contains(text(), 'TOUCHSCREEN')]/../label[contains(@class, 'value')]")
	protected WebElement specTouchResult;

	@FindBy(xpath = "//label[contains(text(), 'WEIGHT')]/../label[contains(@class, 'value')]")
	protected WebElement specWeightResult;

	@FindBy(xpath = "//*[@id=\"bunny\"][contains(@class, 'GRAY')]")
	protected WebElement colorGray;

	@FindBy(xpath = "//*[@id=\"productProperties\"]/div[4]/button")
	protected WebElement btnAddToCart;

	@FindBy(xpath = "//input[@name = 'quantity']")
	protected WebElement quantity;

	@FindBy(xpath = "//*[@id=\"checkOutPopUp\"]")
	protected WebElement btnCheckout;

	@FindBy(xpath = "//*[@id=\"Description\"]/h2")
	protected WebElement valueProduct;

	@FindBy(xpath = "//label[contains(text() , 'TOTAL')]/span")
	protected WebElement valueTotalProduct;

	@FindBy(xpath = "//div[contains(@class, 'plus') and attribute::*[contains(., '+')]]")
	protected WebElement btnPlus;

	@FindBy(xpath = "//*[@id=\"product\"]/td[2]/a/label[2]/span")
	protected WebElement colorCart;

	@FindBy(xpath = "//*[@id=\"product\"]/td[2]/a/label[2]/span")
	protected WebElement checkCart;

	@FindBy(xpath = "//*[@id=\"shoppingCartLink\"]")
	protected WebElement btnCart;
}
