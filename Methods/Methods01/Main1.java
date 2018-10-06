package Methods01;

import java.util.Scanner;
public class Main1 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // Entrada de dados
        System.out.println("Informe 3 valores: ");
        double num1 = in.nextDouble();
        double num2 = in.nextDouble();
        double num3 = in.nextDouble();

        // Chamada do método media e saída de dados
        System.out.println("A média dos 3 valores é " + Class1.media(num1, num2, num3));
    }
}
