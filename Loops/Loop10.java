/*
 Implemente um programa que leia um valor inteiro, não negativo e escreva
 o seu fatorial e seu somatório.
 */
import java.util.Scanner;
public class Loop10 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // Limpeza de tela
        System.out.print("\f");

        // Entrada de dados e variáveis
        int num = 0, num1, somatorio = 0, fatorial = 1;
        do {
            if (num < 0) System.out.println("ERRO! O valor deve ser positivo!");
            System.out.println("Informe o valor inteiro e positivo: ");
            num = in.nextInt();
            num1 = num;
        } while (num < 0);

        // Loop
        while (num >= 1) {
            somatorio += num;
            fatorial *= num;
            num--;
        }

        // Saída de dados
        System.out.println("O somatório dos números entre 1 e " + num1 + " é: " + somatorio);
        System.out.println("O fatorial de " + num1 + " é: " + fatorial);
    }
}