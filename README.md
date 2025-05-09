# **Backend - Country Guesser**

Este é o backend para o protótipo do "Country Guesser", um jogo onde o objetivo é adivinhar um país com base em dicas fornecidas pelo sistema. Este protótipo foi desenvolvido parauma avaliação da disclipina de Backend da UNISATC.


## **Tecnologias Utilizadas**

- **Java 24**
- **Spring Boot 3.4.5**
- **Spring Web**
- **RestTemplate** (para consumir a API externa)
- **JSON** (para comunicação entre o front-end e o back-end)

## **Pré-requisitos**
-JDK 24 ou superior.
-Maven para dependências.

**Passos para executar**:

Clone este repositório:

https://github.com/SEU_USUARIO/country-guesser-backend.git

Navegue até o diretório do projeto:

*cd country-guesser-backend*

Compile e rode o projeto usando o Maven:

*mvn spring-boot:run*

O serviço estará rodando em http://localhost:8000.

## **Endpoints**

### **1. `/jogo/gerar`** (GET)

**Descrição**: Este endpoint gera um país aleatório e retorna as informações sobre ele, incluindo nome, região, capital, moeda e idiomas falados.

**Resposta (Exemplo)**:
{
  "nome": "Botswana",
  "regiao": "Africa",
  "capital": "Gaborone",
  "moeda": "Botswana pula",
  "idiomas": ["English", "Tswana"]
}

### **2. `/jogo/verificar`** (POST)

**Descrição**:  
Este endpoint recebe a tentativa do usuário de adivinhar o país e retorna uma dica caso o usuário erre. Se o usuário acertar, será retornada uma mensagem de sucesso. Caso contrário, o sistema fornece uma dica, que pode ser sobre a **capital**, **moeda** ou **região** do país.

**Parâmetros**:

- **resposta** (query parameter): Nome do país que o usuário tenta adivinhar.

**Formato da requisição**:

- **Método**: `POST`
- **URL**: `/jogo/verificar?resposta={nome_do_pais}`
  
Exemplo de requisição para tentar adivinhar "Botswana":

POST http://localhost:8000/jogo/verificar?resposta=Botswana
