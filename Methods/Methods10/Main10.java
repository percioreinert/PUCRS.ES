package Methods10;

import java.util.Scanner;

public class Main10 {
    // Main
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // Entrada de dados
        System.out.println("Informe a sua altura (em metros): ");
        double altura = in.nextDouble();
        System.out.println("Informe o seu gênero:\n1 - Masculino\n2 - Feminino");
        int genero = in.nextInt();

        // Chamada do método peso ideal
        double pesoIdeal = Class10.pesoIdeal(altura, genero);

        // Saída de dados
        System.out.println("O seu peso ideal é: " + pesoIdeal);
    }
}
