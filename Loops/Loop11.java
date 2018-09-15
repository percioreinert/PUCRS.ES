/*
 Faça um programa que leia um valor inteiro e positivo e escreva os divisores
 desse valor.
 */
import java.util.Scanner;
public class Loop11 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // Limpeza de tela
        System.out.print("\f");

        // Entrada de dados e variáveis
        int num = 0;
        do {
            if (num < 0) System.out.println("ERRO! O número deve ser positivo!");
            System.out.println("Informe um valor inteiro e positivo: ");
            num = in.nextInt();
        } while (num < 0);

        // Loop e saída de dados
        int i = 1;
        while (i <= num) {
            if (num % i == 0) {
                System.out.println(i + " é um divisor de " + num + ".");
            }
            i++;
        }
    }
}