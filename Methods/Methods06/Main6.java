package Methods06;

import java.util.Scanner;

public class Main6 {
    // Main
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.print("\f");

        // Entrada de dados
        double fahren[] = new double[30];
        double celsius[] = new double[30];
        for (int i = 0; i < 30; i++) {
            System.out.println("Informe a " + (i + 1) + "ª temperatura em graus Fahrenheit: ");
            fahren[i] = in.nextDouble();

            // Chamada do método convert
            celsius[i] = Class6.convert(fahren[i]);

            // Saída de dados
            System.out.println("A temperatura, em graus Celsius, é " + celsius[i] + "º.");
        }
    }
}
