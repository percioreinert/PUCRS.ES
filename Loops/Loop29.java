/*
 Faça um programa que leia um valor inteiro n maior que 50 (garanta isso).
 A seguir, o programa deve escrever para cada valor inteiro entre 1 e n: o
 valor, seu quadrado, seu cubo, sua raiz quadrada e sua raiz cúbica.
 */
import java.util.Scanner;
public class Loop29 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // Limpeza de tela
        System.out.print("\f");
        int num = 0;
        double teste;
        entrada: do {
            System.out.println("Informe um valor maior que 50: ");
            teste = in.nextDouble();
            if (teste % 1 != 0) {
                System.out.println("O valor deve ser inteiro!");
                continue entrada;
            } else num = (int) teste;
        } while (teste < 50);

        int i = 1;
        while (i <= num) {
            System.out.println(i);
            System.out.println("O quadrado de " + i + " é " + Math.pow(i, 2));
            System.out.println("O cubo de " + i + " é " + Math.pow(i, 3));
            System.out.println("A raiz quadrada de " + i + " é " + Math.sqrt(i));
            System.out.println("A raiz cúbica de " + i + " é " + Math.cbrt(i));
            i++;
        }
    }
}