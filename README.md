## Descrição

Resolução do desafio proposto.

```mermaid
classDiagram
    class Primos {
        +List<Integer> SeriePrimosLinear(int numero)
        +boolean ehPrimoRecursivo(int numero, int divisor)
        +List<Integer> SeriePrimosRecursivo(int numero)
    }

    class Fibonacci {
        +int FibonacciRecursivo(int numero)
        +int FibonacciLinear(int numero)
    }

    class App {
        +main(args: String[])
    }

    App --> Fibonacci
    App --> Primos
