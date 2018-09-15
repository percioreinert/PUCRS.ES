/*
 Em uma eleição presidencial existem quatro candidatos. Os votos são
 informados através de códigos. Os dados utilizados para a contagem dos
 votos obedecem a seguinte codicação:
 • 1,2,3,4 = voto para os respectivos candidatos;
 • 0 = voto branco;
 • qualquer valor diferente de 0 a 4 = voto nulo;
 Elabore um programa que leia o código do candidado em um voto. Calcule e escreva:
 • total de votos para cada candidato;
 • total de votos nulos;
 • total de votos em branco;
 Como nalizador do conjunto de votos, utilize valores negativos.
 */
import java.util.Scanner;
public class Loop26 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // Limpeza de tela
        System.out.print("\f");

        // Loop e menu
        int voto, b = 0, c = 0, j = 0, m = 0, p = 0, n = 0;
        for ( ; ; ) {
            System.out.println("Digite o número do seu candidato:\n0 - Branco\n1 - Creisson\n2 - Joecleson\n3 - Maicousson\n4 - Pércio");
            voto = in.nextInt();
            if (voto < 0) break;
            switch (voto) {
                case 0: b += 1;
                    break;
                case 1: c += 1;
                    break;
                case 2: j += 1;
                    break;
                case 3: m += 1;
                    break;
                case 4: p += 1;
                    break;
                default: n +=1;
            }
        }
        System.out.println("O total de votos em branco é " + b);
        System.out.println("O total de votos em Creisson é " + c);
        System.out.println("O total de votos em Joeclesson é " + j);
        System.out.println("O total de votos em Maicousson é " + m);
        System.out.println("O total de votos em Pércio é " + p);
        System.out.println("O total de votos nulos é " + n);
    }
}