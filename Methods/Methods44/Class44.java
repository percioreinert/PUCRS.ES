package Methods44;

public class Class44 {

    // Método soma
    public static double soma(double x, int n) {
        int j = 1;
        double soma = 0;
        for (int i = 1; i <= n; i++) {
            soma += Math.pow(x, i) / j;
            j += 4;
        }
        return soma;
    }
}
