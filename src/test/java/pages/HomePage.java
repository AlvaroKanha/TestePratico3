package pages;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import elements.HomePageElementsMap;

public class HomePage extends HomePageElementsMap {
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
	
	public void clicarBtnSeeOffer() {
		wait.until(ExpectedConditions.elementToBeClickable(btnSeeOffer));
		btnSeeOffer.click();
	}
	
	
}

