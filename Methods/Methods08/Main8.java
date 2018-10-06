package Methods08;

import java.util.Scanner;

public class Main8 {
    // Main
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.print("\f");

        // Entrada de dados
        System.out.println("Informe o número inteiro a ser invertido: ");
        int num = in.nextInt();

        // Chamada do método invert
        int inversao[] = Class8.invert(num);
        for (int i = 0; i < 4; i++) {
            System.out.print(inversao[i]);
        }
    }
}
