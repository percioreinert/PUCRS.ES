package Methods07;

public class Class7 {

    // Método cálculo da diagonal de um paralelepípedo
    public static double diagonal(double a, double b, double c) {
        double d = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
        return d;
    }
}
