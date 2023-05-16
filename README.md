
# Sistema de Gerenciamento de Rede de Cinemas

Este projeto tem como objetivo implementar um sistema de gerenciamento de banco de dados para uma rede de cinemas. O sistema permite o gerenciamento de informações sobre cada cinema franqueado da rede, suas salas, os filmes em cartaz, as sessões de exibição, os ingressos vendidos e a bomboniere.

## Tecnologias Utilizadas

O sistema será desenvolvido utilizando as seguintes tecnologias:

-   Java: linguagem de programação orientada a objetos amplamente utilizada no desenvolvimento de sistemas empresariais.
-   H2: banco de dados em memória utilizado para desenvolvimento e testes.
-   JPA: API para mapeamento objeto-relacional que permite o uso de classes Java simples para representar dados do banco de dados.
-   Hibernate: framework para persistência de dados que implementa a especificação JPA.

## Funcionalidades

O sistema permite o gerenciamento de informações sobre cada cinema franqueado da rede, suas salas, os filmes em cartaz, as sessões de exibição, os ingressos vendidos e a bomboniere.

## Modelagem de dados

A modelagem de dados será realizada utilizando a linguagem de modelagem UML (Unified Modeling Language) e o diagrama de entidade-relacionamento (ER).

As entidades envolvidas no controle de cada cinema da rede são:

-   Cinema: entidade que representa um cinema franqueado da rede. Contém informações como CNPJ, nome fantasia, endereço, telefone para contato, número de salas e capacidade de lotação de cada sala.
-   Sala: entidade que representa uma sala de exibição em um cinema. Contém informações como numeração, tipo de som e número de assentos disponíveis.
-   Filme: entidade que representa um filme exibido em um cinema. Contém informações como título em português, título original, se são legendados ou dublados, sinopse, diretor(es), elenco principal, gênero e classificação indicativa.
-   Sessão: entidade que representa uma sessão de exibição de um filme em uma sala de um cinema. Contém informações como a sala em que será exibido, a data e o horário, e se é do tipo normal ou 3D.
-   Ingresso: entidade que representa um ingresso vendido para uma sessão de um filme em uma sala de um cinema. Contém informações como o tipo de ingresso (meia entrada ou inteira), o filme, a data, o horário de exibição, a localização do assento e o preço pago pelo ingresso.
-   Produto: entidade que representa um produto comercializado na bomboniere do cinema. Contém informações como nome, descrição e preço.
-   Venda: entidade que representa uma venda realizada na bomboniere do cinema. Contém informações como os produtos vendidos, a data e o valor total da venda.


## Funcionalidades

As principais funcionalidades do sistema serão:

-   Cadastro de Cinemas
-   Cadastro de Salas
-   Cadastro de Filmes
-   Cadastro de Sessões
-   Venda de Ingressos
-   Venda de Produtos na Bomboniere
-   Controle de Fluxo de Clientes e Vendas
-   Geração de Relatórios de Faturamento

## Considerações Finais

Este documento tem como objetivo apresentar a proposta de desenvolvimento de um Sistema de Gerenciamento de Banco de Dados para uma rede de cinemas. O sistema será desenvolvido utilizando as tecnologias Java, H2, JPA e Hibernate.

Foram identificadas as entidades envolvidas no controle de cada cinema da rede, como o CNPJ, o nome fantasia, o endereço, o telefone para contato, o número de salas e a capacidade de lotação de cada uma, bem como as salas para a exibição de filmes, os filmes com informações como título em português, título original, se são legendados ou dublados, sinopse, diretor(es), elenco principal, gênero e classificação indicativa, as sessões que possuem informações como a sala em que serão exibidos, a data e o horário, além da venda de ingressos e produtos na bomboniere do cinema.

O sistema terá a capacidade de armazenar todas essas informações, além de permitir a consulta e geração de relatórios para o gerenciamento do cinema, como o fluxo de clientes para cada filme exibido, se estão realizando mais vendas combinadas ou só de ingressos e o fluxo de saída de cada item da bomboniere, além do faturamento mensal e anual.

O uso das tecnologias Java, H2, JPA e Hibernate possibilitará a criação de um sistema robusto e escalável, com acesso rápido às informações e facilidade de manutenção.

Em resumo, este Sistema de Gerenciamento de Banco de Dados será uma ferramenta essencial para a gestão eficiente de uma rede de cinemas, permitindo o controle das informações e otimização dos processos internos do negócio.

## Licença

Este projeto está licenciado sob a licença MIT.
