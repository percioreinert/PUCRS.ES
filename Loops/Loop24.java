/*
 Uma loja tem 150 clientes cadastrados e deseja mandar uma correspondência
 eletrônica a cada um deles anunciando um bônus especial. Escreva um
 programa que leia o nome do cliente e o valor das suas compras no ano
 passado e calcule um bônus de 10% se o valor das compras for menor que
 R$ 500,00 e de 20 %, caso contrário.
 */
import java.util.Scanner;
public class Loop24 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // Limpeza de tela
        System.out.print("\f");

        // Entrada de dados e loop
        int i = 1;
        String nome;
        double compras;
        while (i <= 150) {
            System.out.println("Informe o nome do cliente: ");
            nome = in.next();
            System.out.println("Informe o valor das compras do ano passado desse cliente: ");
            compras = in.nextDouble();
            if (compras < 500) {
                System.out.println("Parabéns, " + nome + "! Você foi contemplado(a) com um bônus de 10% para as compras desse ano!");
            } else System.out.println("Parabéns, " + nome + "! Você foi contemplado com um bônus de 20% para as compras desse ano!");
            i++;
            System.out.println();
        }
    }
}