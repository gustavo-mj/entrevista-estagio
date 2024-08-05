public class Fibonacci {
    
    public int FibonacciRecursivo(int numero) throws IllegalArgumentException {

        if (numero < 0) {
            throw new IllegalArgumentException("A função não aceita números negativos.");
        }

        return switch (numero) {
            case 0 -> 0;
            case 1 -> 1;
            default -> FibonacciRecursivo(numero - 1) + FibonacciRecursivo(numero - 2);
        };
    }

    public int FibonacciLinear(int numero) {

        if (numero < 0) {
            throw new IllegalArgumentException("A função não aceita números negativos.");
        } else if ((numero == 0) || (numero == 1)) {
            return numero;
        }

        int anterior = 0;
        int atual = 1;
        int proximo;

        for (int i = 2; i <= numero; i++) {
            proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }

        return atual;

    }

}
