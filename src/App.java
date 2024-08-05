import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        Fibonacci fibonacci = new Fibonacci();
        Primos primos = new Primos();

        try {
            System.out.print("Digite um número para calcular Fibonacci:");
            int n = scanner.nextInt();
            System.out.println("Fibonacci linear: " + fibonacci.FibonacciLinear(n));
            System.out.println("Fibonacci recursivo: " + fibonacci.FibonacciRecursivo(n));
            System.out.print("Digite um número para listar os primos:");
            n = scanner.nextInt();
            System.out.println("Primos linear: " + primos.SeriePrimosLinear(n));
            System.out.println("Primos recursivo: " + primos.SeriePrimosRecursivo(n));
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }

        
    }
}
