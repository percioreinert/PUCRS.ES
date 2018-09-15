/*
 Foi feita uma pesquisa entre os habitantes de uma região. Foram coletados
 os dados de idade, sexo (1-masculino/2-feminino) e salário. Faça um
 programa que leia os dados necessário e informe:
 (a) a média de salário do grupo;
 (b) maior e menor idade do grupo;
 (c) quantidade de mulheres com salário até R$3500,00.
 Encerre a entrada de dados quando for digitada uma idade negativa.
 */
import java.util.Scanner;
public class Loop27 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // Limpeza de tela
        System.out.print("\f");
        int i = 0, j = 0, idade, maiorI = 0, menorI = Integer.MAX_VALUE, genero;
        double salario, somaS = 0;
        for ( ; ; ) {
            System.out.println("Informe a idade: ");
            idade = in.nextInt();
            if (idade < 0) break;
            System.out.println("Informe o gênero, sendo:\n1 - Masculino\n2 - Feminino");
            genero = in.nextInt();
            System.out.println("Informe o salário: ");
            salario = in.nextDouble();
            somaS += salario;
            if (idade < menorI) menorI = idade;
            if (idade > maiorI) maiorI = idade;
            if (genero == 2 && salario < 3500) {
                j++;
            }
            i++;
        }

        // Saída de dados
        System.out.println("A média dos salários foi de " + (somaS / i));
        System.out.println("A menor idade encontrada foi " + menorI);
        System.out.println("A maior idade encontrada foi " + maiorI);
        System.out.println("A quantidade de mulheres com salário abaixo de R$ 3500,00 é " + j);
    }
}