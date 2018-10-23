package POO02;

import java.util.Scanner;
public class AppRetangulo {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // Entrada de dados
        System.out.println("\fInforme a base do retângulo: ");
        double base = in.nextDouble();
        System.out.println("Informe a altura do retângulo: ");
        double altura = in.nextDouble();

        // Inicialização e atribuição do objeto retangulo1
        Retangulo retangulo1 = new Retangulo(base, altura);

        // Escolha da operação
        int escolha = 0;
        do {
            System.out.println("Escolha a operação:\nCálculo da área: 1\nCálculo do perímetro: 2\nCálculo da diagonal: 3");
            escolha = in.nextInt();
            switch (escolha) {
                case 1: System.out.println("A área do retângulo é: " + retangulo1.area());
                    break;
                case 2: System.out.println("O perímetro do retângulo é: " + retangulo1.perimetro());
                    break;
                case 3: System.out.println("A diagonal do retângulo é: " + retangulo1.diagonal());
                    break;
                default: System.out.println("ERRO. Você deve escolher dentre as opções apresentadas: ");
            }
        } while (escolha < 1 || escolha > 3);
    }
}