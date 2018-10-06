package Methods42;

public class Class42 {

    // Método soma
    public static double soma(int n) {
        double soma = 0;
        for (int i = 1; i <= n; i++) {
            soma += 1.0 / i;
        }
        return soma;
    }
}
