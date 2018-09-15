/*
 Faça um programa que exibe a tabela de conversão de Celsius para Fahrenheit,
 como a apresentada a seguir:
 Celsius Fahrenheit
   0        32
   10       50
   20       68
   ...      ...
   100      212
 */
import java.util.Scanner;
public class Loop13 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("\f");
        // Variáveis
        int celsius = 0;
        double fahrenheit = 0;

        // Tabela e loop

        while (celsius <= 100) {
            fahrenheit = celsius + 32 + (celsius * 8 / 10);
            int f = (int) fahrenheit, c = (int) celsius;
            System.out.println("\tCelsius: " + "\tFahrenheit:\n " + "\t   " + c + "\t\t    " + f);
            celsius += 10;
        }
    }
}