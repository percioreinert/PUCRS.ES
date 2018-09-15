/*
 Chico tem 1,50 metro e cresce 2 centímetros por ano, enquanto Zé tem
 1,10 metro e cresce 3 centímetros por ano. Construa um programa que
 calcule e exiba quantos anos serão necessários para que Zé seja maior que
 Chico.
 */
import java.util.Scanner;
public class Loop23 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // Limpeza de tela
        System.out.print("\f");

        // Variáveis
        int anos = 0;
        double altC = 1.50, altZ = 1.10;
        while (altZ <= altC) {
            altC += 0.02;
            altZ += 0.03;
            anos++;
        }

        // Saída de dados
        System.out.println("A número de anos necessários para Zé ser maior do que Chico é " + anos);
    }
}