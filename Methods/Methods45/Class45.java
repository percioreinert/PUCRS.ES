package Methods45;

public class Class45 {

    public static double soma(double x, int n) {
        double soma = 0;
        int j = 1, h = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0 || i == 1) {
                soma -= Math.pow(x, h) / j;
                h += 2;
                j += 2;
            } else {
                soma -= Math.pow(x, h) / j;
                h += 2;
                j += 2;
            }
        }
        return soma;
    }
}
