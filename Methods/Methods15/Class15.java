package Methods15;

public class Class15 {

    // Método
    public static double average(double grade1, double grade2, double grade3, double exercisesAverage) {
        return (grade1 + (grade2 * 2) + (grade3 * 3) + exercisesAverage) / 7;
    }

    // Método
    public static void grade(double finalGrade) {
        if (finalGrade < 4.0) {
            System.out.println("Conceito E.");
            System.out.println("Reprovado.");
        } else if (finalGrade < 6.0) {
            System.out.println("Conceito D.");
            System.out.println("Reprovado.");
        } else if (finalGrade < 7.5) {
            System.out.println("Conceito C.");
            System.out.println("Aprovado.");
        } else if (finalGrade < 9.0) {
            System.out.println("Conceito B.");
            System.out.println("Aprovado.");
        } else {
            System.out.println("Conceito A.");
            System.out.println("Aprovado.");
        }
    }
}
