/*
 Faça um programa que leia 2 valores inteiros e positivos: x e y. O programa
 deve calcular e escrever a função potência x e y.
 (não use a função Math.pow).
 */
import java.util.Scanner;
public class Loop22 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // Limpeza de tela
        System.out.print("\f");

        // Entrada de dados e variáveis
        double x1, y1;
        int x = 0, y = 0;
        entrada1: do {
            System.out.println("Informe o valor para \'x\': ");
            x1 = in.nextDouble();
            if (x1 % 1 != 0) { // Teste para ver se o número é inteiro
                System.out.println("O valor deve ser inteiro!");
                continue entrada1;
            } else x = (int) x1;
        } while (x1 < 0);

        entrada2: do {
            System.out.println("Informe o valor para\'y\': ");
            y1 = in.nextDouble();
            if (y1 % 1 != 0) { // Teste para ver se o número é inteiro
                System.out.println("O valor deve ser inteiro!");
                continue entrada2;
            } else y = (int) y1;
        } while (y1 < 0);

        // Cálculo
        int i = 1;
        int pot = 1;
        while (i <= y) {
            pot *= x;
            i++;
        }

        // Saída de dados
        System.out.println(x + " elevado a " + y + " é: " + pot);
    }
}