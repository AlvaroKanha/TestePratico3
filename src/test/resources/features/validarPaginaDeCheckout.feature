Feature: bla bla bla

Scenario: Pesquisar produto
Given acessar pagina Advantage Shopping 
When clicar na lupa de pesquisa
And informar produto correspondente ao banco de dados no campo busca
Then visualiza o resultado da pesquisa com o produto informado

Scenario: 
Given acessar pagina Advantage Shopping
And informar produto correspondente ao banco de dados no campo busca
When selecionar o produto informado do resultado da pesquisa
Then visualiza o produto com suas especificacoes

Scenario:
Given acessar pagina Advantage Shopping
And selecionar o produto informado do resultado da pesquisa
And  alterar a cor do produto para uma nao correspondente ao banco de dados
And alterar a quantidade de produtos
When clicar em Add to cart
And acessar a pagina de checkout
Then visualiza a soma dos preços totalizado dos produtos
And atualiza o valor do banco de dados na cor selecionada no checkout 