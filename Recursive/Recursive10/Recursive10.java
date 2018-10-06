package Recursive10;

public class Recursive10 {

    // Método recursivo
    public static int produto(int x, int y) {
        if (x < 2) return y;
        else if (x < 1) return 0;
        else return produto((x - 1), y) + y;
    }
}
