package Archives04;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Archives4 {
    // Método somatório
    public static int somatorio(int num) {
        int somatorio = 0;
        for (int i = num; i >= 1; i--) {
            somatorio += num;
        }
        return somatorio;
    }

    // Método fatorial
    public static int fatorial(int num) {
        int fatorial = -1;
        if (num < 171) {
            fatorial = 1;
            for (int i = num; i > 1; i--) {
                fatorial *= num;
            }
            return fatorial;
        }
        return fatorial;
    }

    // Método inteiros2
    public static void inteiros2(String nome) throws FileNotFoundException {
        File origin = new File(nome);
        Scanner archive = new Scanner(origin);

        while (archive.hasNextLine()) {
            String line = archive.nextLine();
            int num = Integer.parseInt(line);
            somatorio(num);
            fatorial(num);
            if (fatorial(num) < 1) System.out.println("Não foi possível calcular o fatorial de " + num);
            else System.out.println("O fatorial de " + num + " é " + fatorial(num));
            System.out.println("O somatório de " + num + " é " + somatorio(num));
        }
    }

    // Main
    public static void main(String args[]) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);

        // Entrada de dados
        System.out.println("Informe o nome do arquivo: ");
        String nome = in.nextLine();

        // Saída de dados e chamada do método inteiros2
        inteiros2(nome);
    }
}
