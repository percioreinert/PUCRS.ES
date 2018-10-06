package Methods15;

import java.util.Scanner;

public class Main15 {
    // Main
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // Entrada de dados
        double grades[] = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Informe a " + (i + 1) + "ª nota: ");
            grades[i] = in.nextDouble();
        }

        System.out.println("Informe a média dos exercícios: ");
        double exercisesAverage = in.nextDouble();

        // Atribuição das notas em variáveis primitivas
        double grade1 = grades[0];
        double grade2 = grades[1];
        double grade3 = grades[2];

        // Saída de dados e chamada dos métodos
        double average = Class15.average(grade1, grade2, grade3, exercisesAverage);
        System.out.println("A média das notas é " + average);
        Class15.grade(average);
    }
}
