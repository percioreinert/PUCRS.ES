package POO01;

import java.util.Scanner;
public class AppEsfera {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // Entrada de dados
        System.out.println("\fInforme o raio da esfera: ");
        double raio = in.nextDouble();

        // Inicialização e atribuição do objeto esfera1
        Esfera esfera1 = new Esfera(raio);

        // Saída de dados
        System.out.println("O raio atual da esfera1 é: " + esfera1.getRaio());
        System.out.println("O volume atual da esfera é de: " + esfera1.volume());
        System.out.println("A área atual da esfera é de: " + esfera1.area());

        // Modificação do raio
        System.out.println("Informe o novo valor do raio: ");
        raio = in.nextDouble();
        esfera1.setRaio(raio);

        // Nova saída de dados
        System.out.println("O raio atual da esfera1 é: " + esfera1.getRaio());
        System.out.println("O volume atual da esfera é de: " + esfera1.volume());
        System.out.println("A área atual da esfera é de: " + esfera1.area());
    }
}