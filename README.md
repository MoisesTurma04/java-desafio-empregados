# DESAFIO: Empregados OO

Você deve fazer um programa para ler os dados de um departamento, que inclui seu endereço e seus empregados. Em seguida, você deverá mostrar na tela um relatório de folha de pagamento.

Para resolver este problema, você deverá implementar as entidades. O método `payroll()` da classe `Department` é responsável por retornar o valor total da folha de pagamento do departamento.

**ATENÇÃO:**
Seu programa principal deve manter uma variável para um objeto do tipo `Department`. Crie um método estático `showReport` para receber como argumento este objeto `Department` e, a partir dele, exibir todo o relatório.

**ATENÇÃO:**
A para a estrutura de objetos que você deverá criar na memória:
## Diagrama de classes
```mermaid
classDiagram
    class Department {
        - String name
        - int payDay
        + addEmployee(employee : Employee): void
        + removeEmployee(employee : Employee): void
        + payroll(): 
    }
    class Address {
        - String email
        - String phone
    }
    class Employee {
        - String name
        - double salary
    }
    class Program {
        + main(args: String[]): void
    }
    Program --> Department : utiliza
    Department --> Employee : * employees
    Department --> Address : 1 address
