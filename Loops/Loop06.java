/*
 Faça um programa que gere o números de 1000 a 1999 e escreva aqueles
 que divididos por 11 dão resto igual a 5.
 */
public class Loop06 {
    public static void main(String args[]) {

        // Variáveis
        int i = 1000;

        // Loop e saída de dados
        while (i <= 1999) {
            if (i % 11 == 5) {
                System.out.println(i);
            }
            i++;
        }
    }
}
