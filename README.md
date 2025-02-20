Olá! Este é um projeto baseado no mundo fictício de Naruto, onde os personagens são ninjas e são organizados em missões de acordo com suas capacidades.
O objetivo deste projeto é organizar os personagens através de um id, organizando suas particularidades.

Para isso, foi usado a IDE Eclipse, importando uma estrutura gerada através do SpringBoot sob configuração Project Maven, Linguagem Java versão 21, Springboot 3.3.8, Packaging Jar.

Há duas formas de operar o banco de dados deste projeto: dev, conectando ao banco de dados MySQL; test, utilizando dados de um banco provisório que será perdido após o fim do uso. Como configuração de fábrica, o projeto está em modo dev, podendo ser alterado no arquivo application.properties, substituindo a palavra "dev" por "test". Para utilização do dev e conexão com o banco de dados, é necessário criar uma database chamada crudninjas ou alterar o link na linha 3 como  novo nome de database, e também é preciso preencher os campos "root" e "password" com sua configuração MySQL
