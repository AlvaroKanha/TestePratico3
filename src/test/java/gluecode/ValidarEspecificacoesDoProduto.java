package gluecode;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class ValidarEspecificacoesDoProduto {
	HomePage home = new HomePage();
	

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
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("visualiza o produto com suas especificacoes")
	public void visualiza_o_produto_com_suas_especificacoes() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}



}
