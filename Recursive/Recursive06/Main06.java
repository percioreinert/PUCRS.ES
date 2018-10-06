package Recursive06;

import java.util.Scanner;

public class Main06 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // Entrada de dados
        System.out.println("Informe a posição do número de Fibonacci que deseja ver: ");
        int num = in.nextInt();

        // Saída de dados e chamada do método recursivo
        System.out.println("O " + num + "º número de Fibonacci é " + Recursive06.fibo(num));
    }
}
