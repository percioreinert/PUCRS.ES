package Recursive07;

import java.util.Scanner;

public class Main07 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);


        System.out.print("\f");

        // Entrada de dados
        System.out.println("Informe o número de termos a serem somados: ");
        double num = in.nextDouble();

        // Saída de dados e chamada do método recursivo
        System.out.println("A soma dos " + num + " termos é " + Recursive07.soma(num));
    }
}
