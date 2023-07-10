package pages;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import elements.HomeElementsMap;

public class HomePage extends HomeElementsMap {
	public void validarHome () {
		PageFactory.initElements(driver, this);
		wait.until(ExpectedConditions.visibilityOf(loadingOn));
		wait.until(ExpectedConditions.invisibilityOf(loadingOn));
	}
	
	public void clicarBtnSpecialOffers() {
		wait.until(ExpectedConditions.elementToBeClickable(btnSpecialOffer));
		btnSpecialOffer.click();
		aguardaScroll ();
	}
}

