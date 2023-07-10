package pages;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import elements.HomePageElementsMap;

public class HomePage extends HomePageElementsMap {

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public void validarHome() {
		wait.until(ExpectedConditions.visibilityOf(loadingOn));
		wait.until(ExpectedConditions.invisibilityOf(loadingOn));
	}

	public void clicarBtnSpecialOffers() {
		wait.until(ExpectedConditions.elementToBeClickable(btnSpecialOffer));
		btnSpecialOffer.click();
		aguardaScroll();
	}

	public void clicarBtnSeeOffer() {
		wait.until(ExpectedConditions.elementToBeClickable(btnSeeOffer));
		btnSeeOffer.click();
	}

	public void abrirPesquisa() {

		wait.until(ExpectedConditions.elementToBeClickable(btnSearch));
		btnSearch.click();
	}

	public void pesquisarProduto() {
		wait.until(ExpectedConditions.visibilityOf(searchImputText));
		searchImputText.sendKeys(massa.getNAME_PRODUCT());
	}

}
