package pages;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import elements.CarrinhoComprasElementsMap;

public class CarrinhoComprasPage extends CarrinhoComprasElementsMap {

	public CarrinhoComprasPage() {
		PageFactory.initElements(driver, this);
	}

	public void removerProduto() {
		wait.until(ExpectedConditions.elementToBeClickable(btnRemove));
		btnRemove.click();

	}

	public void validarCarrinhoVazio() {
		Assert.assertTrue(webCartEmpty.isDisplayed());
	}

}
