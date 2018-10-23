package POO08;

import java.util.Scanner;
public class AppConta {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe o número da conta: ");
        String conta = in.nextLine();

        Conta numero1 = new Conta(conta);
        System.out.println(numero1.digit(conta));
    }
}
