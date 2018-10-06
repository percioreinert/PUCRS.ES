package Methods13;

public class Class13 {

    // Método novo salário
    public static double newSalary(double salary, double percent) {
        return salary * (1 + percent / 100);
    }

    // Método casos
    public static void job(double salary, int job) {
        double newSalary;
        switch (job) {
            case 101: newSalary = newSalary(salary, 6);
                System.out.println("O percentual de aumento para esse funcionário é de 6%.");
                System.out.println("Com isso, o novo salário será de " + newSalary);
                System.out.println("E a diferença entre o novo salário e o antigo será de " + difference(salary, newSalary));
                break;
            case 102: newSalary = newSalary(salary, 7);
                System.out.println("O percentual de aumento para esse funcionário é de 7%.");
                System.out.println("Com isso, o novo salário será de " + newSalary);
                System.out.println("E a diferença entre o novo salário e o antigo será de " + difference(salary, newSalary));
                break;
            case 103: newSalary = newSalary(salary, 8);
                System.out.println("O percentual de aumento para esse funcionário é de 8%.");
                System.out.println("Com isso, o novo salário será de " + newSalary);
                System.out.println("E a diferença entre o novo salário e o antigo será de " + difference(salary, newSalary));
                break;
            case 104: newSalary = newSalary(salary, 9.5);
                System.out.println("O percentual de aumento para esse funcionário é de 9,5%.");
                System.out.println("Com isso, o novo salário será de " + newSalary);
                System.out.println("E a diferença entre o novo salário e o antigo será de " + difference(salary, newSalary));
                break;
            default: newSalary = newSalary(salary, 5);
                System.out.println("O percentual de aumento para esse funcionário é de 5%.");
                System.out.println("Com isso, o novo salário será de " + newSalary);
                System.out.println("E a diferença entre o novo salário e o antigo será de " + difference(salary, newSalary));
                break;
        }
    }

    // Método diferença
    public static double difference(double salary, double newSalary) {
        return newSalary - salary;
    }
}
