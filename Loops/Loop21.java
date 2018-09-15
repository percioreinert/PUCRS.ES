/*
 Faça um programa que gere todos os números inteiros de 4 digitos que
 possuem a mesma característica que o número 3025.

 30 + 25 = 55
 552 = 3025
 */
public class Loop21 {
    public static void main(String args[]) {

        // Limpeza de tela
        System.out.print("\f");

        // Loop
        int a = 1000, pri, seg;
        loop: for (; ;) {
            String b = Integer.toString(a);
            if (b.length() > 4) {
                System.out.println("Fim");
                break loop;
            }
            pri = a / 100;
            seg = a % 100;
            if (Math.pow((pri + seg), 2) == a) {
                System.out.println(a);
            }
            a++;
        }
    }
}