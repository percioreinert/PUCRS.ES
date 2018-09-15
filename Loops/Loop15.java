/*
 A prefeitura de uma cidade fez uma pesquisa entre seus habitantes, coletando
 dados sobre o salário e número de filhos. A prefeitura deseja saber:
 (a) média do salário da população;
 (b) média do número de filhos;
 (c) maior salário;
 (d) percentual de pessoas com salário até R$2000,00.
 Faça um programa que leia os dados necessários e escreva os itens mencionados.
 O final da leitura de dados se dará com a entrada de um salário
 negativo. (Use while)
 */
import java.util.Scanner;
public class Loop15 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.print("\f");

        // Variáveis e entrada de dados
        System.out.println("Informe o número de habitantes: ");
        int hab = in.nextInt();

        // Loop
        int i = 1;
        double somaS = 0, somaF = 0, maiorS = 0, somaP = 0;
        loop: while (i <= hab) {
            System.out.println("Informe o salário da " + i + "ª pessoa: ");
            double salario = in.nextDouble();
            if (salario < 0) {
                System.out.println("O salário deve ser positivo!");
                continue loop; // Se o salário for menor do que 0, refaz o loop
            }
            System.out.println("Informe o número de filhos da " + i + "ª pessoa: ");
            int filhos = in.nextInt();
            if (salario > maiorS) maiorS = salario;
            if (salario <= 2000) somaP++;
            somaS += salario;
            somaF += filhos;
            i++;
        }

        // Saída de dados
        System.out.println("A média dos salários da população é de R$ " + (somaS / hab) + " reais");
        System.out.println("A média de filhos entre a população é de " + (somaF / hab) + " filhos");
        System.out.println("O maior salário da população é de R$ " + maiorS + " reais");
        System.out.println("O percentual de pessoas com salário até R$ 2.000,00 é de " + ((somaP / hab) * 100) + "%");
    }
}