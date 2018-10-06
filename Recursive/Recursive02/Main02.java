package Recursive02;

import java.util.Scanner;

public class Main02 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // Entrada de dados
        System.out.println("Informe um número: ");
        int num = in.nextInt();

        // Saída de dados e chamada do método recursivo
        System.out.println("O somatório de " + num + " é " + Recursive02.soma(num));
    }
}
