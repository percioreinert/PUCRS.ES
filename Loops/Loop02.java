/*
 Faça um programa que escreve todos os pares entre 1000 e 2000.
 */
public class Loop02 {
    public static void main(String args[]) {

        // Variáveis
        int i = 1000;

        // Loop e saída de dados
        while (i <= 2000) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
