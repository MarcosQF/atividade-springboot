# 📦 Projeto Spring Boot – Mensagem de Boas-Vindas

Este é um projeto simples em Spring Boot que expõe dois endpoints para retornar mensagens de boas-vindas.

## 🚀 Endpoints

### `GET /welcome`

Retorna uma mensagem padrão de boas-vindas.

**Exemplo de resposta:**
Seja bem vindo

### `GET /welcome/{name}`

Retorna uma mensagem personalizada de boas-vindas com o nome informado na URL.

**Parâmetro de caminho:**
- `name`: Nome da pessoa a ser saudada.

**Exemplo de requisição:**
GET /welcome/Ana

**Exemplo de resposta:**
Bem-vindo, Ana!

## ▶️ Como executar o projeto

### Pré-requisitos:
- Java 21 (ou compatível)
- Maven Wrapper incluído (`./mvnw` e `mvnw.cmd`)

### Executando o Projeto com o Maven Wrapper

* **Para Linux/macOS:**
    ```bash
    ./mvnw spring-boot:run
    ```

* **Para Windows:**
    ```bash
    mvnw.cmd spring-boot:run
    ```
