package Archives01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Archives1 {
    public static void fruit(String nome) throws FileNotFoundException {
        File origin = new File(nome);
        Scanner archive = new Scanner(origin);

        while (archive.hasNextLine()) {
            String linha = archive.nextLine();
            if (linha.charAt(0) == 'a' || linha.charAt(0) == 'A') {
                System.out.println(linha);
            }
        }
        archive.close();
    }

    // Main
    public static void main(String args[]) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);

        System.out.print("Informe o nome do arquivo: ");
        String nomeArquivo = in.nextLine();
        fruit(nomeArquivo);
    }
}
