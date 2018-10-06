package Methods11;

import java.util.Scanner;

public class Main11 {
    // Main
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // Entrada de valor
        System.out.println("Informe o seu saldo: ");
        double saldo = in.nextDouble();

        // Chamada do método crédito e saída de dados
        Class11.credito(saldo);
    }
}
