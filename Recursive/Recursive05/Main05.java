package Recursive05;

import java.util.Scanner;

public class Main05 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // Entrada de dados
        System.out.println("Escreva a palavra a ser analisada: ");
        String texto = in.nextLine();

        // Saída de dados e chamada do método
        System.out.println(Recursive05.stringLength(texto));
    }
}
