package Methods42;

import java.util.Scanner;

public class Main42 {
    // Main
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // Entrada de dados
        System.out.println("Informe o a quantidade de termos \'n\': ");
        int n = in.nextInt();

        // Chamada do método soma
        double soma = Class42.soma(n);

        // Saída de dados
        System.out.println("A soma dos termos é " + soma);
    }
}
