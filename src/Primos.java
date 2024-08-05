
import java.util.ArrayList;
import java.util.List;

public class Primos {
    
    public List<Integer> SeriePrimosLinear(int numero) throws IllegalArgumentException {

        if (numero <= 1) {
            throw new IllegalArgumentException("A função só aceita N > 1");
        }

        List<Integer> primos = new ArrayList<>();

        for (int i = 2; i <= numero; i++) {
            boolean flag = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                primos.add(i);
            }
        }

        return primos;

    }

    public boolean ehPrimoRecursivo(int numero, int divisor) {
        if (divisor == 1) {
            return true;
        } else if (numero % divisor == 0) {
            return false;
        } else {
            return ehPrimoRecursivo(numero, divisor-1);
        }
    }

    public List<Integer> SeriePrimosRecursivo(int numero) throws IllegalArgumentException {

        if (numero <= 1) {
            throw new IllegalArgumentException("A função só aceita N > 1");
        }

        List<Integer> primos = new ArrayList<>();

        for (int i = 2; i <= numero; i++) {
            if (ehPrimoRecursivo(i, i-1)) {
                primos.add(i);
            }
        }

        return primos;

    }

}