package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageElementsMap extends UtilsElements {

	@FindBy(xpath = "//a[contains(text(),'SPECIAL OFFER')]")
	protected WebElement btnSpecialOffer;

	@FindBy(xpath = "//button[@id='see_offer_btn']/..")
	protected WebElement btnSeeOffer;

	@FindBy(xpath = "//body/div[@class='loader'][contains(@style, 'display: block')]")
	protected WebElement loadingOn;

	@FindBy(xpath = "//a[@title='SEARCH']")
	protected WebElement btnSearch;

	@FindBy(xpath = "//div[@id='search']//input")
	protected WebElement searchImputText;

	@FindBy(xpath = "//p[contains(text(), 'HP PAVILION 15Z TOUCH LAPTOP')]/..")
	protected WebElement resultSearch;

}
