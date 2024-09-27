# Exercício 2
Um livro pode ser escrito por um ou muitos autores, por esta razão a classe Book deve
ter um array de autores, conforme o modelo abaixo:

## Diagrama de Classes

### Author
| **Atributos** | **Tipo** |
|---------------|----------|
| - name        | String   |
| - email       | String   |
| - gender      | char     |

| **Métodos**                       |
|-----------------------------------|
| + Author(name: String, email: String, gender: char) |     
| + getName(): String               | 
| + getEmail(): String              |  
| + getGender(): char               |                                 
| + setName(name: String): void     |                                 
| + setEmail(email: String): void   |                                 
| + setGender(gender: char): void   |                                 
| + toString(): String "[Author[name=?, email=?, gender=?]" |                                 


---

### Book
| **Atributos** | **Tipo** |
|---------------|----------|
| - name        | String   |
| - authors     | Author[]  |
| - price       | double    |
| - qty         | int       |

| **Métodos**                       |
|-----------------------------------|
| + Book(name: String, authors: Author[], price: double) |          
| + Book(name: String, authors: Author[], price: double, qty: int) | 
| + getPrice(): double              |                                
| + setPrice(price: double): void    |                                 
| + getQty(): int                   |                                 
| + setQty(qty: int): void          |                                 
| + toString(): String |                                 
| + getAuthors(): Author[]          |                                 
| + getAuthorNames(): String        |                                 


### Notas
- O construtor deve receber um array de autores
- Uma vez que o livro é instanciado o seu autor não pode ser adicionado ou removido.
- O método `toString()` deve retornar a seguinte resposta:
`"Book[name=?,authors={Author[name=?,email=?,gender=?],......},price=?,qty=?]"`.
Você deve:
- Escrever um código para a classe `Book`, você deve reutilizar o código do `Author`
escrito no exercício 1
- Escrever uma classe de teste, chamada `TestBook`, para testar a classe `Book`.

---

## Exemplo de Código

```java
// Crie o aloque o array de autores
Author[] authors = new Author[2];
authors[0] = new Author("Autor 01", "autor01@somewhere.com.br", 'm');
authors[1] = new Author("Autor 02", "autor02@nowhere.com.br", 'm');

// Declarar e alocar uma instância de um book
Book testBook = new Book("Java for Dummy", authors, 19.99, 99);
System.out.println(testBook); // toString()

