/*
 Faça um programa que leia uma quantidade não determinada de números
 positivos. Calcule a quantidade de números pares e ímpares, a média de
 valores pares e a média geral dos números lidos. O número que encerrará
 a leitura será zero.
 */
import java.util.Scanner;
public class Loop25 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // Limpeza de tela 17
        System.out.print("\f");

        double soma = 0, somaP = 0, somaI = 0;
        int i = 0, j = 0, h = 0;
        loop: for ( ; ; ) {
            double a = Math.random();
            System.out.println(a);
            if (a % 2 == 0) {
                somaP += a;
                j++;
            } else {
                somaI += a;
                h++;
            }
            soma += a;
            i++;
            if (a == 0.0) break loop;
        }

        // Saída de dados
        System.out.println("O total de números pares gerados foi de " + j);
        System.out.println("O total de números ímpares gerados foi de " + h);
        System.out.println("A média dos números pares gerados foi de " + (somaP / j));
        System.out.println("A média dos números ímpares gerados foi de " + (somaI / h));
        System.out.println("A média de todos os números pares gerados foi de " + (soma / i));
    }
}