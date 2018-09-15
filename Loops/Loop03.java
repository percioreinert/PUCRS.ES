/*
 Implemente um programa que soma todos os impares entre 500 e 700.
 */
public class Loop03 {
    public static void main(String args[]) {

        // Variáveis
        int i = 500;

        // Loop e saída de dados
        while (i <= 700) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}