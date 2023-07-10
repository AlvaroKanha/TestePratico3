package gluecode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dao.MassasDao;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import model.MassasModel;

public class TestRule {
	private static WebDriver driver;
	private static String PATH_DRIVER = "src/test/resources/drivers/chromedriver.exe";
	private static String URL = "https://advantageonlineshopping.com/#/";
	private static MassasModel massa;

	@Before
	public void initialConfigs() {
		System.setProperty("webdriver.chrome.driver", PATH_DRIVER);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to(URL);
	}

	@After
	public void finishTest() {
		driver.close();
		driver.quit();
	}

	public static WebDriver getDiver() {
		return driver;
	}

	public static MassasModel getMassa() {
		return massa;
	}

	public static void updateMassa() {
		MassasDao massas = new MassasDao();
		massas.update(massa);
		carregarMassas();
	}

	private static void carregarMassas() {
		MassasDao massas = new MassasDao();
		for (MassasModel massa : massas.read()) {
			TestRule.massa = massa;
		}
	}
}
