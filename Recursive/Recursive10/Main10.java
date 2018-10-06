package Recursive10;

import java.util.Scanner;

public class Main10 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // Entrada de dados
        System.out.println("Informe \'x\': ");
        int x = in.nextInt();
        System.out.println("Informe \'y\': ");
        int y = in.nextInt();

        // Saída de dados e chamada do método recursivo
        System.out.println("O produto de " + x + " por " + y + " é " + Recursive10.produto(x, y));
    }
}
