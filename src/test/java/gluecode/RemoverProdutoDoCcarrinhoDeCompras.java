package gluecode;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CarrinhoComprasPage;
import pages.DetalheProdutoPage;

public class RemoverProdutoDoCcarrinhoDeCompras {

	DetalheProdutoPage detalhe = new DetalheProdutoPage();
	CarrinhoComprasPage carrinho = new CarrinhoComprasPage();

	@Given("clicar no carrinho de compras")
	public void clicar_no_carrinho_de_compras() {
		detalhe.irParaCarrinho();
	}

	@When("selecionar opcao REMOVE")
	public void selecionar_opcao_remove() {
		carrinho.removerProduto();
	}

	@Then("visualizo meu carrinho de compras vazio")
	public void visualizo_meu_carrinho_de_compras_vazio() {
		carrinho.validarCarrinhoVazio();
	}

}
