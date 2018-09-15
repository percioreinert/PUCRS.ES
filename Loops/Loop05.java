/*
 Implemente um programa que leia um valor n e escreva todos os quadrados
 perfeitos menores que n. Exemplo : n=100, escreve 1, 4, 9, 16, 25, 36, 49,
 81.
 */
import java.util.Scanner;
public class Loop05 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // Entrada de dados e variáveis
        System.out.println("Informe um valor inteiro");
        int num = in.nextInt();
        int i = 0;

        // Loop e saída de dados
        while (i < num) {
            double pot = Math.pow(i, 2);
            if (pot < num) {
                int p = (int) pot;
                System.out.println(p);
            }
            i++;
        }
    }
}
