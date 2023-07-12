Feature: Cenario 2 Validar alteracao de cor do produto no carrinho

Scenario: Alterar cor do produto
Given acessar pagina Advantage Shopping
And clicar em Special Offers
And clicar em See Offers
When selecionar cor do produto
And clicar em Add to cart
Then visualiza o produto no carrinho com a cor selecionada
