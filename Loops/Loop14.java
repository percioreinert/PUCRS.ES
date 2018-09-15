/*
Faça um programa que escreve o calendário do mês de abril de 2015.
Seg Ter Qua Qui Sex Sab Dom
         1   2   3   4   5
 6   7   8   9   10  11  12
 13  14  15  16  17  18  19
 20  21  22  23  24  25  26
 27  28  29  30
 */
import java.util.Scanner;
public class Loop14 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("\f");

        int i = 1, j = 1, h = 0; // i = dias da semana e j = dias do mês.
        System.out.println("\tSEG" + "\tTER" + "\tQUA" + "\tQUI" + "\tSEX" + "\tSAB" + "\tDOM");
        System.out.print("\t\t");
        while (i <= 7) {
            while (j <= 30) {
                if (j < 10) System.out.print("  ");
                switch (i) {
                    case 1: System.out.print("\t" + j);
                        break;
                    case 2: System.out.print("\t" + j);
                        break;
                    case 3: System.out.print("\t" + j);
                        break;
                    case 4: System.out.print("\t" + j);
                        break;
                    case 5: System.out.print("\t" + j);
                        break;
                    case 6: System.out.print("\t" + j);
                        break;
                    case 7: System.out.print("\t" + j);
                        break;
                }
                j++;
                if (j == 6 || j == 13 || j == 20 || j == 27) {
                    System.out.println();
                }
            }
            h++;
            i++;
            if (i == 7) {
                i = 1;
            }
            if (h == 3) break;
        }
    }
}