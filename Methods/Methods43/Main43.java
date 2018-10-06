package Methods43;

import java.util.Scanner;

public class Main43 {
    // Main
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe o número de termos: ");
        int n = in.nextInt();

        // Saída de dados
        System.out.println("A soma dos 'n' termos é " + Class43.soma(n));
    }
}
