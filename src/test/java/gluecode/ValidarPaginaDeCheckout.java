package gluecode;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DetalheProdutoPage;
import pages.HomePage;
import pages.SearchPage;

public class ValidarPaginaDeCheckout {
	HomePage home = new HomePage();
	SearchPage search = new SearchPage();
	DetalheProdutoPage detalhe = new DetalheProdutoPage();

	@When("clicar na lupa de pesquisa")
	public void clicar_na_lupa_de_pesquisa() {
		home.abrirPesquisa();
	}

	@And("informar produto correspondente ao banco de dados no campo busca")
	public void informar_produto_correspondente_ao_banco_de_dados_no_campo_busca() {
		home.pesquisarProduto();
		search.clicarProdutoPesquisado();
		detalhe.loadingPage();
		
	}

	@Then("visualiza o resultado da pesquisa com o produto informado")
	public void visualiza_o_resultado_da_pesquisa_com_o_produto_informado() {
		detalhe.validarDetalheProduto();
	}

}
