package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import elements.DetalheProdutoElementsMap;

public class DetalheProdutoPage extends DetalheProdutoElementsMap {

	public void validarDetalheProduto() {

		Assert.assertEquals(nomeProduto.getText(), massa.getNAME_PRODUCT());
		Assert.assertEquals(specCustomResult.getText(), massa.getCUSTUMIZATION());
		Assert.assertEquals(specDisplayResult.getText(), massa.getDISPLAY());
		Assert.assertEquals(specResolutionResult.getText(), massa.getDISPLAY_RESOLUTION());
		Assert.assertEquals(specSizeResult.getText(), massa.getDISPLAY_SIZE());
		Assert.assertEquals(specMemResult.getText(), massa.getMEMORY());
		Assert.assertEquals(specSystemResult.getText(), massa.getOPERATION_SYSTEM());
		Assert.assertEquals(specProcessorResult.getText(), massa.getPROCESSOR());
		Assert.assertEquals(specTouchResult.getText(), massa.getTOUCHSCREEN());
		Assert.assertEquals(specWeightResult.getText(), massa.getWEIGHT());
	}

	public void loadingPage(WebElement campo) {
		PageFactory.initElements(driver, this);
		wait.until(ExpectedConditions.visibilityOf(campo));
	}

	public void loadingPage() {
		PageFactory.initElements(driver, this);
		wait.until(ExpectedConditions.visibilityOf(nomeProduto));
	}

	public void validarCorSelecionada() {
		loadingPage();
		
		if (!massa.getCOLOR().equals(colorGray.getAttribute("title"))) {
			Assert.fail("Cor não correspondente");
		}
		colorGray.click();
	}

	public void clicarBtnAdicionarAoCarrinho() {
		wait.until(ExpectedConditions.elementToBeClickable(btnAddToCart));
		btnAddToCart.click();
		wait.until(ExpectedConditions.visibilityOf(checkCart));
	}

	public void validarCorCarrinho() {
		wait.until(ExpectedConditions.elementToBeClickable(btnCart));
		btnCart.click();
		Assert.assertEquals(massa.getCOLOR(), checkColorCart.getAttribute("title"));
	}
	

}
