package Methods17;

import java.util.Scanner;

public class Main17 {
    // Main
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.print("\f");

        // Entrada de dados
        System.out.println("Informe o número de bolinhas: ");
        int balls = in.nextInt();
        System.out.println("Informe o tamanho das bolinhas, sendo\n1 - Pequena\n2 - Média\n3 - Grande");
        int size = in.nextInt();

        // Saída de dados e chamada do método boxes
        System.out.println("A quantidade de caixas necessárias é de " + Class17.boxes(balls, size));
    }
}
