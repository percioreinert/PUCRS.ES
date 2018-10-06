package Methods07;

import java.util.Scanner;

public class Main7 {
    // Main
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.print("\f");

        // Entrada de dados
        System.out.println("Informe a aresta \'a\': ");
        double a = in.nextDouble();
        System.out.println("Informe a aresta \'b\': ");
        double b = in.nextDouble();
        System.out.println("Informe a aresta \'c\': ");
        double c = in.nextDouble();

        // Chamada do método diagonal
        double diag = Class7.diagonal(a, b, c);

        // Saída de dados
        System.out.println("O valor da diagonal do paralelepípedo é " + diag);
    }
}
