package gluecode;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DetalheProdutoPage;
import pages.HomePage;

public class ValidarAlteracaoDeCorDoProdutoNoCarrinho {
	HomePage home = new HomePage();
	DetalheProdutoPage produto = new DetalheProdutoPage();

	@When("selecionar cor do produto")
	public void selecionar_cor_do_produto() {
		produto.validarCorSelecionada();
	}

	@And("clicar em Add to cart")
	public void clicar_em_add_to_cart() {
		produto.clicarBtnAdicionarAoCarrinho();
	}

	@Then("visualiza o produto no carrinho com a cor selecionada")
	public void visualiza_o_produto_no_carrinho_com_a_cor_selecionada() {
		produto.validarCorCarrinho();
	}

}
