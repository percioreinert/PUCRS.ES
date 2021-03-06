import java.util.Scanner;
public class Loop18 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // Entrada de dados e variáveis
        int exp;
        double x;
        do {
            System.out.println("Informe um valor inteiro e positivo para servir de expoente: ");
            exp = in.nextInt();
            System.out.println("Informe um valor para \"X\": ");
            x = in.nextDouble();
        } while (exp < 0);

        // Loop
        double i = 1, j = 1, soma = 0;
        while (i <= exp) {
            soma += (Math.pow(x, i) / j);
            j += 4;
            i++;
        }

        // Saída de dados
        System.out.println("A soma das frações com expoente até " + exp + " é: " + soma);
    }
}
