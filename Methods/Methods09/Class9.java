package Methods09;

public class Class9 {

    // Método maior
    public static double maior(double nota[]) {
        double maior = 0;
        for (int i = 0; i < 2; i++) {
            if (nota[i] > maior) maior = nota[i];
        }
        return maior;
    }

    // Método média ponderada
    public static double mediaPonderada(double nt[]) {
        nt[0] /= 2;
        nt [1] /= 4;
        nt[2] /= 4;
        double mPond = nt[0] + nt[1] + nt[2];;
        return mPond;
    }
}
