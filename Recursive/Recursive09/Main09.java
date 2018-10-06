package Recursive09;

import java.util.Scanner;

public class Main09 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // Entrada de dados
        System.out.println("informe o número de termos: ");
        int y = in.nextInt();
        System.out.println("Informe o valor a ser elevado: ");
        int x = in.nextInt();

        // Saída de dados e chamada do método recursivo
        System.out.println("A soma dos " + y + " termos é " + Recursive09.pot(x, y));
    }
}
