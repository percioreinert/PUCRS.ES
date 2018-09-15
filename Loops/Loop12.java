/*
 Implemente um programa que lê um valor inteiro positivo qualquer, calcula
 e escreve a soma dos dígitos ímpares desse valor. Exemplo: valor = 32677,
 soma = 3+7+7=17.
 */
import java.util.Scanner;
public class Loop12 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // Entrada de dados e variáveis
        int num, soma = 0;
        do {
            System.out.println("Informe um valor inteiro e positivo: ");
            num = in.nextInt();
        } while (num < 0);

        // Contagem da quantidade de dígitos
        String digito = Integer.toString(num);
        int i = 0, j = digito.length(), b;
        char a;

        // Loop e verificação
        while (i < j) {
            a = digito.charAt(i); // Coloca o dígito da posição "i" como char.
            b = Character.getNumericValue(a); // Coloca o char "a" como int.
            if (b % 2 != 0) {
                soma += b;
            }
            i++;
        }

        // Saída de dados
        System.out.println("A soma dos dígitos ímpares de " + num + " é: " + soma);
    }
}
