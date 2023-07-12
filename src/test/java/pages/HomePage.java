package pages;

import org.openqa.selenium.By;
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

	public void inserirProdutoPesquisa() {
		wait.until(ExpectedConditions.visibilityOf(searchImputText));
		searchImputText.sendKeys(massa.getNAME_PRODUCT());
	}

	public void clicarProdutoPesquisado() {
		String space = " ";

		searchImputText.sendKeys(space);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class = 'top6Products']//a[contains(@class, 'product')][2]")));

		searchImputText.sendKeys(space);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class = 'top6Products']//a[contains(@class, 'product')]")));

		searchImputText.sendKeys(space);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class = 'top6Products']//a[contains(@class, 'product')]//p[text() = 'HP PAVILION 15Z TOUCH LAPTOP']/..")));

		searchImputText.sendKeys(space);
		wait.until(ExpectedConditions.elementToBeClickable(resultSearch));
		resultSearch.click();

	}

}
