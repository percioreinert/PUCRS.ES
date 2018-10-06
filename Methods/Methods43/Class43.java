package Methods43;

public class Class43 {

    public static double soma(int n) {
        double soma = 0;
        int j = 1;
        for (int i = 1; i <= n; i++) {
            soma += i / j;
            j += 2;
        }
        return soma;
    }
}
