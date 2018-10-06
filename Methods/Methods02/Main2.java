package Methods02;

import java.util.Scanner;
public class Main2 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // Loop
        double maior = 0; // Declaração do menor valor possível para iniciar a comparação.
        for (int i = 1; i <= 3; i++) {

            // Entrada de dados
            System.out.println("Informe o " + i + "º valor: ");
            double num = in.nextDouble();

            // Comparação usando o método maior
            maior = Class2.maior(num, maior);
        }
        // Saída de dados
        System.out.println("O maior valor dos 3 é " + maior);
    }
}
