package Archives03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Archives3 {
    // Método números pares
    public static boolean pares(int num) {
        if (num % 2 == 0) return true;
        else return false;
    }

    public static boolean primos(int num) {
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        int limit = (int) Math.sqrt(num);
        for (int i = 3; i <= limit; i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void inteiros(String nome) throws FileNotFoundException {
        File origin = new File(nome);
        Scanner archive = new Scanner(origin);

        while (archive.hasNextLine()) {
            String linha = archive.nextLine();
            int num = Integer.parseInt(linha);
            if (pares(num)) System.out.println(num + " é um número par.");
            if (primos(num)) System.out.println(num + " é um número primo.");
        }
    }

    public static void main(String args[]) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe o nome do arquivo: ");
        String nome = in.nextLine();
        inteiros(nome);
    }
}
