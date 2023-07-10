Feature: bla bla bla bla

Scenario: Remover produto do carrinho
Given acessar pagina Advantage Shopping 
And clicar em Special Offers
And clicar em See Offers
And clicar em Add to cart
And clicar no carrinho de compras
When selecionar opcao REMOVE
Then visualizo meu carrinho de compras vazio
 