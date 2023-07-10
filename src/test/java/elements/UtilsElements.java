package elements;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import gluecode.TestRule;
import model.MassasModel;

public class UtilsElements {
	protected WebDriver driver = TestRule.getDiver();
	protected WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	protected MassasModel massa = TestRule.getMassa();

	protected void aguardaScroll() {
		wait.until(webdriver -> {
			long scrollInicio = (long) ((JavascriptExecutor) webdriver).executeScript("return window.pageYOffset;");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			long scrollFinal = (long) ((JavascriptExecutor) webdriver).executeScript("return window.pageYOffset;");
			return scrollInicio == scrollFinal;
		});
	}
}
