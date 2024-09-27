# Exercício 01

Implemente uma classe chamada `Author` para servir de modelo para autores de livros. A classe deve seguir as seguintes especificações:

## Atributos:
- `name` (String): Nome do autor (não pode ser alterado após a criação).
- `email` (String): Email do autor.
- `gender` (char): Gênero do autor. Aceita apenas 'm' (masculino) ou 'f' (feminino). Este valor não pode ser alterado após a criação.

## Construtor:
- O construtor deve inicializar os 3 atributos com base nos parâmetros fornecidos:
  ```java
  Author(String name, String email, char gender)

## Métodos:
- `getName()`: Retorna o nome do autor.
- `getEmail()`: Retorna o email do autor.
- `setEmail(String email)`: Atualiza o email do autor.
- `getGender()`: Retorna o gênero do autor.
- `toString()`: Retorna uma string com o seguinte formato: `Author[name=?,email=?,gender=?]`

## Classe de Teste:
- Testar o construtor.
- Verificar o método toString().
- Testar o setter de email.
- Testar os getters de name, email e gender.
