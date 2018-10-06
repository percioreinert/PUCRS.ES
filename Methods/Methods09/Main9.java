package Methods09;

import java.util.Scanner;

public class Main9 {
    // Main
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // Entrada de dados
        double nota[] = new double [3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Informe a " + (i + 1) + "ª nota:" );
            nota[i] = in.nextDouble();
        }

        // Chamada do método maior
        double nt[] = new double[3];
        nt[0] = Class9.maior(nota);
        for (int i = 1; i < 3; i++) {
            if (nota[i] != nota[0]) nt[i] = nota[i];
        }

        // Chamada do método média ponderada
        double mediaPond = Class9.mediaPonderada(nt);

        // Saída de dados
        System.out.println("A média ponderada é " + mediaPond);
    }
}
