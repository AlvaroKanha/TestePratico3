Feature: Cenario 3 Validar pagina de checkout

Scenario: Pesquisar do produto
Given acessar pagina Advantage Shopping
And informar produto correspondente ao banco de dados no campo busca
When selecionar o produto informado do resultado da pesquisa
Then visualiza o produto com suas especificacoes

Scenario: Adicionar produto pesquisado ao carrinho trocando a cor e quantidade
Given acessar pagina Advantage Shopping
And informar produto correspondente ao banco de dados no campo busca
And selecionar o produto informado do resultado da pesquisa
And  alterar a cor do produto para uma nao correspondente ao banco de dados
And alterar a quantidade de produtos
When clicar em Add to cart
And acessar a pagina de checkout
Then visualiza a soma dos precos totalizado dos produtos
And atualiza o banco de dados na cor selecionada no checkout 