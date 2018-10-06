package Methods45;

import java.util.Scanner;

public class Main45 {
    // Main
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // Entrada de dados
        System.out.println("Informe o número de termos: ");
        int n = in.nextInt();
        System.out.println("Informe o valor de 'x': ");
        double x = in.nextDouble();

        // Chamada do método soma e saída de dados
        System.out.println("A soma dos 'n' termos é " + Class45.soma(x, n));
    }
}
