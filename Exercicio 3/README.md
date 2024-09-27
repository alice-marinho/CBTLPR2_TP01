# Exercício 03
Implemente o sistema representado pelo diagrama abaixo.
Obrigatório implementar uma classe de testes para todos os métodos das classes Staff e
Student.

## Diagrama de Classes

### Person 

| **Atributos** | **Tipo** |
|---------------|----------|
| - name        | String   |
| - address     | String   |

| **Métodos**                   |
|-------------------------------|
| + Person(name: String, address: String) |
| + getName(): String           |
| + getAddress(): String        |
| + setAddress(address: String): void |
| + toString(): String          |


----

### Student (extends Person)

| **Atributos** | **Tipo** |
|---------------|----------|
| - program     | String   |
| - year        | int      |
| - fee         | double   |

| **Métodos**                   | 
|-------------------------------|
| + Student(name: String, address: String, program: String, year: int, fee: double) |
| + getProgram(): String        |
| + setProgram(program: String): void | 
| + getYear(): int              |  
| + setYear(year: int): void    |     
| + getFee(): double            |  
| + setFee(fee: double): void    |
| + toString(): String          |


---

### Staff (extends Person)

| **Atributos** | **Tipo** |
|---------------|----------|
| - school      | String   |
| - pay         | double   |

| **Métodos**                   |
|-------------------------------|
| + Staff(name: String, address: String, school: String, pay: double) |
| + getSchool(): String        | 
| + setSchool(school: String): void | 
| + getPay(): double           |  
| + setPay(pay: double): void  |
| + toString(): String         |

