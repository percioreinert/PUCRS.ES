package Methods44;

import java.util.Scanner;

public class Main44 {
    // Main
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // Entrada de dados
        System.out.println("Informe o valor de \'x\': ");
        double x = in.nextDouble();
        System.out.println("Informe o número de termos \'n\': ");
        int n = in.nextInt();

        // Chamada do método e saída de dados
        System.out.println("A soma dos termos é " + Class44.soma(x, n));
    }
}
