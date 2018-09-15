import java.util.Scanner;
public class Loop16 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // Entrada de dados e variáveis
        int num;
        do {
            System.out.println("Informe um valor inteiro e positivo: ");
            num = in.nextInt();
        } while (num < 0);

        // Loop
        double i = 1;
        double soma = 0;
        while (i <= num) {
            soma += (1/i);
            i++;
        }
        // Saída de dados
        System.out.println("A soma das frações até " + num + " é: " + soma);

    }
}
