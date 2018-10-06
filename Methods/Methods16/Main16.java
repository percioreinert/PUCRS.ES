package Methods16;

import java.util.Scanner;

public class Main16 {
    // Main
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // Entrada de dados
        System.out.println("Informe o seu salário: ");
        double salary = in.nextDouble();

        // Saída de dados e chamada do método inss
        System.out.print("A alíquota que você deve pagar ao INSS é de R$");
        System.out.printf("%.2f", Class16.inss(salary));
        System.out.println(" reais");
    }
}
