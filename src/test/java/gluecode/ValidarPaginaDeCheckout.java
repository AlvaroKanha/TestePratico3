package gluecode;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CarrinhoComprasPage;
import pages.DetalheProdutoPage;
import pages.HomePage;

public class ValidarPaginaDeCheckout {
	HomePage home = new HomePage();
	DetalheProdutoPage detalhe = new DetalheProdutoPage();
	CarrinhoComprasPage carrinho = new CarrinhoComprasPage();

	@Given("informar produto correspondente ao banco de dados no campo busca")
	public void informar_produto_correspondente_ao_banco_de_dados_no_campo_busca() {
		home.abrirPesquisa();
		home.inserirProdutoPesquisa();
	}

	@Given("selecionar o produto informado do resultado da pesquisa")
	public void selecionar_o_produto_informado_do_resultado_da_pesquisa() {
		home.clicarProdutoPesquisado();
	}

	@Given("alterar a cor do produto para uma nao correspondente ao banco de dados")
	public void alterar_a_cor_do_produto_para_uma_nao_correspondente_ao_banco_de_dados() {
		detalhe.trocarCor();
	}

	@Given("alterar a quantidade de produtos")
	public void alterar_a_quantidade_de_produtos() {
		detalhe.trocarQuantidade();
	}

	@When("acessar a pagina de checkout")
	public void acessar_a_pagina_de_checkout() {
		detalhe.acessarCheckout();
	}

	@Then("visualiza a soma dos precos totalizado dos produtos")
	public void visualiza_a_soma_dos_pre_os_totalizado_dos_produtos() {
		detalhe.validarValorProdutos();
	}

	@Then("atualiza o banco de dados na cor selecionada no checkout")
	public void atualiza_o_banco_de_dados_na_cor_selecionada_no_checkout() {
		detalhe.salvaCorBase();
	}
}
