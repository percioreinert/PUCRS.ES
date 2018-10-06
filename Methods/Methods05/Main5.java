package Methods05;

import java.util.Scanner;

public class Main5 {
    // Main
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.print("\f");

        // Entrada de dados
        int x[] = new int [2];
        int y[] = new int[2];
        for (int i = 0; i < 2; i++) {
            System.out.println("Informe o ponto \'x" + (i + 1) + "\': ");
            x[i] = in.nextInt();
        }

        for (int i = 0; i < 2; i++) {
            System.out.println("Informe o ponto \'y" + (i + 1) + "\': ");
            y[i] = in.nextInt();
        }

        // Chamada do método Euclidiana
        double dEuclid = Class5.euclidiana(x[0], x[1], y[0], y[1]);

        // Chamada do método Manhattan
        double dManhat = Class5.manhattan(x[0], x[1], y[0], y[1]);

        // Saída de dados
        System.out.println("A distância Euclidiana entre os pontos informados é " + dEuclid);
        System.out.println("A distância de Manhattan entre os pontos informados é " + dManhat);
    }
}
