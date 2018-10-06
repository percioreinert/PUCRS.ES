package Methods04;

import java.util.Scanner;

public class Main4 {
    // Main
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("\f");

        // Entrada de dados
        System.out.println("Informe a hora atual (apenas a hora): ");
        int h = in.nextInt();
        System.out.println("Informe os minutos atuais (apenas os minutos): ");
        int m = in.nextInt();
        System.out.println("Informe os segundos atuais (apenas os segundos): ");
        int s = in.nextInt();

        // Chamada do método 'segundos'
        int total = Class4.segundos(h, m, s);

        // Saída de dados
        System.out.println("O tempo total, em segundos, desde que o dia começou, é " + total + " segundos.");
    }
}
