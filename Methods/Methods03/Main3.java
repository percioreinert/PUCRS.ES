package Methods03;

import java.util.Scanner;
public class Main3 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // Entrada de dados
        System.out.println("Informe a largura da casa: ");
        double largCasa = in.nextDouble();
        System.out.println("Informe o comprimento da casa: ");
        double compCasa = in.nextDouble();
        System.out.println("Informe a largura do terreno: ");
        double largTerr = in.nextDouble();
        System.out.println("Informe o comprimento do terreno: ");
        double compTerr = in.nextDouble();

        // Chamada do método 'area'
        double areaCasa = Class3.area(largCasa, compCasa);
        double areaTerr = Class3.area(largTerr, compTerr);

        // Saída de dados
        System.out.println("A área da casa é " + areaCasa);
        System.out.println("A área do terreno é " + areaTerr);
        System.out.println("A área livre é " + (areaTerr - areaCasa));
    }
}
