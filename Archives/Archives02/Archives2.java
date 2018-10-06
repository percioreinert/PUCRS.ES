package Archives02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Archives2 {
    public static double greater(double first, double second) {
        double greater = first;
        if (second > greater) greater = second;
        return greater;
    }

    public static double smaller(double first, double second) {
        double smaller = first;
        if (second > smaller) smaller = second;
        return smaller;
    }

    public static double average(double [] array) {
        double soma = 0;
        for (int i = 0; i < array.length; i++) {
            soma += array[i];
        }
        double average = soma / array.length;
        return average;
    }

    public static void reais(String nome) throws FileNotFoundException {
        File origin = new File(nome);
        Scanner archive = new Scanner(origin);

        double maior = 0;
        double menor = Integer.MAX_VALUE;
        int i = 0, j = 0;;
        //while (archive.hasNextLine()) j++;
        System.out.print(j);
        double [] array = new double[201];
        while (archive.hasNextLine()) {
            String linha = archive.nextLine();
            double value = Double.parseDouble(linha);
            maior = greater(maior, value);
            menor = smaller(menor, value);
            array[i] = value;
            i++;
        }
        System.out.println("O maior número encontrado é: " + maior);
        System.out.println("O menor número encontrado é: " + menor);
        System.out.println("A média dos valores é: " + average(array));
    }

    public static void main(String args[]) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe o nome do arquivo: ");
        String linha = in.nextLine();

        reais(linha);
    }
}
