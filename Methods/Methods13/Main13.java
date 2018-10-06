package Methods13;

import java.util.Scanner;

public class Main13 {
    // Main
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // Entrada de dados
        System.out.println("Informe o salário do funcionário: ");
        double salary = in.nextDouble();
        System.out.println("Informe o cargo do funcionário:\n101 - tal\n102 - outro tal\n103 - mais um tal\n104 - último tal: ");
        int job = in.nextInt();

        // Saída de dados e chamada dos métodos
        Class13.job(salary, job);
    }
}
