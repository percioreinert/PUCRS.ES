package Recursive08;

import java.util.Scanner;

public class Main08 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("\f");

        // Entrada de dados
        System.out.println("Informe o número de termos: ");
        int num = in.nextInt();

        // Saída de dados e chamada do método recursivo
        System.out.println("A soma dos " + num + " termos é " + Recursive08.soma(num));
    }
}
