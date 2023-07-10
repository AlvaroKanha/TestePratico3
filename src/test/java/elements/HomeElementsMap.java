package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeElementsMap extends UtilsElements {
	@FindBy(xpath = "//a[contains(text(),'SPECIAL OFFER')]")
	protected WebElement btnSpecialOffer;
	
	@FindBy(xpath = "//*[@id='see_offer_btn']")
	protected WebElement btnSeeOffer;
	
	@FindBy(xpath = "//body/div[@class='loader'][contains(@style, 'display: block')]")
	protected WebElement loadingOn;

}
