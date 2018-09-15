/*
 Elabore um programa que escreve 50 valores acima de 100 que são divisiveis
 por 7.
 */
import java.util.Scanner;
public class Loop07 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // Variáveis
        int i = 100, j = 0;

        // Loop e saída de dados
        while (i > j) {
            if (i % 7 == 0) {
                System.out.println(i);
                j++;
            }
            if (j == 50) break;
            i++;
        }
    }
}
