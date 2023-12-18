# Store - Sistema de Gerenciamento de Loja com Spring Boot
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/moiseslx/store-springboot3-jpa/blob/main/LICENSE)

## Descrição do Projeto

Este projeto consiste em um sistema de gerenciamento para uma loja, implementado usando web services com Spring Boot e JPA / Hibernate. O objetivo principal é fornecer endpoints RESTful para quatro entidades principais: Categoria (Category), Pedido (Order), Produto (Product) e Usuário (User).

## Modelo de domínio
<div align="center">

![image](https://github.com/moiseslx/store-springboot3-jpa/assets/89827423/1dec22c3-125f-4c6f-9711-90778ed2e2c3)

</div>

## Tecnologias Utilizadas

- Spring Boot:
  - spring-boot-starter-web: Fornece funcionalidades para criar aplicativos web, incluindo suporte para RESTful APIs.
  - spring-boot-starter-data-jpa: Oferece suporte para o desenvolvimento de camadas de acesso a dados usando o Java Persistence API (JPA).
- Lombok: 
  - lombok: Uma biblioteca do Java que simplifica a codificação reduzindo a necessidade de escrever código boilerplate, como getters, setters e construtores.
- Banco de Dados:
  - h2: Um banco de dados em memória frequentemente usado em ambientes de desenvolvimento e teste.
- Testes:
  - spring-boot-starter-test: Fornece dependências para testes unitários e de integração em projetos Spring Boot.
- Java:
  - java.version: Versão do Java utilizada no projeto foi o Java 17 LTS
- Maven:
  - spring-boot-maven-plugin: Plugin do Maven para empacotar e executar aplicativos Spring Boot.
## Requisitos de Sistema

- [Java Development Kit (JDK) 17](https://www.azul.com/core-post-download/?endpoint=zulu&uuid=3e03aec7-3003-408a-bab7-93f530fec599)

## Configuração do Banco de Dados H2
```bash
# DATASOURCE
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password=
```

## Endpoints/APIs Disponíveis

A seguir estão alguns exemplos de endpoints/APIs disponíveis para interagir com o sistema. 
<div align="center">

| Categoria   | Descrição                                       | Método | Endpoint                            |
|-------------|-------------------------------------------------|--------|-------------------------------------|
| Categorias  | Recuperar todas as categorias                   | GET    | `http://localhost:8080/categories`  |
| Categorias  | Recuperar uma categoria por ID                  | GET    | `http://localhost:8080/categories/{id}` |
| Pedidos     | Recuperar todos os pedidos                      | GET    | `http://localhost:8080/orders`      |
| Pedidos     | Recuperar um pedido por ID                      | GET    | `http://localhost:8080/orders/{id}` |
| Produtos    | Recuperar todos os produtos                     | GET    | `http://localhost:8080/products`    |
| Produtos    | Recuperar um produto por ID                     | GET    | `http://localhost:8080/products/{id}` |
| Usuários    | Recuperar todos os usuários                     | GET    | `http://localhost:8080/users`       |
| Usuários    | Recuperar um usuário por ID                     | GET    | `http://localhost:8080/users/{id}`  |
| Usuários    | Inserir um novo usuário                         | POST   | `http://localhost:8080/users`       |
| Usuários    | Atualizar um usuário por ID                     | PUT    | `http://localhost:8080/users/{id}`  |
| Usuários    | Excluir um usuário por ID                       | DELETE | `http://localhost:8080/users/{id}`  |

</div>

<hr>

_Este projeto foi construído com base nos conhecimentos adquiridos no curso ["Java COMPLETO 2023 Programação Orientada a Objetos +Projetos"](https://www.udemy.com/course/java-curso-completo/) ministrado pelo [Prof. Nelio Alves](https://www.linkedin.com/in/nelio-alves/)._
