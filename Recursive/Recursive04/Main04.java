package Recursive04;

import java.util.Scanner;

public class Main04 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // Entrada de dados
        System.out.println("Informe o texto a ser processado: ");
        String troca = in.nextLine();

        // Saída de dados e chamada do método
        System.out.println(Recursive04.invertR(troca, troca.length() - 1));
    }
}
