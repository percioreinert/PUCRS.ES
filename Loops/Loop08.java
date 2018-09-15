/*
 Implemente um programa que lê 50 valores inteiros e positivos, calcule e
 escreva:
 (a) a média dos valores;
 (b) o maior deles;
 (c) o menor deles;
 (d) a quantidade de valores que estão no intervalo [0;10].
 */
import java.util.Scanner;
public class Loop08 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // Entrada de dados, loop de controle e variáveis
        int i = 0, j = 0, num = 0, soma = 0, maior = 0, menor = Integer.MAX_VALUE;
        while (i < 50) {
            do {
                System.out.println("Informe o " + (i + 1) + "º valor: ");
                num = in.nextInt();
                // Soma dos números para se fazer a média
                if (num >= 0) soma += num;
                // Verificação para armazenar o maior número
                if (num > maior && num >= 0) maior = num;
                // Verificação para encontrar o menor número
                if (num < menor && num >= 0) menor = num;
                // Verificação da quantidade de números entre 0 e 10
                if (num >= 0 && num <= 10) j++;
            } while (num <= 0);
            i++;
        }
        // Saída de dados
        // Média
        double media = soma / 50;
        System.out.println("A média dos valores é " + media);

        // Maior
        System.out.println("O maior número informado é " + maior);

        // Menor
        System.out.println("O menor número informado é " + menor);

        // Quantidade entre 0 e 10
        System.out.println("A quantidade de valores entre 0 e 10, inclusive, é: " + j);
    }
}
