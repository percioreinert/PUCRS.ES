/*
 Faça um programa que leia dois valores inteiros e positivos 'a' e 'b'. A
 seguir, o programa deve escrever a soma dos pares entre 'a' e 'b' (inclusive).
 */
import java.util.Scanner;
public class Loop09 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // Limpeza de tela
        System.out.println("\f");

        // Variáveis e entrada de dados
        int a = 0, a1, b = 0, b1, soma = 0;;
        do {
            if (a < 0) System.out.println("ERRO! O número deve ser positivo!");
            System.out.println("Informe o 1º valor inteiro e positivo: ");
            a = in.nextInt();
            a1 = a;
        } while (a < 0);
        do {
            if (b < 0) System.out.println("ERRO! O número deve ser positivo!");
            System.out.println("Informe o 2º valor inteiro e positivo: ");
            b = in.nextInt();
            b1 = b;
        } while (b < 0);

        // Loop
        if (a <= b) {
            while (a <= b) {
                if (a % 2 == 0) {
                    soma += a;
                }
                a++;
            }
        } else {
            while (b <= a) {
                if (b % 2 == 0) {
                    soma += b;
                }
                b++;
            }
        }

        // Saída de dados
        System.out.println("A soma dos números pares entre " + a1 + " e " + b1 + " é: " + soma + ".");
    }
}