# API em Spring para CRUD
Este é um projeto de API desenvolvido em Spring, que implementa operações básicas de CRUD (Create, Read, Update, Delete) para manipulação de recursos.

## Pré-requisitos
JDK 8 ou superior instalado<br>
Maven 3.x instalado<br>
IDE Java (recomendado: IntelliJ IDEA, Eclipse, SpringToolSuite4)

## Endpoints
A seguir estão os endpoints disponíveis na API:

GET /usuario: Retorna todos os recursos.<br>
POST /usuario: Cria um novo recurso.<br>
PUT /usuario: Atualiza um recurso existente.<br>
DELETE /usuario/{id}: Deleta um recurso existente pelo ID.

### Formato dos Dados
Os dados são trocados no formato JSON. <br>Exemplo de um recurso:

json

{<br>
  "nome": "Exemplo",<br>
  "login": "exemplo1",<br>
  "email":"email@exemplio.com",<br>
  "senha":"password123"<br>
}
