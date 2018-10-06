package Methods10;

public class Class10 {

    // Método peso ideal
    public static double pesoIdeal(double altura, int genero) {
        double p;
        if (genero == 1) {
            p = (72.7 * altura) - 58;
        } else {
            p = (62.1 * altura) - 44.7;
        }
        return p;
    }
}
