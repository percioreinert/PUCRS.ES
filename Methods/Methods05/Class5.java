package Methods05;

public class Class5 {

    // Método distância Euclidiana
    public static double euclidiana(int x1, int x2, int y1, int y2) {
        double e = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        return e;
    }

    // Método distância de Manhattan
    public static double manhattan(int x1, int x2, int y1, int y2) {
        double m = Math.abs(x1 - x2) + Math.abs(y1 - y2);
        return m;
    }
}
