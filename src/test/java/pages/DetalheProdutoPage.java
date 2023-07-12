package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import elements.DetalheProdutoElementsMap;
import gluecode.TestRule;

public class DetalheProdutoPage extends DetalheProdutoElementsMap {

	public DetalheProdutoPage() {
		PageFactory.initElements(driver, this);
	}

	String corCompra;
	Double valorProduto;
	int qnt;

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
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//div[@ng-show='firstImageToShow']/span[contains(@class, '" + massa.getCOLOR() + "')]")));
		
		if (!massa.getCOLOR().equals(driver
				.findElement(By.xpath("//div[@ng-show='firstImageToShow']/span[contains(@class, '" + massa.getCOLOR() + "')]"))
				.getAttribute("title"))) {
			Assert.fail("Cor não correspondente");
		}
		
		driver.findElement(By.xpath("//div[@ng-show='firstImageToShow']/span[contains(@class, '" + massa.getCOLOR() + "')]"))
		.click();
	}

	public void clicarBtnAdicionarAoCarrinho() {
		wait.until(ExpectedConditions.elementToBeClickable(btnAddToCart));
		btnAddToCart.click();
		wait.until(ExpectedConditions.visibilityOf(checkCart));
	}

	public void validarCorCarrinho() {
		wait.until(ExpectedConditions.elementToBeClickable(btnCart));
		btnCart.click();
		Assert.assertEquals(massa.getCOLOR(), checkCart.getText());
	}

	public void trocarCor() {
		String corMassa = massa.getCOLOR();

		List<String> listaCor = new ArrayList<String>(6);
		listaCor.add("BLUE");
		listaCor.add("BLACK");
		listaCor.add("GRAY");
		listaCor.add("PURPLE");
		listaCor.add("RED");
		listaCor.add("YELLOW");

		if (listaCor.contains(corMassa)) {
			listaCor.remove(corMassa);
		}
		int rnd = new Random().nextInt(listaCor.size());
		corCompra = listaCor.get(rnd);

		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//div[@ng-show='firstImageToShow']/span[contains(@class, '" + corCompra + "')]")));
		driver.findElement(By.xpath("//div[@ng-show='firstImageToShow']/span[contains(@class, '" + corCompra + "')]"))
				.click();
	}

	public void salvaCorBase() {
		massa.setCOLOR(corCompra);
		TestRule.updateMassa();
	}

	public void trocarQuantidade() {
		qnt = new Random().nextInt(5) + 1;
		if (qnt != 1) {
			for (int i = 2; i <= qnt; i++) {
				wait.until(ExpectedConditions.elementToBeClickable(btnPlus));
				btnPlus.click();
			}
		}
	}

	public void acessarCheckout() {
		wait.until(ExpectedConditions.elementToBeClickable(btnCheckout));
		btnCheckout.click();

	}

	public void validarValorProdutos() {
		valorProduto = Double.parseDouble(valueProduct.getText().replace("$", ""));
		Double valorTotal = Double.parseDouble(valueTotalProduct.getText().replace("$", "").replace(",", ""));

		Assert.assertEquals(valorProduto * qnt, valorTotal, 2);

	}

	public void irParaCarrinho() {
		wait.until(ExpectedConditions.elementToBeClickable(btnCart));
		btnCart.click();
	}
}
