package pages;

import org.openqa.selenium.support.ui.ExpectedConditions;

import elements.SearchPageElements;

public class SearchPage extends SearchPageElements {
	public void clicarProdutoPesquisado() {
		wait.until(ExpectedConditions.elementToBeClickable(resultSearch));
		resultSearch.click();

	}
}
