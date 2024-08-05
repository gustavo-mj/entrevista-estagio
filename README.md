## Descrição

Resolução do desafio proposto.

```mermaid
classDiagram
    class Primos {
        +List<Integer> SeriePrimosLinear(int numero)
        +boolean ehPrimoRecursivo(int numero, int divisor)
        +List<Integer> SeriePrimosRecursivo(int numero)
        -void encontrarPrimosRecursivo(int numero, int atual, List<Integer> primos)
    }

    Primos : +List<Integer> SeriePrimosLinear(int numero)
    Primos : +boolean ehPrimoRecursivo(int numero, int divisor)
    Primos : +List<Integer> SeriePrimosRecursivo(int numero)
    Primos : -void encontrarPrimosRecursivo(int numero, int atual, List<Integer> primos)
