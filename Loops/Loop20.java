/*
 Faça um programa que escreve os n primeiros termos da série de bonacci:
 1, 1, 2, 3, 5, 8, 13, 21, ...
 */
import java.util.Scanner;
public class Loop20 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // Limpeza de tela
        System.out.print("\f");

        // Entrada de dados
        int n;
        System.out.println("Informe o número  de Fibonacci's que você quer que sejam apresentados: ");
        n = in.nextInt();

        // Loop Fibonacci
        int i = 1, j = 0, h = 0, fibo;
        while (i <= n) {
            if (i == 1) {
                System.out.print(i + " ");
                j = i;
            }
            fibo = j + h;
            System.out.print(fibo + " ");
            if (h > 0) j = h;
            h = fibo;
            i++;
        }
    }
}
