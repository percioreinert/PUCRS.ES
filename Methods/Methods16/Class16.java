package Methods16;

public class Class16 {

    // Método cálculo alíquota INSS
    public static double inss(double salary) {
        if (salary < 1307.07) {
            return salary * 0.08;
        } else if (salary < 2195.13) {
            return salary * 0.09;
        } else return salary * 0.11;
    }
}
