package gluecode;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DetalheProdutoPage;
import pages.HomePage;

public class ValidarEspecificacoesDoProduto {
	HomePage home = new HomePage();
	DetalheProdutoPage produto = new DetalheProdutoPage();
	
	

	@Given("acessar pagina Advantage Shopping")
	public void acessar_pagina_advantage_shopping() {
	   home.validarHome();
	}
	@When("clicar em Special Offers")
	public void clicar_em_special_offers() {
	    home.clicarBtnSpecialOffers();
	}
	@And("clicar em See Offers")
	public void clicar_em_see_offers() {
	    home.clicarBtnSeeOffer();
	}
	@Then("visualiza o produto com suas especificacoes")
	public void visualiza_o_produto_com_suas_especificacoes(){
		produto.loadingPage();
	    produto.validarDetalheProduto() ;
	}



}
