package Recursive03;

import java.util.Scanner;

public class Main03 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.print("\f");

        // Entrada de dados
        System.out.println("Informe o texto a ser invertido: ");
        String troca = in.nextLine();

        // Saída de dados e chamada do método
        System.out.println(Recursive03.invertR(troca, troca.length() - 1));
    }
}
