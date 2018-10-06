package Recursive09;

public class Recursive09 {

    // Método recursivo
    public static int pot(int x, int y) {
        if (y == 0) return 1;
        else if (y == 1) return x;
        else return pot(x, (y - 1)) * x;
    }
}
